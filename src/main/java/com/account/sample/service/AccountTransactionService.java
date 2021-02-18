package com.account.sample.service;

import com.account.sample.datamodel.AccountTransactions;

import java.util.List;

public interface AccountTransactionService {
    List<AccountTransactions> findAllTransactionsByAccountNumber(long id);
}
