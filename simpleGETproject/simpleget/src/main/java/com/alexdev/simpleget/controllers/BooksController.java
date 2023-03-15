package com.alexdev.simpleget.controllers;

import com.alexdev.simpleget.repositorys.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.alexdev.simpleget.services.BookService;

import com.alexdev.simpleget.entity.Book;
import org.springframework.web.servlet.support.JstlUtils;

import java.util.List;
import java.util.Optional;


@RestController
public class BooksController {

    @Autowired
    private BookService bookService;
	@Autowired
	private BookRepository bookRepository;

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
	public void update (@RequestBody Book updateBook, @PathVariable Long id) {

		bookService.save(Book.builder().id(id).title(updateBook.getTitle())
				.author(updateBook.getAuthor()).price(updateBook.getPrice())
				.ISBN(updateBook.getISBN()).build());


		/*Optional<Book> bookOptional = bookService.getBook(id);
		if(bookOptional.isEmpty())
			return ResponseEntity.notFound().build();
		updateBook.setId(id);
		bookService.save(updateBook);
		return  ResponseEntity.noContent().build();
	/*public Book update(@RequestBody Book updateBook, @PathVariable Long id){
		Book upBook = bookService.getBook(id);
		upBook.setTitle(updateBook.getTitle());
		upBook.setAuthor(updateBook.getAuthor());
		upBook.setPrice(updateBook.getPrice());
		upBook.setISBN(updateBook.getISBN());
		bookService.save(upBook);
		return upBook;*/
	}
	/*@PutMapping(value ="/books/{id}")
	public void updateBook(@RequestBody Book newBook,@PathVariable Long id){
		if(id.equals(newBook.getId())){
			bookService.delete(id);
			bookService.save(newBook);}
		else {
			bookService.save(newBook);}
	}*/

}