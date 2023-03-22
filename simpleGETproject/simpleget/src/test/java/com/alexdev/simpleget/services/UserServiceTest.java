package com.alexdev.simpleget.services;

import com.alexdev.simpleget.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    //reviso los commits

    @Mock
    private UserService userService;

    private User userTest1;
    private User userTest2;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        userTest1 = User.builder().userId(1l).dni("9239847").nombre("Pedro").apellido("Perez").email("asdfas@gmail.com").build();
        userTest2 = User.builder().userId(2l).dni("4569847").nombre("Toni").apellido("Pormeo").email("assdfsdfs@gmail.com").build();
    }

    @Test
    void getUsers() {
        List<User> listTest = new ArrayList<>();
        listTest.add(userTest1);
        listTest.add(userTest2);
        Mockito.when(userService.getUsers())
                .thenReturn((ArrayList<User>) listTest);

        assertEquals(listTest.get(0).getUserId(),userTest1.getUserId(),"Check");
        assertEquals(listTest.get(0).getDni(),userTest1.getDni(),"Check");
        assertEquals(listTest.get(0).getNombre(),userTest1.getNombre(),"Check");
        assertEquals(listTest.get(0).getApellido(),userTest1.getApellido(),"Check");
        assertEquals(listTest.get(0).getEmail(),userTest1.getEmail(),"Check");

        assertEquals(listTest.get(1).getUserId(),userTest2.getUserId(),"Check");
        assertEquals(listTest.get(1).getDni(),userTest2.getDni(),"Check");
        assertEquals(listTest.get(1).getNombre(),userTest2.getNombre(),"Check");
        assertEquals(listTest.get(1).getApellido(),userTest2.getApellido(),"Check");
        assertEquals(listTest.get(1).getEmail(),userTest2.getEmail(),"Check");


    }

    @Test
    void getUserById() {
        Mockito.when(userService.getUserById(userTest1.getUserId()))
                .thenReturn(userTest1);
        assertEquals(userService.getUserById(1l), userTest1);
    }

    @Test
    void saveUser() {
        userService.saveUser(userTest1);
        Mockito.verify(userService).saveUser(userTest1);
    }

    @Test
    void deleteUserById() {
       userService.deleteUserById(userTest1.getUserId());
       Mockito.verify(userService).deleteUserById(userTest1.getUserId());
    }
}