package com.Pkart.service;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.*;

import com.Pkart.model.Customer;

class CustomerServiceImplTest {
	private CustomerServiceImpl customerServiceImpl;

	@BeforeEach
	void setUp() throws Exception {
		customerServiceImpl = new CustomerServiceImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
		customerServiceImpl = null;
	}

	@Test
	void testAddCustomer() {

		Customer customer = new Customer(1, "ramu","ramu@gmail.com","123654789", "kurukshetra" );
		boolean result = customerServiceImpl.addCustomer(customer);
		assertEquals(true, result);
	}

}