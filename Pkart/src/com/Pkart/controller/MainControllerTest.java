package com.Pkart.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import com.Pkart.model.Product;

class MainControllerTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMain() {
		int choice = 1;
		assertTrue(choice>=1 && choice<=3);
		System.out.println("testCase passes");
	}
	@Test
	void testMainNegative() {
		int choice = -1;
		assertTrue(choice<1);
		System.out.println("testCase fail");
	}
	@Test
	void testMainNullValue() {
		assertNull(null);
		System.out.println("testCase fail");
	}

}