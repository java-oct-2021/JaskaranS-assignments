package com.jaskaran.student.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jaskaran.student.models.Contact;

@Repository
public interface ContactReposiotry  extends CrudRepository<Contact, Long>{
		
	List<Contact> findAll();

}
