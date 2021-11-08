package com.Jaskaran.ProductsAndCategories.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Jaskaran.ProductsAndCategories.models.Login;

@Repository
public interface LoginRepository extends CrudRepository<Login, Long>{
	Login findByEmail(String email);
	
}
