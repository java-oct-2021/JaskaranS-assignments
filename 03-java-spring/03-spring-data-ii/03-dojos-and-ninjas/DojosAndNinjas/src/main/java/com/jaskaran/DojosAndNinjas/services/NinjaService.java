package com.jaskaran.DojosAndNinjas.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.jaskaran.DojosAndNinjas.Repositories.DojoRepository;
import com.jaskaran.DojosAndNinjas.Repositories.NinjaRepository;
import com.jaskaran.DojosAndNinjas.models.Dojo;
import com.jaskaran.DojosAndNinjas.models.Ninjas;

@Service
public class NinjaService {
	
	private NinjaRepository ninjarepo;
	public NinjaService(NinjaRepository ninjarepo,DojoRepository dojorep)
	{
		this.ninjarepo=ninjarepo;
		
	}
	
	public Ninjas create(Ninjas ninja)
	{
		return ninjarepo.save(ninja);
	}
	
	public List<Ninjas> getAll()
	{
		return ninjarepo.findAll();
	}
	
}
