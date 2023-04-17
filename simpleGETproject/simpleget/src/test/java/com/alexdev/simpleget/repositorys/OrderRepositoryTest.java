package com.alexdev.simpleget.repositorys;

import com.alexdev.simpleget.entity.Book;
import com.alexdev.simpleget.entity.Order;
import com.alexdev.simpleget.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderRepositoryTest {

    @Mock
    private OrderRepository orderRepository;

    private Order orderTest1;
    private Order orderTest2;

    User user1 = new User(1l,"1234123","Agapito", "Da sousa","aga@gmail.com");
    User user2 = new User(2l,"0004123","Fulano", "Casual","fun@gmail.com");
    Book book1 = new Book(1l,"Rojo","Miguel","0987",9.30f);
    Book book2 = new Book(2l,"Azul","Ruben","1234",2.39f);


    @BeforeEach
    void setUp() {

        MockitoAnnotations.initMocks(this);
        orderTest1 = Order.builder()
                .orderId(1l)
                .orderUser(user1)
                .orderBook(book1)
                .cantidad(2).build();

        MockitoAnnotations.initMocks(this);
        orderTest2 = Order.builder()
                .orderId(2l)
                .orderUser(user2)
                .orderBook(book2)
                .cantidad(2).build();

    }

    @Test
    void findAll() {

        List<Order> orderListTest = new ArrayList<>();
        orderListTest.add(orderTest1);
        orderListTest.add(orderTest2);
        Mockito.when(orderRepository.findAll())
                .thenReturn(orderListTest);

        assertEquals(orderListTest.get(0).getOrderId(), orderTest1.getOrderId());
        assertEquals(orderListTest.get(0).getOrderUser(), orderTest1.getOrderUser());
        assertEquals(orderListTest.get(0).getOrderBook(), orderTest1.getOrderBook());
        assertEquals(orderListTest.get(0).getCantidad(), orderTest1.getCantidad());

        assertEquals(orderListTest.get(1).getOrderId(), orderTest2.getOrderId());
        assertEquals(orderListTest.get(1).getOrderUser(), orderTest2.getOrderUser());
        assertEquals(orderListTest.get(1).getOrderBook(), orderTest2.getOrderBook());
        assertEquals(orderListTest.get(1).getCantidad(), orderTest2.getCantidad());
    }

    @Test
    void findOrderByUser() {
        Mockito.when(orderRepository.findByOrderId(user1.getUserId())).thenReturn(orderTest1);
        assertEquals(orderRepository.findByOrderId(user1.getUserId()), orderTest1);
    }

    @Test
    void save() {
        Mockito.when(orderRepository.save(orderTest1)).thenReturn(orderTest2);
        orderRepository.findById(orderTest1.getOrderId());
    }

    @Test
    void deleteById() {
        Mockito.when(orderRepository.findById(orderTest1.getOrderId())).thenReturn(Optional.ofNullable(orderTest1));
        orderRepository.deleteById(orderTest1.getOrderId());
        Mockito.verify(orderRepository).deleteById(orderTest1.getOrderId());
    }
}