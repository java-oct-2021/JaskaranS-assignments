package com.jaskaran.license.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.jaskaran.license.models.Person;
import com.jaskaran.license.services.PersonService;

@Controller
public class PersonController {
	
	
	
	@GetMapping("/")
	public String userhome(@ModelAttribute("user") Person person)
	{
		return "index.jsp";
	}

}
