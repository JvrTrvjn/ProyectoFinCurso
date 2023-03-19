package com.alexdev.simpleget.repositorys;

import com.alexdev.simpleget.entity.Book;
import com.alexdev.simpleget.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {
    @Mock
    private UserRepository userRepository;

    private User userTest1;
    private User userTest2;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        userTest1.builder().userId(1l)
                .dni("12345")
                .nombre("Pepe")
                .apellido("Lopez")
                .email("j@gmail.com").build();

        MockitoAnnotations.initMocks(this);
        userTest2.builder().userId(2l)
                .dni("987654")
                .nombre("Enrique")
                .apellido("Goikochea")
                .email("enrgoik@hotmail.com").build();
    }

    @Test
    void findAll() {
        List<User> listTest = new ArrayList<>();
        listTest.add(userTest1);
        listTest.add(userTest2);
        Mockito.when(userRepository.findAll())
                .thenReturn((ArrayList<User>) listTest);

    }

    @Test
    void findByUserId() {
    }

    @Test
    void save() {
    }

    @Test
    void deleteByUserId() {
    }
}