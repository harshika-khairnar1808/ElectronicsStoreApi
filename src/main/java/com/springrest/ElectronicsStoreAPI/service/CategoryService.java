package com.springrest.ElectronicsStoreAPI.service;

import java.util.List;

import com.springrest.ElectronicsStoreAPI.entity.Category;

public interface CategoryService {

	public List<Category> getCategories();
	
	public Category addCategories(Category category);
	
	public Category getCategoryById(int categoryId);
	
	public Category updateCategoryById(int categoryId,Category category);
	
	public void deleteCategoryById(int categoryId);
	
}
