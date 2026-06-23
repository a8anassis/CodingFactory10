package gr.aueb.cf.ch18.bankapp_mysql.bankapp.dao;

import gr.aueb.cf.ch18.bankapp.model.Account;
import gr.aueb.cf.ch18.bankapp_mysql.bankapp.core.DBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class AccountDAOImpl implements IAccountDAO {

    @Override
    public Account saveOrUpdate(Account account) {
        return null;
    }

    public Account insert(Account account) {
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

    public Account update(Account account) {
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

    }

    @Override
    public Optional<Account> findByIban(String iban) {
        return Optional.empty();
    }

    @Override
    public List<Account> findAll() {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public boolean isAccountExists(String iban) {
        return false;
    }
}
