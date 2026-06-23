package gr.aueb.cf.ch18.bankapp_mysql.bankapp.service;

import gr.aueb.cf.ch18.bankapp_mysql.bankapp.core.exceptions.AccountNotFoundException;
import gr.aueb.cf.ch18.bankapp_mysql.bankapp.core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch18.bankapp_mysql.bankapp.core.exceptions.NegativeAmountException;
import gr.aueb.cf.ch18.bankapp_mysql.bankapp.dto.AccountDepositDTO;
import gr.aueb.cf.ch18.bankapp_mysql.bankapp.dto.AccountInsertDTO;
import gr.aueb.cf.ch18.bankapp_mysql.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.ch18.bankapp_mysql.bankapp.dto.AccountWithdrawDTO;

import java.math.BigDecimal;
import java.util.List;

public interface IAccountService {

    AccountReadOnlyDTO createNewAccount(AccountInsertDTO accountInsertDTO)
            throws NegativeAmountException;

    void deposit(AccountDepositDTO accountDepositDTO)
            throws AccountNotFoundException, NegativeAmountException;

    void withdraw(AccountWithdrawDTO accountWithdrawDTO)
            throws AccountNotFoundException, InsufficientBalanceException;

    BigDecimal getBalance(String iban) throws AccountNotFoundException;

    List<AccountReadOnlyDTO> getAllAccounts();
}


