package gr.aueb.cf.ch18.bankapp.service;

import gr.aueb.cf.ch18.bankapp.core.exceptions.AccountNotFoundException;
import gr.aueb.cf.ch18.bankapp.core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch18.bankapp.core.exceptions.NegativeAmountException;
import gr.aueb.cf.ch18.bankapp.core.mapper.Mapper;
import gr.aueb.cf.ch18.bankapp.dao.IAccountDAO;
import gr.aueb.cf.ch18.bankapp.dto.AccountDepositDTO;
import gr.aueb.cf.ch18.bankapp.dto.AccountInsertDTO;
import gr.aueb.cf.ch18.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.ch18.bankapp.dto.AccountWithdrawDTO;
import gr.aueb.cf.ch18.bankapp.model.Account;

import java.math.BigDecimal;
import java.util.List;

public class AccountServiceImpl implements IAccountService {
    private final IAccountDAO accountDAO;

    public AccountServiceImpl(IAccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }


    @Override
    public AccountReadOnlyDTO createNewAccount(AccountInsertDTO accountInsertDTO) {
        Account accountToReturn;

        Account account = Mapper.mapToModelEntity(accountInsertDTO);
        accountToReturn = accountDAO.saveOrUpdate(account);
        return Mapper.mapToReadOnlyDTO(accountToReturn);
    }

    @Override
    public void deposit(AccountDepositDTO accountDepositDTO) throws AccountNotFoundException, NegativeAmountException {

    }

    @Override
    public void withdraw(AccountWithdrawDTO accountWithdrawDTO) throws AccountNotFoundException, InsufficientBalanceException {

    }

    @Override
    public BigDecimal getBalance(String iban) throws AccountNotFoundException {
        return null;
    }

    @Override
    public List<AccountReadOnlyDTO> getAllAccounts() {
        return List.of();
    }
}
