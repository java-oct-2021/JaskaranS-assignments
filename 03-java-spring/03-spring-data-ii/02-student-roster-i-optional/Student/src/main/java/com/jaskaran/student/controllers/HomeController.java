package com.jaskaran.student.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jaskaran.student.models.Contact;
import com.jaskaran.student.models.Student;
import com.jaskaran.student.services.ContactService;
import com.jaskaran.student.services.StudentService;

@Controller
public class HomeController {
	
	@Autowired
	private StudentService studentserv; 
	@Autowired
	private ContactService contactServ;
	@GetMapping("/")
	public String home(@ModelAttribute("newStudent") Student student)
	{
			return"home.jsp";
	}
	
	@PostMapping("/createStudent")
	public String newstudent(@ModelAttribute("newStudent") Student student)
	{
		studentserv.create(student);
		return"redirect:/contact";
	}
	
	@GetMapping("/contact")
	public String studentContact(@ModelAttribute("studentContact") Contact contact, Model model )
	{
		List<Student> students=studentserv.all();
		model.addAttribute("students", students);
		return "contact.jsp";
	}
	
	@PostMapping("/studentAddress")
	public String studentAdress(@ModelAttribute("studentContact") Contact contact)
	{
		contactServ.create(contact);
		return "redirect:/allStudents";
	}
	
	@GetMapping("/allStudents")
	public String all(Model model)
	{
		List<Student> students=studentserv.all();
		model.addAttribute("students", students);
		return "allStudents.jsp";
		
	}
}
