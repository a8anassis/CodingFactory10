package gr.aueb.cf.ch14.bankapp;

import java.time.LocalDateTime;
import java.util.Objects;

public class Account {
    private long id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public Account() {
    }

    public Account(long id, String iban, String firstname,
                   String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Public API - Contract


    /**
     * Deposit a specific amount of money into the account.
     *
     * @param amount
     *              the amount of money to deposit.
     * @throws NegativeAmountException
     *              if the amount is negative.
     */
    public void deposit(double amount) throws NegativeAmountException {
        try {
            if (amount < 0) {
                throw new NegativeAmountException("The amount must not be negative.");
            }
            balance += amount;
            // audit trail: who, when, what, initial balance, resulting balance
        } catch (NegativeAmountException e) {
            System.err.printf("Negative amount=%f is not allowed. \n%s\n", amount, e.getMessage());
            throw e;
        }
    }

    /**
     * Withdraw a specific amount of money from the account.
     *
     * @param amount
     *              the amount of money to withdraw.
     * @param ssn
     *              the SSN of the account holder.
     * @throws NegativeAmountException
     *              if the amount is negative.
     * @throws InsufficientBalanceException
     *              if the balance is insufficient.
     * @throws SsnNotValidException
     *              if the SSN does not match.
     */
    public void withdraw(double amount, String ssn)
            throws NegativeAmountException, InsufficientBalanceException, SsnNotValidException {
        try {
            if (amount < 0) throw new NegativeAmountException("The amount= " + amount + "  must not be negative.");
            if (amount > balance) throw new InsufficientBalanceException("The balance= " + balance + "  is not sufficient.");
            if (!isSsnValid(ssn)) throw new SsnNotValidException("The SSN= " + ssn + " does not match.");
            balance -= amount;
            // audit trail: who, when, what, initial balance, resulting balance
        } catch (NegativeAmountException | InsufficientBalanceException | SsnNotValidException e) {
            System.err.printf(LocalDateTime.now() +  "Withdrawal failed. \n%s\n", e.getMessage());     // logging
            throw e;
        }
    }

    // Design Pattern - Delegation
    /**
     * Get the account balance.
     * @return  the account balance.
     */
    public double getAccountBalance() {
        return getBalance();
    }

    private boolean isSsnValid(String ssn) {
//        return this.ssn.equals(ssn);          // not null-safe
        return Objects.equals(this.ssn, ssn);   // null-safe
    }


}
