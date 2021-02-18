package com.account.sample.service;

import com.account.sample.datamodel.AccountTransactions;
import com.account.sample.repositories.AccountTransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountTransactionServiceImpl implements AccountTransactionService{

    @Autowired
    private AccountTransactionsRepository accountTransactionsRepository;

    @Override
    public List<AccountTransactions> findByAccountNumber(long id) {
        return accountTransactionsRepository.findByAccountNumber(id);
    }
}
