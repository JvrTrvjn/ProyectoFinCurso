package com.alexdev.simpleget.repositorys;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.alexdev.simpleget.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
    public ArrayList<Book> findAll();
    public Book findById(long id);

    public Book save(Book newBook);

    public void deleteById();


}
