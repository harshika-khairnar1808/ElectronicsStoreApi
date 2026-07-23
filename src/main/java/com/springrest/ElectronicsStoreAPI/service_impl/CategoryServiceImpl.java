package com.springrest.ElectronicsStoreAPI.service_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.ElectronicsStoreAPI.dao.CategoryDao;
import com.springrest.ElectronicsStoreAPI.dao.ProductDao;
import com.springrest.ElectronicsStoreAPI.entity.Category;
import com.springrest.ElectronicsStoreAPI.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDao categorydao;

	@Override
	public List<Category> getCategories() {
		return categorydao.findAll();
	}

	@Override
	public Category addCategories(Category category) {
		return categorydao.save(category);
	}

	@Override
	public Category getCategoryById(int categoryId) {
		return categorydao.getById(categoryId);
	}

	@Override
	public Category updateCategoryById(int categoryId, Category category) {
		category.setCid(categoryId);
		return categorydao.save(category);
		 
	}

	@Override
	public void deleteCategoryById(int categoryId) {
		categorydao.deleteById(categoryId);
	}

	
	

}
