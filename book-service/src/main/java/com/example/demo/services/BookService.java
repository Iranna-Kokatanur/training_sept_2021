package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;

@Service
public class BookService {
	
	@Autowired
	private Book book;
	
	public Book getBook(int id) {
		
		book.setAuthor("Kathy Sieera");
		book.setBookId(202);
		book.setBookName("Head First Java");
		
		if(id==1) {
			book.setAuthor("Victor");
			book.setBookId(203);
			book.setBookName("Effective Java");
		}
		
		return this.book;
		
	}

}
