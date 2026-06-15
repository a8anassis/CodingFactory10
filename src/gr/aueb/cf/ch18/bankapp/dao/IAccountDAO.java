package gr.aueb.cf.ch18.bankapp.dao;

import gr.aueb.cf.ch18.bankapp.model.Account;

import java.util.List;
import java.util.Optional;

public interface IAccountDAO {
    Account saveOrUpdate(Account account);
    void remove(String iban);
    Optional<Account> findByIban(String iban);
    List<Account> findAll();
    long count();

    // Queries
    boolean isAccountExists(String iban);
}
