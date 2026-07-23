package com.springrest.ElectronicsStoreAPI.service;

import java.util.List;

import com.springrest.ElectronicsStoreAPI.entity.Product;

public interface ProductService {

	public List<Product> getProducts();

	public Product addProduct(Product product);

	public Product getProductById(int productId);

	public Product updateProductById(int productId, Product product);

	public void deleteProductById(int productId);

}
