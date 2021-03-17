package com.Pkart.service;

import java.util.ArrayList;
import java.util.List;

import com.Pkart.dao.CustomerDaoImpl;
import com.Pkart.dao.ICustomerDao;
import com.Pkart.model.Customer;
import com.Pkart.model.Product;

public class CustomerServiceImpl implements ICustomerService {
	private static ICustomerDao customerDao;

	public CustomerServiceImpl() {

		if (null == customerDao)
			customerDao = new CustomerDaoImpl();

	}

	@Override
	public boolean viewOrder(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean purchasePoduct(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer orderDetails(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getOrderDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	public Customer viewCustomer(int customerId) {
		return customerDao.viewCustomer(customerId);
		
	}

	@Override
	public boolean addCustomer(Customer customer) {
		customerDao.addCustomer(customer);

		Customer savedProduct = customerDao.viewCustomer(customer.getId());

		if (savedProduct != null)
			return true;
		else
			return false;

	}
	public ArrayList<Product> purchaseProduct() {
		return customerDao.purchaseProduct();
	}

	@Override
	public void addToCart(Product product) {
		// TODO Auto-generated method stub
		
	}
}
