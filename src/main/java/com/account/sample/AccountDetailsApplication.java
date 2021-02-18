package com.account.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 * Application class for starting spring-boot.
 */
@SpringBootApplication(scanBasePackages =  {"com.account.sample"})
@EnableSwagger2
public class AccountDetailsApplication {

	/**
	 *
	 * @param args
	 * Main method for spring boot invocation.
	 */
	public static void main(String[] args) {
		SpringApplication.run(AccountDetailsApplication.class, args);
	}

}
