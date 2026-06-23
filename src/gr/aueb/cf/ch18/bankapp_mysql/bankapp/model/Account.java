package gr.aueb.cf.ch18.bankapp_mysql.bankapp.model;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Model Entity
 */
public class Account {
    private String iban;
    private BigDecimal balance;

    public Account() {
    }

    public Account(String iban, BigDecimal balance) {
        this.iban = iban;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "IBAN: " + iban + ", Balance: " + balance;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Account account)) return false;
        return Objects.equals(getIban(), account.getIban());    // null safe
//        return this.getIban().equals(account.getIban());      // not null safe
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getIban());
    }
}
