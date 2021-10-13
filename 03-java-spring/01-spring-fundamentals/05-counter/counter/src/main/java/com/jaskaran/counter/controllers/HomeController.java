package com.jaskaran.counter.controllers;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/your_server")
	public String home(HttpSession session,Model model)
	{
		if (session.getAttribute("count") == null) {
            // Use setAttribute to initialize the count in session
			session.setAttribute("count",0);
        }
        else {
            // increment the count by 1 using getAttribute and setAttribute
        	 Integer currentCount = (Integer) session.getAttribute("count");
        	 currentCount++; 
        	 session.setAttribute("count", currentCount);
        }	
        return "home.jsp";
	}
	
	@RequestMapping("/your_server/counter")
	public String homecounter(HttpSession session,Model model)
	{
		 Integer currentCount = (Integer) session.getAttribute("count");
		 model.addAttribute("countToShow", currentCount);
		 return "counter.jsp";
		 
	}
	@RequestMapping("counterby2")
	public String counter(HttpSession session,Model model)
	{
		if (session.getAttribute("count") == null) {
            // Use setAttribute to initialize the count in session
			session.setAttribute("count",0);
		}
		else
		{
			 // increment the count by 1 using getAttribute and setAttribute
       	 	Integer currentCount = (Integer) session.getAttribute("count");
       	 	currentCount+=2;
       	 	session.setAttribute("count", currentCount);
		}
		return "third.jsp";
	}
	@RequestMapping("/reset")
	public String reset(HttpSession session)
	{	
		if (session.getAttribute("count") != null) {
            // Use setAttribute to initialize the count in session
			session.setAttribute("count",0);
		}
		return "home.jsp";	
	}
	

}
