Spring Boot Account Details Service

## Overview

This application will list a set of accounts and will also provide the list of transactions for any account. This is implemented via a restful API in spring boot

## Details

### Core Rest API

The root path is http://localhost:8080/

## API Enpoints
1. `GET /` - Gets all accounts.
2. `GET /listTransactions/{id}` - Finds all transaction details matching the specified account number.

## Getting Started

## SpringBoot

[Spring Boot](https://projects.spring.io/spring-boot/) is an Opinionated Java Framework for developing production-ready
Spring applications. Spring Boot favours convention over configuration and is designed to get you up and running as
quickly as possible.


[MAVEN](https://maven.apache.org/) is the build tool for this project, and requires Java JDK to be installed. It is not necessary to install gradle.


## Compile & Test
Basic Prerequisite :
1. Maven Setup
2. Open JDK 8 or Oracle Java 8

Running in local:
* Once you have the above Prerequisites, compile the project code and run the below command. This would run the entire build for all modules and execute tests with creating artefacts.

  `mvn clean install`

* You could also run only the application by using below command :

  `mvn spring-boot:run`

## Swagger docs location

*  http://localhost:8080/v2/api-docs
*  http://localhost:8080/swagger-ui.html
*  The API documentation makes use of Springfox OpenAPI swagger libraries.


## H2 Console

The H2 DB console can be accessed in your browser. Navigate to (http://localhost:8080/h2-console) to access the console,
and ensure the `JDBC URL` matches the one defined in the `application.properties` file: jdbc:h2:mem:accountdb


