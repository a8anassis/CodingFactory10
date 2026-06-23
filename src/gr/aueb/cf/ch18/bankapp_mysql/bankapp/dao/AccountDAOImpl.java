package gr.aueb.cf.ch18.bankapp_mysql.bankapp.dao;

import gr.aueb.cf.ch18.bankapp.model.Account;
import gr.aueb.cf.ch18.bankapp_mysql.bankapp.core.DBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccountDAOImpl implements IAccountDAO {

    @Override
    public Account saveOrUpdate(Account account) {
        if (isAccountExists(account.getIban())) {
            return update(account);
        } else {
            return insert(account);
        }
    }

    private Account insert(Account account) {
        String sql = "INSERT INTO accounts(iban, balance) VALUES (?, ?)";

        try (Connection conn = DBHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, account.getIban());
            pstmt.setBigDecimal(2, account.getBalance());

            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) {
                return account;
            } else {
                throw new SQLException("Failed to insert account");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error inserting account: " + e.getMessage());
        }
    }

    private Account update(Account account) {
        String sql = "UPDATE accounts set balance = ? WHERE iban = ?";

        try (Connection conn = DBHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setBigDecimal(1, account.getBalance());
            pstmt.setString(2, account.getIban());

            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) {
                return account;
            } else {
                throw new SQLException("Failed to update account");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error updating account: " + e.getMessage());
        }
    }


    @Override
    public void remove(String iban) {
        String sql = "DELETE FROM accounts WHERE iban = ?";

        try (Connection conn = DBHelper.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, iban);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error deleting account: " + e.getMessage());
        }

    }

    @Override
    public Optional<Account> findByIban(String iban) {
        String sql = "SELECT * FROM accounts WHERE iban = ?";

        try (Connection conn = DBHelper.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, iban);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                Account account = new Account();
                account.setIban(rs.getString("iban"));
                account.setBalance(rs.getBigDecimal("balance"));
                return Optional.of(account);
            } else {
                return Optional.empty();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error finding account by IBAN: " + e.getMessage());
        }
    }

    @Override
    public List<Account> findAll() {
        List<Account> accounts = new ArrayList<>();
        String sql = "SELECT * FROM accounts";

        try (Connection conn = DBHelper.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                Account account = new Account();
                account.setIban(rs.getString("iban"));
                account.setBalance(rs.getBigDecimal("balance"));
                accounts.add(account);
            }

            return accounts;
        } catch (SQLException e) {
            throw new RuntimeException("Error finding all accounts: " + e.getMessage());
        }
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public boolean isAccountExists(String iban) {
        String sql = "SELECT 1 FROM accounts WHERE iban = ?";

        try (Connection conn = DBHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, iban);
            ResultSet rs = pstmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            throw new RuntimeException("Error checking account existence: " + e.getMessage());
        }
    }
}
