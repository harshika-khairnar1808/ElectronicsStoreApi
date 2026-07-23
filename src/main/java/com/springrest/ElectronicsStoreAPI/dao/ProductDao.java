package com.springrest.ElectronicsStoreAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springrest.ElectronicsStoreAPI.entity.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

}
