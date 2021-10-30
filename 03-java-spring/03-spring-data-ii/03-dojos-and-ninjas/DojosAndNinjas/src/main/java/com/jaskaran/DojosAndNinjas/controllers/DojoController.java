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
import com.jaskaran.DojosAndNinjas.services.DojoService;

@Controller
public class DojoController {
	
	private DojoService dojoserv;
	public DojoController(DojoService dojoserv)
	{
		this.dojoserv=dojoserv;
	}
	
	@GetMapping("/")
	public String home(@ModelAttribute("newDojo") Dojo dojo)
	{
		return "home.jsp";
	}
	
	@PostMapping("/createDojo")
	public String newDojo(@ModelAttribute("newDojo") Dojo dojo)
	{
		dojoserv.create(dojo);
		return "redirect:/getNinja";
	}
	
	@GetMapping("/getNinja")
	public String ninjaHome(Model dojomodel,@ModelAttribute("newNinja") Ninjas ninja)
	{	List<Dojo>dojos=dojoserv.getAll();
		dojomodel.addAttribute("dojos", dojos);
		return"ninjahome.jsp";
	}
	@GetMapping("/showone/{id}")
	public String all(@PathVariable("id") Long id,Model model)
	{
		model.addAttribute("dojos", dojoserv.find(id));
		return "one.jsp";
	}
	
}
