package com.alexdev.simpleget.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
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
}