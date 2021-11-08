package com.Jaskaran.ProductsAndCategories.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Jaskaran.ProductsAndCategories.models.Login;
import com.Jaskaran.ProductsAndCategories.services.LoginService;
import com.Jaskaran.ProductsAndCategories.validators.LoginValidator;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginServ;
	
	@Autowired
	private  LoginValidator validators;
	@GetMapping("/")
	public String homeRegister(@ModelAttribute("user") Login user)
	{
		return "registration.jsp";
	}
	
	@PostMapping("/registration")
	public String register(@Valid @ModelAttribute("user") Login user,BindingResult result,HttpSession session) 
	{
		 // if result has errors, return the registration page (don't worry about validations just now)
		// Email/password validation 
		validators.validate(user, result);
		
		
		if(result.hasErrors())
		{
			return"registration.jsp";
		}
	
		Login currentUser=loginServ.registerUser(user);
		session.setAttribute("userId", currentUser.getId());
		return "redirect:/homeLogin";
	}
	
	@GetMapping("/homeLogin")
	public String login()
	{
		return"login.jsp";
	}
	
	@PostMapping("/login") 
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session, RedirectAttributes redirectAttributes) {
	        // if the user is authenticated, save their user id in session
		if(loginServ.authenticateUser(email, password)) {
			Login user=loginServ.findByEmail(email);
			session.setAttribute("userId", user.getId());
			return "redirect:/productHome";
			
			
		}
	        // else, add error messages and return the login page
		 redirectAttributes.addFlashAttribute("error", "Invaild Email/Password!!!");
		 return "redirect:/homeLogin";
		
	    }

}
