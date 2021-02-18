package com.account.sample.datamodel;

import org.springframework.lang.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Account {

    @Id
    @NonNull
    @Column(name="account_number")
    public Long accountNumber;

    @NonNull
    @Column(name="account_name")
    public String accountName;

    @NonNull

    @Column(name="account_type")
    public String accountType;

    @NonNull
    @Column(name="balance_date")
    public Date balanceDate;

    @NonNull
    @Column(name="account_currency")
    public String accountCurrency;

    @NonNull
    @Column(name="account_balance")
    public Float accountBalance;


    @NonNull
    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(@NonNull Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    @NonNull
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(@NonNull String accountName) {
        this.accountName = accountName;
    }

    @NonNull
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(@NonNull String accountType) {
        this.accountType = accountType;
    }

    @NonNull
    public Date getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(@NonNull Date balanceDate) {
        this.balanceDate = balanceDate;
    }

    @NonNull
    public String getAccountCurrency() {
        return accountCurrency;
    }

    public void setAccountCurrency(@NonNull String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    @NonNull
    public Float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(@NonNull Float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Account(){

        super();
    }



}
