package com.jaskaran.DojosAndNinjas.Repositories;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jaskaran.DojosAndNinjas.models.Dojo;
import com.jaskaran.DojosAndNinjas.models.Ninjas;

@Repository
public interface NinjaRepository extends  CrudRepository<Ninjas, Long>{
	
	List<Ninjas> findAll();

	List<Dojo> findAllById(Long id);
	

}
