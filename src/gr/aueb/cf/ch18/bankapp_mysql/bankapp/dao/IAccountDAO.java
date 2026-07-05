package gr.aueb.cf.ch18.bankapp_mysql.bankapp.dao;

import gr.aueb.cf.ch18.bankapp_mysql.bankapp.model.Account;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface IAccountDAO {
    Account saveOrUpdate(Account account) throws SQLException;

    void remove(String iban) throws SQLException;

    Optional<Account> findByIban(String iban) throws SQLException ;

    List<Account> findAll() throws SQLException;

    long count() throws SQLException;

    // Queries
    boolean isAccountExists(String iban) throws SQLException ;
}

