package com.Jaskaran.ProductsAndCategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Jaskaran.ProductsAndCategories.models.Category;
import com.Jaskaran.ProductsAndCategories.models.Product;
import com.Jaskaran.ProductsAndCategories.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepo;
	
	
	public Product create(Product product)
	{
		return productRepo.save(product);
	}
	
	public Product getSingleProduct(Long id)
	{
		return productRepo.findById(id).orElse(null);
	}
	
	public List<Product> findproductNotCat(Category category)
	{
		return productRepo.findByCategoriesNotContains(category);
	}
	
	public void addCategoryToProduct(Category category,Product product)
	{
		List<Category> existingCats=product.getCategories();
		existingCats.add(category);
		productRepo.save(product);
	}	
				
}

