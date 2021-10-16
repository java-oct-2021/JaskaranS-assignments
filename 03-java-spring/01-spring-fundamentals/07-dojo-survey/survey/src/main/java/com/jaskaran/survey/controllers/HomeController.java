package com.jaskaran.survey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home()
	{		
		return"home.jsp";
		
	}
	@RequestMapping(path="/survey", method=RequestMethod.POST)
	public String login(@RequestParam(value="name")String name,@RequestParam(value="location")String location,@RequestParam(value="language")String language,@RequestParam(value="comment")String comment, Model model)
	{
		model.addAttribute("name", name);
		model.addAttribute("location", location);
		model.addAttribute("language", language);
		model.addAttribute("comment", comment);
		return "dashboard.jsp";
	}
	//using Redirect
//	@RequestMapping("/dashboard")
//	public String dashboard()
//	{
//		return "dashboard.jsp";
//	}
}
