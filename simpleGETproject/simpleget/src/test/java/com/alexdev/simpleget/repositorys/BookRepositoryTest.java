package com.alexdev.simpleget.repositorys;

import com.alexdev.simpleget.entity.Book;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class BookRepositoryTest {
    @Autowired
    private BookRepository underTest;
    @Test
    public void itShouldfindById() {
        //given
        Book bookTest = new Book(8,"Jueves","Miguel","234234",6.765645f);
        underTest.save(bookTest);
        //When
        boolean expected = underTest.existsById(bookTest.getId());
        //underTest.findById(bookTest.getId());
        //then
       assertThat(expected).isTrue();

    }
}