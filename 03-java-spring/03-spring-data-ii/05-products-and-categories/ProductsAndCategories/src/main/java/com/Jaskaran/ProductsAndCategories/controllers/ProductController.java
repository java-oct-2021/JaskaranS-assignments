package com.Jaskaran.ProductsAndCategories.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Jaskaran.ProductsAndCategories.models.Category;
import com.Jaskaran.ProductsAndCategories.models.Product;
import com.Jaskaran.ProductsAndCategories.services.CategoryService;
import com.Jaskaran.ProductsAndCategories.services.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productServ; 
	
	@Autowired
	private CategoryService categoryServ;
	
	@GetMapping("/productHome")
	public String home(@ModelAttribute("newProduct") Product product)
	{
		return"productHome.jsp";
	}
	
	@PostMapping("/createProduct")
	public String createProduct(@ModelAttribute("newProduct") Product product)
	{
		productServ.create(product);
		return "redirect:/productHome";
	}
	
	@GetMapping("/category/home")
	public String categoryHome(@ModelAttribute("newCategory") Category category)
	{
		return"category.jsp";
	}
	
	@PostMapping("/createCategory")
	public String createCategory(@ModelAttribute("newCategory") Category category)
	{
		categoryServ.create(category);
		return "redirect:/category/home";
	}
	
	@GetMapping("/product/{id}")
	public String showProduct(@PathVariable("id") Long id, Model proModel)
	{
		Product onePro=productServ.getSingleProduct(id);
		proModel.addAttribute("allCategories", categoryServ.findCatNotProduct(onePro));
		proModel.addAttribute("product", onePro);
		return "productCategory.jsp";
	}
	
	@GetMapping("/category/{id}")
	public String showCategory(@PathVariable("id") Long id,Model catModel)
	{
		Category oneCat=categoryServ.getSingleCat(id);
		catModel.addAttribute("allProducts", productServ.findproductNotCat(oneCat));
		catModel.addAttribute("category", oneCat);
		return "categoryShow.jsp";
	}
	
	@PostMapping("/addCatToPro/{id}")
	public String addCatToPro(@PathVariable("id") Long product_id, @RequestParam("categories") Long id)
	{
		Product productToAddCategoryTo=productServ.getSingleProduct(product_id);
		Category categoryToAdd =categoryServ.getSingleCat(id);
		productServ.addCategoryToProduct(categoryToAdd, productToAddCategoryTo);
		return "redirect:/createCategory";
	}
	
	@PostMapping("/addProductToCategory/{id}")
	public String addProToCat(@PathVariable("id") Long category_id, @RequestParam("products") Long id)
	{
		Category categoryToAddProductsTo=categoryServ.getSingleCat(category_id);
		Product productToAdd =productServ.getSingleProduct(id);
		categoryServ.addProductToCategory(productToAdd, categoryToAddProductsTo);
		return "redirect:/category/{id}";
	}
	
}

