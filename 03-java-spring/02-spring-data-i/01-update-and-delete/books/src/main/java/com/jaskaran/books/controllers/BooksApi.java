package com.jaskaran.books.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jaskaran.books.models.Books;
import com.jaskaran.books.services.BookService;

@RestController
public class BooksApi {
	private final BookService bookservice;
	
	public BooksApi(BookService bookservice)
	{
		this.bookservice=bookservice;
	}
	
	//Fetch all books
	@GetMapping("/books")
	private List<Books> findallbooks()
	{
		return this.bookservice.allBooks();
	}
	
	//Create new book
	@PostMapping("/api/create")
	private Books newbook(Books book)
	{
		return this.bookservice.create(book);
	}
	
	//update Book
	@PutMapping("/api/update/{id}")
	private Books update(@PathVariable("id") Long id, @RequestParam(value="title") String title,@RequestParam(value="author") String author,@RequestParam(value="language") String language, @RequestParam(value="pages") Integer pages)
	{ 
		
		return bookservice.updateBook(id,title,author,language, pages);
	}
	//Delete Book
	@DeleteMapping("/api/delete/{id}")
	private String destroy(@PathVariable("id") long id)
	{
			bookservice.deleteone(id);
			return "book is deleted at"+id ;
	}
	
}
