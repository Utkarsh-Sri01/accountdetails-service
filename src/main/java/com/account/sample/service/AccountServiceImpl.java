package com.account.sample.service;

import com.account.sample.datamodel.Account;
import com.account.sample.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Account> getAcctDetails(Long userId) {
        return accountRepository.findAllAccountDetailsByUserId(userId);
    }
}
