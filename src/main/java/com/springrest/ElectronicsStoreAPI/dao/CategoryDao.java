package com.springrest.ElectronicsStoreAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springrest.ElectronicsStoreAPI.entity.Category;

@Repository
public interface CategoryDao extends JpaRepository<Category, Integer> {

}
