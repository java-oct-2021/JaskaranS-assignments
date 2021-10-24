package com.jaskaran.books.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.jaskaran.books.models.Books;
import com.jaskaran.books.services.BookService;

@Controller
public class BooksController {
private final BookService bookService;
	
	public BooksController(BookService bookservice)
	{
		this.bookService=bookservice;
	}
	
	@GetMapping("/")
	public String index(@ModelAttribute("newBook") Books book)
	{
		return "home.jsp";
	}
	
	
	//Create new book
	@PostMapping("/createbook")
	public String create(@ModelAttribute("newBook") Books book)
	{
		Books newBook=bookService.create(book);
		return "redirect:/books";
	}
	
	//Fetch all books
		@GetMapping("/books")
		public String booksall(Model bookmodel)
		{
			 List<Books> books = bookService.allBooks();
			 bookmodel.addAttribute("books",books);
			 return "index.jsp";
		}
	//Fetch only one
		@GetMapping("/show/{id}")
		public String view(@PathVariable("id") Long id,Model bookone)
		{
			Books book=this.bookService.findone(id);
			bookone.addAttribute("book",book);
			return "singlebook.jsp";
		}
		
	//Delete 
		@DeleteMapping("/books/{id}")
		public String destroy(@PathVariable("id") Long id,Model bookone)
		{
			this.bookService.deleteone(id);
			return "redirect:/books";
		}

}
