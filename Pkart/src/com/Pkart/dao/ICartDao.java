package com.Pkart.dao;
import java.util.ArrayList;

import com.Pkart.model.Product;

public interface ICartDao {
	void addToCart(Product product);
	ArrayList<Product> viewCart();

}
