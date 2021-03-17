package com.Pkart.service;


import java.util.List;

import com.Pkart.dao.IProductDao;
import com.Pkart.dao.ProductDaoImpl;
import com.Pkart.model.Product;

public class ProductServiceImpl implements IProductService {

	private static IProductDao productDao;

	public ProductServiceImpl() {

		if (null == productDao)
			productDao = new ProductDaoImpl();

	}
	@Override
	public boolean addProduct(Product product) {
		productDao.addProduct(product);

		Product savedProduct = productDao.viewProduct(product.getId());

		if (savedProduct != null)
			return true;
		else
			return false;

	}

	@Override
	public boolean removeProduct(Product product) {
		productDao.removeProduct(product);
		
		Product savedProduct = productDao.viewProduct(product.getId());

		if (savedProduct == null)
			return true;
		else
			return false;

	}

	public void updateProduct(int id, Product product) {
		productDao.updateProduct(id, product);
		
	}

	@Override
	public Product viewProduct(int productId) {
		return productDao.viewProduct(productId);
		
	}


	@Override
	public List<Product> viewAllProduct() {
		return productDao.viewAllProduct();
	}
	
}
