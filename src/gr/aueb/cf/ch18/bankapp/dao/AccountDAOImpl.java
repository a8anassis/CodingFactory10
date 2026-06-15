package gr.aueb.cf.ch18.bankapp.dao;

import gr.aueb.cf.ch18.bankapp.model.Account;

import java.util.ArrayList;
import java.util.Collections;
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
        return accounts.stream()
                .filter(account -> account.getIban().equals(iban))
                .findFirst();
    }

    @Override
    public List<Account> findAll() {
        return Collections.unmodifiableList(accounts);
    }

    @Override
    public long count() {
        return accounts.size();
    }

    @Override
    public boolean isAccountExists(String iban) {
        return accounts.stream()
                .anyMatch(account -> account.getIban().equals(iban));
    }
}
