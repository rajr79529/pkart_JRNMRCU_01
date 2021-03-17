package com.Pkart.dao;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Pkart.model.Product;

class ProductDaoImplTest {
	private ProductDaoImpl productDao;

	@BeforeEach
	void setUp() throws Exception {
		productDao = new ProductDaoImpl(); 
	}

	@AfterEach
	void tearDown() throws Exception {
		productDao = null;
	}
	@Test
	void testViewProduct() {
		Product p1 = new Product(1, "ramu", 10, 1, "12-02-2020", "09-08-2021");
		productDao.addProduct(p1);
		Product p2 = productDao.viewProduct(1);
		assertEquals(p1.getId(), p2.getId());
		System.out.println("hurray!!!!!");
	}
	@Test
	void testViewProductNotValid() {
		Product p1 = new Product(1, "ramu", 12, 1, "12-02-2020", "09-08-2021");
		productDao.addProduct(p1);
		Product p2 = productDao.viewProduct(2);
		assertNotEquals("oops",p1, p2);
		System.out.println("oops!!!!!");
	}

}