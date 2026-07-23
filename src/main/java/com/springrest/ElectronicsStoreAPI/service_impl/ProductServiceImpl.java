package com.springrest.ElectronicsStoreAPI.service_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.ElectronicsStoreAPI.dao.ProductDao;
import com.springrest.ElectronicsStoreAPI.entity.Product;
import com.springrest.ElectronicsStoreAPI.service.ProductService;

@Service
public class ProductServiceImpl  implements ProductService{
	
	@Autowired
	private ProductDao productdao;

	@Override
	public List<Product> getProducts() {
		return productdao.findAll();
	}

	@Override
	public Product addProduct(Product product) {
		return productdao.save(product);
	}

	@Override
	public Product getProductById(int productId) {
		return productdao.getById(productId);
	}

	@Override
	public Product updateProductById(int productId, Product product) {
		product.setPid(productId);
		return productdao.save(product);
	}

	@Override
	public void deleteProductById(int productId) {
		productdao.deleteById(productId);
	}

	

}
