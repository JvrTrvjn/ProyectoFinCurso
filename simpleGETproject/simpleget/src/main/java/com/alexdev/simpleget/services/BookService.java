

package com.alexdev.simpleget.services;

import java.util.List;

import com.alexdev.simpleget.entity.Book;

public interface BookService {

    public List<Book> getBooks();

    public Book getBook(Long id);

    public void save(Book newBook);

    public void delete(Long id);



}



