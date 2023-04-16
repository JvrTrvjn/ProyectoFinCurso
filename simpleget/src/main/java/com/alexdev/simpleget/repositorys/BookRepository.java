package com.alexdev.simpleget.repositorys;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.alexdev.simpleget.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
    public ArrayList<Book> findAll();
    public Optional<Book> findById(Long id);

    public Book save(Book newBook);

    public void deleteById(Long id);
}
