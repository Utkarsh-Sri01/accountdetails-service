package com.account.sample.exception;

public class InvalidUserDetail extends RuntimeException{
    public InvalidUserDetail (String exception){
        super(exception);
    }
}
