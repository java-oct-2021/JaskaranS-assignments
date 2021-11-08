package com.Jaskaran.ProductsAndCategories.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Jaskaran.ProductsAndCategories.models.Login;
import com.Jaskaran.ProductsAndCategories.repositories.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository loginRepo;
	
	// register user and hash their password
    public Login registerUser(Login user) {
        String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashed);
        return loginRepo.save(user);
    }
    
    // find user by email
    public Login findByEmail(String email) {
        return loginRepo.findByEmail(email);
    }
        
    // find user by id
     public Login findUserById(Long id) {
    	 return loginRepo.findById(id).orElse(null);
     }
     // authenticate user
     public boolean authenticateUser(String email, String password) {
         // first find the user by email
         Login user = loginRepo.findByEmail(email);
         // if we can't find it by email, return false
         if(user == null) {
             return false;
         } else {
             // if the passwords match, return true, else, return false
             if(BCrypt.checkpw(password, user.getPassword())) {
                 return true;
             } else {
                 return false;
             }
         }
     }
}
