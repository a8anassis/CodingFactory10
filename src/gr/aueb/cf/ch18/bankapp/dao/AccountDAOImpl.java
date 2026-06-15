package gr.aueb.cf.ch18.bankapp.dao;

import gr.aueb.cf.ch18.bankapp.model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccountDAOImpl implements IAccountDAO {
    private final List<Account> accounts = new ArrayList<>();   // datasource

    @Override
    public Account saveOrUpdate(Account account) {
        int index = accounts.indexOf(account);

        // Αν δεν υπάρχει το account
        if (index == -1) {
            accounts.add(account);      // insert
            return account;
        }

        // Αν υπάρχει ήδη το Account
        accounts.set(index, account);   // update
        return accounts.get(index);
    }

    @Override
    public void remove(String iban) {
        accounts.removeIf(account -> account.getIban().equals(iban));
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
