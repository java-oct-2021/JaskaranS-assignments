package com.jaskaran_sahota.routing.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dojo")
public class DojoController {
	@RequestMapping(" ")
	public String home()
	{
	return "The  dojo is awesome!!";
	}
	@RequestMapping("/{location}")
	public String locationdojo(@PathVariable String location)
	{
		if (location.equals("Banburk") || location.equals("banburk"))
		{
			return location+ " is located in Southern California";
		}
		else if (location.equals("San Jose") ||location.equals("san jose"))
		{
			return location+ " dojo is the headquarter ";
		}
		return location+" is the best holiday destination";
	}
}

// try different way but doesa not work
//@RequestMapping("/{name}")
//public class DojoController {
//	@RequestMapping(" ")
//	public String home(@PathVariable("name") String name)
//	{
//		return "The "+name+" is awesome!!";
//	}
//	@RequestMapping("/{location}")
//	public String locationdojo(@PathVariable("name") String name,@PathVariable String location)
//	{
//		return location+" "+name+" is located in Southern California";
//	}
//	@RequestMapping("/{name}/{hq}")
//	public String headquarter(@PathVariable("name") String name,@PathVariable String hq)
//	{
//		return hq+" "+name+" is the headquaters";
//}	
	



