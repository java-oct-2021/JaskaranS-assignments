package com.jaskaran.books.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jaskaran.books.models.Books;
import com.jaskaran.books.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookrepo;
	
	public BookService(BookRepository bookrepo)
	{
		this.bookrepo=bookrepo;
	}
	
	public List<Books> allBooks()
	{
		return bookrepo.findAll();
	}
	
	public Books create(Books book )
	{
		return bookrepo.save(book); 
	}
	
    public Books updateBook(Long id, String title, String author, String language, Integer pages) {
   		Optional<Books> optionalBook = bookrepo.findById(id);
   		if(optionalBook.isPresent()) {
   			Books book = optionalBook.get();
   			book.setTitle(title);
   			book.setAuthor(author);
   			book.setLanguage(language);
   			book.setPages(pages);
   			
   			return bookrepo.save(book);
   		} else {
   			return null;
   		}
       }
	
	public void deleteone(Long id )
	{
		 bookrepo.deleteById(id); 
	}
}
