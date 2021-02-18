DROP TABLE ACCOUNT if exists;
DROP TABLE ACCOUNT_TRANSACTIONS if exists;

CREATE TABLE ACCOUNT (
  account_number BIGINT not null,
  account_name varchar(50) not null,
  account_type varchar(20) not null,
  balance_date DATE not null,
  account_currency varchar(3) not null,
  account_balance DECIMAL not null
);

CREATE TABLE ACCOUNT_TRANSACTIONS (
  account_number BIGINT not null,
  account_name varchar(50) not null,
  account_value_date DATE not null,
  account_currency varchar(3) not null,
  account_debit_amt DECIMAL,
  account_credit_amt DECIMAL,
  account_debit_credit varchar(10) not null,
  account_transaction_narrative varchar(100)
);


ALTER TABLE ACCOUNT_TRANSACTIONS ADD FOREIGN KEY (account_number) REFERENCES ACCOUNT(account_number);




