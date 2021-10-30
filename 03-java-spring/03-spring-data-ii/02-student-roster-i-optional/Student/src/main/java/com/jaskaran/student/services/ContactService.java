package com.jaskaran.student.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaskaran.student.models.Contact;
import com.jaskaran.student.repositories.ContactReposiotry;

@Service
public class ContactService {
	
	@Autowired
	private ContactReposiotry contactRepo;
	
	public Contact create(Contact contact)
	{
		return contactRepo.save(contact);
	}

}
