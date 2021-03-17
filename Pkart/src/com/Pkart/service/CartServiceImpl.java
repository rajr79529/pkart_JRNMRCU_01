package com.Pkart.service;

import java.util.ArrayList;

import com.Pkart.dao.CartDaoImpl;
import com.Pkart.dao.ICartDao;

import com.Pkart.model.Product;

public class CartServiceImpl implements ICartService{
	private static ICartDao cartDao;

	public CartServiceImpl() {

		if (null == cartDao)
			cartDao =  new CartDaoImpl();

	}

	@Override
	public  boolean addToCart(Product product) {
		cartDao.addToCart(product);
		ArrayList<Product> savedProduct = cartDao.viewCart();

		if (savedProduct != null)
			return true;
		else
			return false;


	}

	@Override
	public ArrayList<Product> viewCart() {
		return cartDao.viewCart();
		
	}

}
