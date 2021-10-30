package com.jaskaran.license.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaskaran.license.repositories.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private  PersonRepository personserv ;
}
