package com.jaskaran.languages.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.jaskaran.languages.ervices.LanguageService;
import com.jaskaran.languages.models.Languages;

@Controller
public class HomeController {
	private final LanguageService languageServ;

	public HomeController(LanguageService languageServ) {
		this.languageServ = languageServ;
	}
	
	//Mapping to Home page and get all languages
	@GetMapping("/")
	public String home(@ModelAttribute("newLanguage") Languages language,Model lang)
	{
		List<Languages> languages=languageServ.findAllLanguages();
		lang.addAttribute("languages", languages);
		return "home.jsp";
	}
	
	//Create new Language
		@PostMapping("/createlanguage")
		public String create(@ModelAttribute("newLanguage")Languages language)
		{
			languageServ.create(language);
			return "redirect:/";
		}
	
	//Access one language
	@GetMapping("/show/{id}")
	public String showOne (@PathVariable("id") Long id,Model one)
	{
		Languages language=languageServ.findOne(id);
		one.addAttribute("language", language);
		return "showone.jsp";
	}
	
	//Delete Language
	@DeleteMapping("/languages/{id}")
	public String destroy(@PathVariable("id")Long id)
	{
		languageServ.destroy(id);
		return"redirect:/";
	}
	
	//Edit Page
	@GetMapping("/language/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model )
	{
		Languages language=languageServ.findOne(id);
		model.addAttribute("language", language);
		return "edit.jsp";
	}
	
	//update Page
	@PutMapping("/languages/{id}")
	public String update(@PathVariable("id") Long id, @ModelAttribute("lang")Languages language)
	{
		languageServ.updateLanguage(language);
		return"redirect:/";
	}
}
