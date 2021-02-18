package com.account.sample.datamodel;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
public class AccountTransactions {

    @NonNull
    @Column(name="account_number")
    public Long accountNumber;

    @NonNull
    @Column(name="account_name")
    public String accountName;

    @NonNull
    @Column(name="account_value_date")
    public String accountValueDate;

    @NonNull
    @Column(name="account_currency")
    public String accountCurrency;

    @Id
    @NonNull
    @Column(name="account_credit_amt")
    public Float accountCreditAmt;

    @NonNull
    @Column(name="account_debit_amt")
    public Float accountDebitAmt;

    @NonNull
    @Column(name="account_debit_credit")
    public String accountDebitCredit;


    @Column(name="account_transaction_narrative")
    public String accountTransactionNarrative;

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
    public String getAccountValueDate() {
        return accountValueDate;
    }

    public void setAccountValueDate(@NonNull String accountValueDate) {
        this.accountValueDate = accountValueDate;
    }

    @NonNull
    public String getAccountCurrency() {
        return accountCurrency;
    }

    public void setAccountCurrency(@NonNull String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    @NonNull
    public Float getAccountCreditAmt() {
        return accountCreditAmt;
    }

    public void setAccountCreditAmt(@NonNull Float accountCreditAmt) {
        this.accountCreditAmt = accountCreditAmt;
    }

    @NonNull
    public Float getAccountDebitAmt() {
        return accountDebitAmt;
    }

    public void setAccountDebitAmt(@NonNull Float accountDebitAmt) {
        this.accountDebitAmt = accountDebitAmt;
    }

    @NonNull
    public String getAccountDebitCredit() {
        return accountDebitCredit;
    }

    public void setAccountDebitCredit(@NonNull String accountDebitCredit) {
        this.accountDebitCredit = accountDebitCredit;
    }

    public String getAccountTransactionNarrative() {
        return accountTransactionNarrative;
    }

    public void setAccountTransactionNarrative(String accountTransactionNarrative) {
        this.accountTransactionNarrative = accountTransactionNarrative;
    }

    public AccountTransactions(){
        super();
    }
}
