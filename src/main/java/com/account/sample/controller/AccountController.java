package com.account.sample.controller;

import com.account.sample.datamodel.Account;
import com.account.sample.exception.InvalidUserDetail;
import com.account.sample.service.AccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@Api(description = "Get Account Details" , tags="Account Details")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * Retrieves a list of Account.
     * @return list of all accounts {@link Account}
     */
    @GetMapping("/{userId}")
    @ApiOperation("Get list of all accounts")
    public List<Account> getAcctDetails(@PathVariable(value = "userId") Long userId) {

        List<Account> userAccounts= accountService.getAcctDetails(userId);
        if (userAccounts.size() == 0)
            throw new InvalidUserDetail("No Accounts found for user:" + userId);
        return userAccounts;

    }



}
