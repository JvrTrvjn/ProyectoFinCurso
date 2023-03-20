package com.alexdev.simpleget.services;

import com.alexdev.simpleget.entity.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BookServiceTests {

    @Mock
    private BookService bookService;

    private Book bookTest1;
    private Book bookTest2;

    @BeforeEach
    public void setup(){
        MockitoAnnotations.initMocks(this);
        bookTest1 = new Book();
        bookTest1.setId(1l);
        bookTest1.setTitle("sdfgsdf");
        bookTest1.setAuthor("sdfsdfsdf");
        bookTest1.setISBN("23423423");
        bookTest1.setPrice(8.234f);

        MockitoAnnotations.initMocks(this);
        bookTest2 = new Book();
        bookTest2.setId(2l);
        bookTest2.setTitle("sfdsdfsdf");
        bookTest2.setAuthor("sdfdf");
        bookTest2.setISBN("23423423");
        bookTest2.setPrice(10.234f);

    }
    @Test
    public void findAllTest() {
        List<Book> listTest = new ArrayList<>();
        listTest.add(bookTest1);
        listTest.add(bookTest2);
        Mockito.when(bookService.getBooks()).thenReturn((ArrayList<Book>) listTest);

        assertEquals(listTest.get(0).getId(), bookTest1.getId());
        assertEquals(listTest.get(0).getTitle(), bookTest1.getTitle());
        assertEquals(listTest.get(0).getAuthor(), bookTest1.getAuthor());
        assertEquals(listTest.get(0).getISBN(), bookTest1.getISBN());
        assertEquals(listTest.get(0).getPrice(), bookTest1.getPrice());

        assertEquals(listTest.get(1).getId(), bookTest2.getId());
        assertEquals(listTest.get(1).getTitle(), bookTest2.getTitle());
        assertEquals(listTest.get(1).getAuthor(), bookTest2.getAuthor());
        assertEquals(listTest.get(1).getISBN(), bookTest2.getISBN());
        assertEquals(listTest.get(1).getPrice(), bookTest2.getPrice());

    }
    @Test
    public void findByIdTest(){
        Long bookId = bookTest1.getId();
        Mockito.when(bookService.getBook(bookTest1.getId())).thenReturn(bookTest1);
        assertEquals(bookService.getBook(bookId), bookTest1);
    }

    @Test
    public void deleteByIdTest(){
        bookService.delete(bookTest1.getId());
        Mockito.verify(bookService).delete(bookTest1.getId());
    }
    @Test
    public void save(){
        bookService.saveBook(bookTest1);
        Mockito.verify(bookService).saveBook(bookTest1);
    }
}
