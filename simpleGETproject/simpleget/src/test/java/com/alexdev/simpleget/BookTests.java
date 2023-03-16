package com.alexdev.simpleget;

import com.alexdev.simpleget.entity.Book;
import com.alexdev.simpleget.repositorys.BookRepository;
import com.alexdev.simpleget.services.BookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class BookTests {
    @Autowired
   private BookRepository repository;

    @Test
    public void saveBookTest(){

      Book book = new Book(8,"Givenchy","Duki", "923475", 3.234f);
       // Book savedBook = service.saveBook(book);
        Book savedBook = repository.save(book);

        Assertions.assertNotNull(savedBook);
    }
}
