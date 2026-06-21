package gr.aueb.cf.ch18.bankapp.controller;

import gr.aueb.cf.ch18.bankapp.core.exceptions.AccountNotFoundException;
import gr.aueb.cf.ch18.bankapp.core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch18.bankapp.core.exceptions.NegativeAmountException;
import gr.aueb.cf.ch18.bankapp.core.exceptions.ValidationException;
import gr.aueb.cf.ch18.bankapp.dto.AccountDepositDTO;
import gr.aueb.cf.ch18.bankapp.dto.AccountInsertDTO;
import gr.aueb.cf.ch18.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.ch18.bankapp.dto.AccountWithdrawDTO;
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
            throws NegativeAmountException, ValidationException {

        // Data binding
        AccountInsertDTO insertDTO = new AccountInsertDTO(iban, balance);
        AccountReadOnlyDTO readOnlyDTO;

        // Validation
        Map<String, String> errors = Validator.validateInsertDTO(insertDTO);
        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toString());
        }

       // Service Call
       readOnlyDTO = accountService.createNewAccount(insertDTO);

        return readOnlyDTO;

        // Dummy Data
//        readOnlyDTO = new AccountReadOnlyDTO(iban, balance);
    }

    public void deposit(String iban, BigDecimal amount)
            throws AccountNotFoundException, ValidationException, NegativeAmountException {

        // Data binding
        AccountDepositDTO depositDTO = new AccountDepositDTO(iban, amount);

        // Validation
        Map<String, String> errors = Validator.validateDepositDTO(depositDTO);
        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toString());
        }

        // Service Call
        accountService.deposit(depositDTO);

        // Dummy Data
//        if (iban.equals("GR12345")) {
//            throw new IllegalArgumentException("Account with IBAN " + iban + " does not exist");
//        }
    }

    public void withdraw(String iban, BigDecimal amount)
            throws AccountNotFoundException, ValidationException, InsufficientBalanceException {

        // Data binding
        AccountWithdrawDTO withdrawDTO = new AccountWithdrawDTO(iban, amount);

        // Validation
        Map<String, String> validationErrors = Validator.validateWithdrawDTO(withdrawDTO);
        if (!validationErrors.isEmpty()) {
            throw new ValidationException(validationErrors.toString());
        }

        // Validation for business rules
        Map<String , String > balanceErrors = Validator.validateWithdrawBalance(withdrawDTO, accountService.getBalance(iban));
        if (!balanceErrors.isEmpty()) {
            throw new InsufficientBalanceException(balanceErrors.toString());
        }

        accountService.withdraw(withdrawDTO);

        // Dummy Data
//        if (iban.equals("GR12345")) {
//            throw new IllegalArgumentException("Account with IBAN " + iban + " does not exist");
//        }
    }

    public BigDecimal getBalance(String iban)
            throws AccountNotFoundException, ValidationException {

        // Validation
        Map<String, String> errors = Validator.validateIban(iban);
        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toString());
        }

        // Service Call
        return accountService.getBalance(iban);

        // Dummy Data
//        if (iban.equals("GR12345")) {
//            throw new IllegalArgumentException("Account with IBAN " + iban + " does not exist");
//        }

//        return new BigDecimal("1000");
    }

    public List<AccountReadOnlyDTO> getAllAccounts() {

        // Service Call
        return accountService.getAllAccounts();

        // Dummy Data
//        return List.of(new AccountReadOnlyDTO("GR12345", BigDecimal.valueOf(1000)),
//                new AccountReadOnlyDTO("GR12346", BigDecimal.valueOf(2000)),
//                new AccountReadOnlyDTO("GR12347", BigDecimal.valueOf(3000)),
//                new AccountReadOnlyDTO("GR12348", BigDecimal.valueOf(4000)));
    }
}



