package com.account.sample.service;

import com.account.sample.datamodel.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
}
