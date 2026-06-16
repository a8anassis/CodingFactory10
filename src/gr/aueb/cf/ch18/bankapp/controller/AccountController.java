package gr.aueb.cf.ch18.bankapp.controller;

import gr.aueb.cf.ch18.bankapp.core.exceptions.ValidationException;
import gr.aueb.cf.ch18.bankapp.dto.AccountInsertDTO;
import gr.aueb.cf.ch18.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.ch18.bankapp.model.Account;
import gr.aueb.cf.ch18.bankapp.service.IAccountService;
import gr.aueb.cf.ch18.bankapp.validation.Validator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AccountController {
    private final IAccountService accountService;

    public AccountController(IAccountService accountService) {
        this.accountService = accountService;
    }

    public AccountReadOnlyDTO createNewAccount(String iban, BigDecimal balance)
            throws ValidationException {

        // Data binding
        AccountInsertDTO insertDTO = new AccountInsertDTO(iban, balance);
        AccountReadOnlyDTO readOnlyDTO;

        // Validation
        Map<String, String> errors = Validator.validateInsertDTO(insertDTO);
        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toString());
        }

       // 2. Service Call
       readOnlyDTO = accountService.createNewAccount(insertDTO);

        // Dummy Data
//        readOnlyDTO = new AccountReadOnlyDTO(iban, balance);
        return readOnlyDTO;
    }

    public void deposit(String iban, BigDecimal amount) {

        // 1. Validation

        // Dummy Data
        if (iban.equals("GR12345")) {
            throw new IllegalArgumentException("Account with IBAN " + iban + " does not exist");
        }

        // Service Call
        // accountService.deposit(iban, amount);
    }

    public void withdraw(String iban, BigDecimal amount) {

        // 1. Validation

        // Dummy Data
        if (iban.equals("GR12345")) {
            throw new IllegalArgumentException("Account with IBAN " + iban + " does not exist");
        }

        // Service Call
        // accountService.withdraw(iban, amount);
    }

    public BigDecimal getBalance(String iban) {

        // Dummy Data
        if (iban.equals("GR12345")) {
            throw new IllegalArgumentException("Account with IBAN " + iban + " does not exist");
        }

        return new BigDecimal("1000");

        // Service Call
        //return accountService.getBalance(iban);
    }

    public List<AccountReadOnlyDTO> getAllAccounts() {

        // Dummy Data
        return List.of(new AccountReadOnlyDTO("GR12345", BigDecimal.valueOf(1000)),
                new AccountReadOnlyDTO("GR12346", BigDecimal.valueOf(2000)),
                new AccountReadOnlyDTO("GR12347", BigDecimal.valueOf(3000)),
                new AccountReadOnlyDTO("GR12348", BigDecimal.valueOf(4000)));

        // Service Call
        //return accountService.getAllAccounts();
    }
}
