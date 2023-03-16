package com.alexdev.simpleget.controllers;

import org.springframework.beans.factory.annotation.Autowired;
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

	@GetMapping("/book/{id}")
	public Book getBook(@PathVariable Long id) {
		return bookService.getBook(id);
	}


	@RequestMapping(method = RequestMethod.POST, value ="/books")
	public void saveBook(@RequestBody Book newBook){
		bookService.saveBook(newBook);
	}
	@DeleteMapping("/book/{id}")
	public void deleteById(@PathVariable Long id){
		bookService.delete(id);
	}
	@PutMapping(value ="/books/{id}")
	public void update (@RequestBody Book updateBook, @PathVariable Long id) {
		bookService.saveBook(Book.builder()
				.id(id)
				.title(updateBook.getTitle())
				.author(updateBook.getAuthor())
				.price(updateBook.getPrice())
				.ISBN(updateBook.getISBN()).build());

	}


}