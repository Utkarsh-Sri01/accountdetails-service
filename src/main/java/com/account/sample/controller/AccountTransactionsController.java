package com.account.sample.controller;

import com.account.sample.datamodel.AccountTransactions;
import com.account.sample.exception.AccountTransNotFoundException;
import com.account.sample.service.AccountTransactionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(description="Get transaction details", tags="Account Transaction Details")
public class AccountTransactionsController {

    @Autowired
    private AccountTransactionService accountTransactionService;

    /**
     * Retrieves list of transactions for given account number
     * @param id
     * @return list of all account transaction associated to provided account number {@link AccountTransactions}
     * @throws Exception
     */
     @GetMapping("/listTransactions/{id}")
     @ApiOperation("Get list of all transactions for provided account number")
     public List<AccountTransactions> listTransactions(@PathVariable(value = "id") Long id) throws Exception {
        List<AccountTransactions> acctTransactions = accountTransactionService.findAllTransactionsByAccountNumber(id);

        if (acctTransactions.size() == 0)
          throw new AccountTransNotFoundException("Transactions not found for account number:" + id);

        return acctTransactions;
    }
}
