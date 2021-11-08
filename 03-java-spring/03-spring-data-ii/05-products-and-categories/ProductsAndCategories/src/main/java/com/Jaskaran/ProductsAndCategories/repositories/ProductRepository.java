package com.Jaskaran.ProductsAndCategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Jaskaran.ProductsAndCategories.models.Category;
import com.Jaskaran.ProductsAndCategories.models.Product;

@Repository
public interface ProductRepository  extends CrudRepository<Product, Long>{
	List<Product> findAll();
	List<Product> findByCategoriesNotContains(Category category);
	

}
