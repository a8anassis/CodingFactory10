package gr.aueb.cf.ch18.bankapp_mysql.bankapp.dao;

import gr.aueb.cf.ch18.bankapp_mysql.bankapp.model.Account;
import gr.aueb.cf.ch18.bankapp_mysql.bankapp.core.DBHelper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccountDAOImpl implements IAccountDAO {

    @Override
    public Account saveOrUpdate(Account account) throws SQLException {

        if (isAccountExists(account.getIban())) {
            return update(account);
        }

        try {
            return insert(account);
        } catch (SQLIntegrityConstraintViolationException e) {
            // Concurrent insert: κάποιο άλλο νήμα πρόλαβε να εισάγει το ίδιο IBAN
            return update(account);
        }
    }

    private Account insert(Account account) throws SQLException {
        String sql = "INSERT INTO accounts(iban, balance) VALUES (?, ?)";

        try (Connection conn = DBHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, account.getIban());
            pstmt.setBigDecimal(2, account.getBalance());

            pstmt.executeUpdate();
            return account;
        } catch (SQLException e) {
            throw new RuntimeException("Error inserting account: " + e.getMessage());
        }
    }

    private Account update(Account account) throws SQLException {
        String sql = "UPDATE accounts set balance = ? WHERE iban = ?";

        try (Connection conn = DBHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setBigDecimal(1, account.getBalance());
            pstmt.setString(2, account.getIban());

            int affectedRows = pstmt.executeUpdate();
            return account;
        }
        catch (SQLException e) {
            throw new RuntimeException("Error updating account: " + e.getMessage());
        }
    }

    @Override
    public void remove(String iban) throws SQLException {
        String sql = "DELETE FROM accounts WHERE iban = ?";

        try (Connection conn = DBHelper.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, iban);
            pstmt.executeUpdate();
        }
    }

    @Override
    public Optional<Account> findByIban(String iban) throws SQLException {
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
        }
    }

    @Override
    public List<Account> findAll() throws SQLException {
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
        }
            return accounts;
        }

    @Override
    public long count() throws SQLException {
        String sql = "SELECT COUNT(*) FROM accounts";

        try (Connection conn = DBHelper.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery()) {

            if (rs.next()) {
                return rs.getLong(1);
            }

            return 0;
        }
    }

    @Override
    public boolean isAccountExists(String iban) throws SQLException {
        String sql = "SELECT 1 FROM accounts WHERE iban = ?";

        try (Connection conn = DBHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, iban);
            ResultSet rs = pstmt.executeQuery();
            return rs.next();
        }
    }
}

