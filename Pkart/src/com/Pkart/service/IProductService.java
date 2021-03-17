package com.Pkart.service;


import java.util.List;

import com.Pkart.model.Product;

public interface IProductService {
	 boolean addProduct(Product product);   //add product 

	 boolean removeProduct(Product product); //remove product

	 void updateProduct(int id1, Product product); //update product
	
	 Product viewProduct(int productId); //view product
	 
	 

	public List<Product> viewAllProduct();  //show all product

}
