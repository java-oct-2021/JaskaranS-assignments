package com.Jaskaran.ProductsAndCategories.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.Jaskaran.ProductsAndCategories.models.Login;
import com.Jaskaran.ProductsAndCategories.repositories.LoginRepository;
import org.springframework.validation.Validator;

@Component
public class LoginValidator implements Validator {
	
	@Autowired
	private LoginRepository uRepo;
    
    // 1
    @Override
    public boolean supports(Class<?> clazz) {
        return Login.class.equals(clazz);
    }
    
    // 2
    @Override
    public void validate(Object target, Errors errors) {
        Login user = (Login) target;
        
        if (!user.getPasswordConfirmation().equals(user.getPassword())) {
            // 3
            errors.rejectValue("password", "Match","Password Does not match");
        }  
        
        if(this.uRepo.findByEmail(user.getEmail()) != null) {
        	errors.rejectValue("email", "Unique","Email address already exist");
        }
        
    }
}


