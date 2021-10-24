package com.jaskaran.books.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jaskaran.books.models.Books;

@Repository
public interface BookRepository extends CrudRepository<Books, Long>  {
	List<Books> findAll();

}
