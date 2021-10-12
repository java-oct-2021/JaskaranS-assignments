package com.jaskaransahota.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello 
{
	    @RequestMapping("/")
	    public String index(@RequestParam(value="first_name", required=false,defaultValue="Human") String first_name, @RequestParam(value="last_name",required=false,defaultValue="") String last_name)
	    {
	    	return "Hello "+ first_name +" "+last_name;	
	    }
}


