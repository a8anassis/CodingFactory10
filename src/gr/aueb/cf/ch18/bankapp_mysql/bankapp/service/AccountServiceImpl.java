package gr.aueb.cf.ch18.bankapp_mysql.bankapp.service;

import gr.aueb.cf.ch18.bankapp_mysql.bankapp.core.exceptions.AccountNotFoundException;
import gr.aueb.cf.ch18.bankapp_mysql.bankapp.core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch18.bankapp_mysql.bankapp.core.exceptions.NegativeAmountException;
import gr.aueb.cf.ch18.bankapp_mysql.bankapp.core.mapper.Mapper;
import gr.aueb.cf.ch18.bankapp_mysql.bankapp.dao.IAccountDAO;
import gr.aueb.cf.ch18.bankapp_mysql.bankapp.dto.AccountDepositDTO;
import gr.aueb.cf.ch18.bankapp_mysql.bankapp.dto.AccountInsertDTO;
import gr.aueb.cf.ch18.bankapp_mysql.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.ch18.bankapp_mysql.bankapp.dto.AccountWithdrawDTO;
import gr.aueb.cf.ch18.bankapp_mysql.bankapp.model.Account;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class AccountServiceImpl implements IAccountService {
    private final IAccountDAO accountDAO;

    public AccountServiceImpl(IAccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }


    @Override
    public AccountReadOnlyDTO createNewAccount(AccountInsertDTO accountInsertDTO)
            throws NegativeAmountException {
        try {
            if (accountInsertDTO.balance().compareTo(BigDecimal.ZERO) < 0) {
                throw new NegativeAmountException("The initial balance " + accountInsertDTO.balance() +
                        " must not be negative");
            }

            Account accountToReturn;
            Account account = Mapper.mapToModelEntity(accountInsertDTO);
            accountToReturn = accountDAO.saveOrUpdate(account);
            return Mapper.mapToReadOnlyDTO(accountToReturn);
        } catch (NegativeAmountException e) {
            System.err.printf("%s. The initial balance %f is negative. \n",
                    LocalDateTime.now(),
                    accountInsertDTO.balance());
            throw e;
        }
    }

    @Override
    public void deposit(AccountDepositDTO depositDTO)
            throws AccountNotFoundException, NegativeAmountException {
        try {
            if (depositDTO.amount().compareTo(BigDecimal.ZERO) < 0) {
                throw new NegativeAmountException("The amount must not be negative.");
            }
            Account account = accountDAO.findByIban(depositDTO.iban())
                    .orElseThrow(() ->
                            new AccountNotFoundException("Account with IBAN " + depositDTO.iban() + " not found."));
            account.setBalance(account.getBalance().add(depositDTO.amount()));
            accountDAO.saveOrUpdate(account);
            // audit trail: who, when, what, initial balance, resulting balance
        } catch (NegativeAmountException e) {
            System.err.printf("%s. The amount %f is not allowed. \n", LocalDateTime.now(), depositDTO.amount());
            throw e;
        } catch (AccountNotFoundException e) {
            System.err.printf("%s. Account with IBAN %s not found. \n", LocalDateTime.now(), depositDTO.iban());
            throw e;
        }
    }

    @Override
    public void withdraw(AccountWithdrawDTO withdrawDTO)
            throws AccountNotFoundException, InsufficientBalanceException {
        try {
            Account account = accountDAO.findByIban(withdrawDTO.iban())
                    .orElseThrow(() -> new AccountNotFoundException("Account with IBAN " + withdrawDTO.iban() + " not found."));

            if (account.getBalance().compareTo(withdrawDTO.amount()) < 0) {
                throw new InsufficientBalanceException("Amount " + withdrawDTO.amount() +
                        " for account with IBAN" + account.getIban() + " is greater than the balance");
            }
            account.setBalance(account.getBalance().subtract(withdrawDTO.amount()));
            accountDAO.saveOrUpdate(account);
            // audit trail: who, when, what, initial balance, resulting balance
        } catch (InsufficientBalanceException e) {
            System.err.printf("%s. The amount %f is greater than the balance of the account with IBAN %s \n",
                    LocalDateTime.now(), withdrawDTO.amount(), withdrawDTO.iban()
            );
            throw e;
        } catch (AccountNotFoundException e) {
            System.err.printf("%s. Account with IBAN %s not found. \n", LocalDateTime.now(),
                    withdrawDTO.iban()
            );
            throw e;
        }
    }

    @Override
    public BigDecimal getBalance(String iban) throws AccountNotFoundException {
        try {
            Account account = accountDAO
                    .findByIban(iban)
                    .orElseThrow(
                            () -> new AccountNotFoundException("Account not found")
                    );
            return account.getBalance();
        } catch (AccountNotFoundException e) {
            System.err.printf(
                    "%s. Account with IBAN %s not found. \n",
                    LocalDateTime.now(),
                    iban
            );
            throw e;
        }
    }

    @Override
    public List<AccountReadOnlyDTO> getAllAccounts() {
        return accountDAO
                .findAll()
                .stream()
                .map(Mapper::mapToReadOnlyDTO)
                .toList();
    }
}
