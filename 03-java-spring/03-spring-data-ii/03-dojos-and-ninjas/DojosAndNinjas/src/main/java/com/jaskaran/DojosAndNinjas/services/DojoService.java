package com.jaskaran.DojosAndNinjas.services;

import java.util.List;



import org.springframework.stereotype.Service;

import com.jaskaran.DojosAndNinjas.Repositories.DojoRepository;
import com.jaskaran.DojosAndNinjas.models.Dojo;

@Service
public class DojoService {

	private  DojoRepository dojorepo ; 
	public DojoService( DojoRepository dojorepo)
	{
		this.dojorepo=dojorepo;
	}
	
	public Dojo create(Dojo dojo)
	{
		return dojorepo.save(dojo);
	}
	
	public List<Dojo> getAll()
	{
		return dojorepo.findAll();
	}
	public Dojo find(Long id)
	{
		return dojorepo.findById(id).orElse(null);
	}
}
