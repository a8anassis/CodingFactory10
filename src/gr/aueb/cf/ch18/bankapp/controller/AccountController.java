package gr.aueb.cf.ch18.bankapp.controller;

import gr.aueb.cf.ch18.bankapp.dto.AccountInsertDTO;
import gr.aueb.cf.ch18.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.ch18.bankapp.model.Account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountController {

    // dummy
    private final List<Account> accounts = new ArrayList<>();

    public AccountReadOnlyDTO createNewAccount(String iban, BigDecimal balance) {
        // Data binding
        AccountInsertDTO insertDTO = new AccountInsertDTO(iban, balance);
        AccountReadOnlyDTO readOnlyDTO;

        // Validation

        // Dummy
        accounts.add(new Account(iban, balance));

        readOnlyDTO = new AccountReadOnlyDTO(iban, balance);
        return readOnlyDTO;
    }
}
