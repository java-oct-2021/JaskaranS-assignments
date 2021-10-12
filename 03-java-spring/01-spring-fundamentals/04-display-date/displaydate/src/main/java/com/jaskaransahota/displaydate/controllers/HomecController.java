package com.jaskaransahota.displaydate.controllers;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomecController {
	@RequestMapping("/")
	public String home()
	{
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String getdate(Model model)
	{
		model.addAttribute("date", new java.util.Date());
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String gettime(Model model1)
	{
		model1.addAttribute("time",  LocalDateTime.now());
		return "time.jsp";
	}
	
	
	

}
