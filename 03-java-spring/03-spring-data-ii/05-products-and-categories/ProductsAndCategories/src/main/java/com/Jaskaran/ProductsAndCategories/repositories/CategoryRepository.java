package com.Jaskaran.ProductsAndCategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Jaskaran.ProductsAndCategories.models.Category;
import com.Jaskaran.ProductsAndCategories.models.Product;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Long> {
	
	List<Category> findAll();
//	List<Category> findByProductsNotContain(Product product);
	 List<Category> findByProductsNotContains(Product product);
}
