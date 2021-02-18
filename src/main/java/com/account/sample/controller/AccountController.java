package com.account.sample.controller;

import com.account.sample.datamodel.Account;
import com.account.sample.repositories.AccountRepository;
import com.account.sample.service.AccountService;
import com.google.common.collect.ImmutableList;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    @GetMapping("/")
    @ApiOperation("Get list of all accounts")
    public List<Account> listAll() {
        return ImmutableList.copyOf(accountService.findAll());

    }



}
