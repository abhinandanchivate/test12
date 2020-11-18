package com.tcs.ecommerce.service;

import java.util.Optional;

import com.tcs.ecommerce.model.Product;

import antlr.collections.List;

public interface ProductService {
	
	public String createProduct(Product product);
	public Optional<Product> getProductById(int id);
	public void deleteProduct(int id);
	public Optional<java.util.List<Product>> getProducts();

}
