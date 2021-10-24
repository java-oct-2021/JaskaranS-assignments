package com.jaskaran.languages.ervices;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jaskaran.languages.models.Languages;
import com.jaskaran.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository languageRepo; 
	
	public LanguageService(LanguageRepository languageRepo)
	{
		this.languageRepo=languageRepo;
	}
	
	public List<Languages> findAllLanguages()
	{
		return languageRepo.findAll();
	}
	public Languages create(Languages language )
	{
		return languageRepo.save(language); 
	}
	
	public Languages findOne(Long id)
	{
		return languageRepo.findById(id).orElse(null);
	}
	
	public void destroy(Long id)
	{
		 languageRepo.deleteById(id);
	}
	
	public Languages updateLanguage(Languages language)
	{
		return languageRepo.save(language); 
	}
}
