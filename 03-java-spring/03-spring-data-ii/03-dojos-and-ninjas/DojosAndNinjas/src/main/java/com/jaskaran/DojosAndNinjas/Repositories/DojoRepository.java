package com.jaskaran.DojosAndNinjas.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jaskaran.DojosAndNinjas.models.Dojo;

@Repository
public interface DojoRepository extends  CrudRepository<Dojo, Long>{
	
	List<Dojo> findAll();
	

}
