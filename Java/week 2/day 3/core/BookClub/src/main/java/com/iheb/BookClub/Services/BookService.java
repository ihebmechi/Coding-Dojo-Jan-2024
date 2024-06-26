package com.iheb.BookClub.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iheb.BookClub.Models.Book;
import com.iheb.BookClub.Repositories.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepo;
	
	//create
	public Book createBook(Book book) {
		return bookRepo.save(book);
	}
	
	//Read One
	public Book findBookById(Long id) {
		Optional<Book> optBook = bookRepo.findById(id);
			if(optBook.isPresent()) {
				return optBook.get();
			}
		return null;
	}
	
	//read all 
	public List<Book> allBook(){
		return bookRepo.findAll();
	}
	
	//edit 
	public Book updateBook(Book book) {
		return bookRepo.save(book);
	}
	
	//delete
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}
	
	

}
