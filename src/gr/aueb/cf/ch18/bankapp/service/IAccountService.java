package gr.aueb.cf.ch18.bankapp.service;

import gr.aueb.cf.ch18.bankapp.core.exceptions.AccountNotFoundException;
import gr.aueb.cf.ch18.bankapp.core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch18.bankapp.core.exceptions.NegativeAmountException;
import gr.aueb.cf.ch18.bankapp.dto.AccountDepositDTO;
import gr.aueb.cf.ch18.bankapp.dto.AccountInsertDTO;
import gr.aueb.cf.ch18.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.ch18.bankapp.dto.AccountWithdrawDTO;

import java.math.BigDecimal;
import java.util.List;

public interface IAccountService {

    // Αν κάναμε μόνο insert θα έπρεπε να ελέγχουμε το AccountAlreadyExistsException;
    AccountReadOnlyDTO createNewAccount(AccountInsertDTO accountInsertDTO)
            throws NegativeAmountException;
    void deposit(AccountDepositDTO accountDepositDTO) throws AccountNotFoundException, NegativeAmountException;
    void withdraw(AccountWithdrawDTO accountWithdrawDTO) throws AccountNotFoundException, InsufficientBalanceException;
    BigDecimal getBalance(String iban) throws AccountNotFoundException;
    List<AccountReadOnlyDTO> getAllAccounts();
}
