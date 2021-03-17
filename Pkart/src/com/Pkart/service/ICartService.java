package com.Pkart.service;

import java.util.ArrayList;

import com.Pkart.model.Cart;
import com.Pkart.model.Product;

public interface ICartService {

	boolean addToCart(Product product);  //add product to cart
	ArrayList<Product> viewCart();       //it will show the products in the cart
}
