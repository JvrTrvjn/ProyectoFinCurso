package com.alexdev.simpleget.services;

import com.alexdev.simpleget.entity.Book;
import com.alexdev.simpleget.repositorys.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class BookServiceImplTest {

    @Mock
    private BookRepository repository;

    @InjectMocks
    private BookServiceImpl bookService;

    private Book bookTest;
    private Book bookTest2;

    @BeforeEach
    void setup(){
        MockitoAnnotations.initMocks(this);
        bookTest = new Book();
        bookTest.setId(8);
        bookTest.setTitle("sdfgsdf");
        bookTest.setAuthor("sdfsdfsdf");
        bookTest.setISBN("23423423");
        bookTest.setPrice(8.234f);
    }
    @Test
    void getBooks() {
        when(repository.findAll()).thenReturn((ArrayList<Book>) Arrays.asList(bookTest));
        assertNotNull(bookService.getBooks());
    }
}