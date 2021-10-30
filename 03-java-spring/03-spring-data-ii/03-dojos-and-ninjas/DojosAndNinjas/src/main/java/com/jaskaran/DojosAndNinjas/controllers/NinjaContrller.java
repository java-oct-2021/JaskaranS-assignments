package com.jaskaran.DojosAndNinjas.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.jaskaran.DojosAndNinjas.models.Dojo;
import com.jaskaran.DojosAndNinjas.models.Ninjas;
import com.jaskaran.DojosAndNinjas.services.NinjaService;

@Controller
public class NinjaContrller {
	private NinjaService ninjaserv;
	
	public NinjaContrller(NinjaService ninjaserv)
	{
		this.ninjaserv=ninjaserv;
	}
	
	@PostMapping("/createNinja")
	public String newNinja(@ModelAttribute("newNinja") Ninjas ninja)
	{
		ninjaserv.create(ninja);
		return "redirect:/allninjas";
	}
	
	@GetMapping("/allninjas")
	public String all(Model model)
	{
		List<Ninjas> ninjas=ninjaserv.getAll();
		model.addAttribute("ninjas", ninjas);
		
		return "location.jsp";
	}
}
