package com.account.sample;

import com.account.sample.repositories.AccountRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = AccountDetailsApplication.class)
@AutoConfigureMockMvc
class AccountDetailsApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void contextLoads() {
	}

	/**
	 * Test successful response for get all account details
	 * @throws Exception
	 */
	@Test
	public void getAccountDetailsThenStatus200()
			throws Exception {

		mockMvc.perform(get("/").contentType(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$", hasSize(greaterThanOrEqualTo(2))))
				.andExpect(jsonPath("$[0].accountNumber", is(585309209)))
				.andExpect(jsonPath("$[0].accountName", is("SGSavings726")))
				.andExpect(jsonPath("$[0].accountType", is("Savings")))
				.andExpect(jsonPath("$[0].balanceDate", is("2018-11-08")))
				.andExpect(jsonPath("$[0].accountCurrency", is("SGD")))
				.andExpect(jsonPath("$[0].accountBalance", is(84327.51)));
	}

	/**
	 * Test successful response for get all transactions of given account number
	 * @throws Exception
	 */
	@Test
	public void getTransactionDetailsForAccountStatus200()
			throws Exception {

		mockMvc.perform(get("/listTransactions/{id}", 847257972).contentType(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$", hasSize(greaterThanOrEqualTo(8))))
				.andExpect(jsonPath("$[0].accountNumber", is(847257972)))
				.andExpect(jsonPath("$[0].accountName", is("CurrentAccount")))
				.andExpect(jsonPath("$[0].accountValueDate", is("2012-01-12")))
				.andExpect(jsonPath("$[0].accountCreditAmt", is(9540.98)))
				.andExpect(jsonPath("$[0].accountCurrency", is("SGD")))
				.andExpect(jsonPath("$[0].accountDebitAmt", is(0.0)))
				.andExpect(jsonPath("$[0].accountDebitCredit", is("Credit")));
	}

	/**
	 * Test negative scenario to get all transactions for invalid account number.
	 * @throws Exception
	 */
		@Test
		public void getTransactionDetailsForAccountStatus404()
			throws Exception {

			mockMvc.perform(get("/listTransactions/{id}",847259722).contentType(MediaType.APPLICATION_JSON))
					.andDo(print())
					.andExpect(status().isNotFound());
		}

}
