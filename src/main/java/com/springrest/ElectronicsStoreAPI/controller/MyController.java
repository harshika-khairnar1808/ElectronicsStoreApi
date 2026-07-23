package com.springrest.ElectronicsStoreAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.ElectronicsStoreAPI.entity.Category;
import com.springrest.ElectronicsStoreAPI.entity.Product;
import com.springrest.ElectronicsStoreAPI.service.CategoryService;
import com.springrest.ElectronicsStoreAPI.service.ProductService;

@RestController
public class MyController {

	@Autowired
	private CategoryService categoryService;

	@RequestMapping("/home")
	public String home() {
		return "Hello This is My Electronics Shopping Store";
	}

	@GetMapping("/categories")
	public List<Category> getCategories() {
		return categoryService.getCategories();
	}

	@PostMapping("/categories")
	public Category addCategory(@RequestBody Category category) {
		return categoryService.addCategories(category);
	}

	@GetMapping("/categories/{categoryId}")
	public Category getCategoryById(@PathVariable String categoryId) {
		return categoryService.getCategoryById(Integer.parseInt(categoryId));

	}

	@PutMapping("/categories/{categoryId}")
	public Category updateCategoryById(@PathVariable String categoryId, @RequestBody Category category) {
		return categoryService.updateCategoryById(Integer.parseInt(categoryId), category);

	}

	@DeleteMapping("/categories/{categoryId}")
	public void deleteCategoryById(@PathVariable String categoryId) {
		categoryService.deleteCategoryById(Integer.parseInt(categoryId));

	}

	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public List<Product> getProducts(){
		return productService.getProducts();
		
	}
	
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
		
	}
	
	@GetMapping("/products/{productId}")
	public Product getProductById(@PathVariable String productId) {
		return productService.getProductById(Integer.parseInt(productId));
		
	}
	
	@PutMapping("/products/{productId}")
	public Product updateProductById(@PathVariable String productId, @RequestBody Product product){
		return productService.updateProductById(Integer.parseInt(productId), product);
		
	}
	
	@DeleteMapping("/products/{productId}")
	public void deleteProductById(@PathVariable String productId) {
		productService.deleteProductById(Integer.parseInt(productId));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
