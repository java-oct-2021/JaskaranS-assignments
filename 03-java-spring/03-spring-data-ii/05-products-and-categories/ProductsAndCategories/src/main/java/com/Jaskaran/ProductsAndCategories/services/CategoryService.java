package com.Jaskaran.ProductsAndCategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Jaskaran.ProductsAndCategories.models.Category;
import com.Jaskaran.ProductsAndCategories.models.Product;
import com.Jaskaran.ProductsAndCategories.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository  categoryrepo;
	
	public Category create(Category category)
	{
		return categoryrepo.save(category);
	}

	public Category getSingleCat(Long id)
	{
		return categoryrepo.findById(id).orElse(null);
	}
	
	public List<Category> findCatNotProduct(Product product)
	{
		return categoryrepo.findByProductsNotContains(product);
	}
	
	public void addProductToCategory(Product product,Category category)
	{
		List<Product> existingProds=category.getProducts();
		existingProds.add(product);
		categoryrepo.save(category);
	}	
			
}
