package com.alexdev.simpleget.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.alexdev.simpleget.entity.Book;
import com.alexdev.simpleget.repositorys.BookRepository;
import java.util.List;


public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    @Override
    public Book getBook(Long id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public void save(Book newBook) {
        bookRepository.save(newBook);
    }

    @Override
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }





    /*@Override
    public void saveBook(NewBookRequest request) {
        {
            Book book = new Book();
            book.setId(request.id());
            book.setTitle(request.title());
            book.setAuthor(request.author());
            book.setISBN(request.ISBN());
            book.setPrice(request.price());
            bookRepository.save(book);
        }


    }*/
}
