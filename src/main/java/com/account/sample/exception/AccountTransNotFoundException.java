package com.account.sample.exception;

public class AccountTransNotFoundException extends RuntimeException{

    public AccountTransNotFoundException(String exception){
        super(exception);
    }

}
