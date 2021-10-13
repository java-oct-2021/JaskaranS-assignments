package com.jaskaransahota.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

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
		Date date=new Date();
		SimpleDateFormat formatter=new SimpleDateFormat("E, dd MMMM yyyy");
		String mydate=formatter.format(date);
		model.addAttribute("date", mydate);
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String gettime(Model model1)
	{
		model1.addAttribute("time",  LocalDateTime.now());
		return "time.jsp";
	}
	
	
	

}
