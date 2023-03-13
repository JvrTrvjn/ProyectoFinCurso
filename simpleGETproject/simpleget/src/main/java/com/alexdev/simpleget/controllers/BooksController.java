package com.alexdev.simpleget.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.alexdev.simpleget.services.BookService;

import com.alexdev.simpleget.entity.Book;

import java.util.List;


@RestController
public class BooksController {

    @Autowired
    private BookService bookService;

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return bookService.getBooks();
	}

	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable Long id) {
		return bookService.getBook(id);
	}


	@RequestMapping(method = RequestMethod.POST, value ="/books")
	public void saveBook(@RequestBody Book newBook){
		bookService.save(newBook);
	}
	@DeleteMapping("/books/{id}")
	public void deleteById(@PathVariable Long id){
		bookService.delete(id);
	}
	@PutMapping(value ="/books/{id}")
	public void updateBook(@RequestBody Book newBook,@PathVariable Long id){
		if(id.equals(newBook.getId())){
			bookService.delete(id);
			bookService.save(newBook);}
		else {
			bookService.save(newBook);}
	}

}