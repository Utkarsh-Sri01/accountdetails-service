Accounts List Application

## Overview

This application will list a set of accounts and will also provide the list of transactions for any account. This is implemented via a restful API in spring boot

## Details

### Core Rest API

The root path is http://localhost:8080/


Following are the operations possible

1. List the Accounts GET '/'
2. List the transactions for any account GET '/listTransactions/account_number=?'



## Getting Started

## SpringBoot

[Spring Boot](https://projects.spring.io/spring-boot/) is an Opinionated Java Framework for developing production-ready
Spring applications. Spring Boot favours convention over configuration and is designed to get you up and running as
quickly as possible.


[MAVEN](https://maven.apache.org/) is the build tool for this project, and requires Java JDK to be installed. It is not necessary to install gradle.



### Running the application

This project makes use of the
[Gradle Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-gradle-plugin.html)
plugin. To start the application locally just run the following command


    ./gradew bootRun


## H2 Console

The H2 DB console can be accessed in your browser. Navigate to [/v1/h2](http://localhost:8080/h2-console) to access the console,
and ensure the `JDBC URL` matches the one defined in the `application.yml` file: jdbc:h2:file:~/accountdb

**Note**: removing the `simple-ticket-db` file, which will be placed in your home by default, will reset the database.

