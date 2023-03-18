package com.alexdev.simpleget.controllers;

import com.alexdev.simpleget.entity.Book;
import com.alexdev.simpleget.entity.Order;
import com.alexdev.simpleget.entity.User;
import com.alexdev.simpleget.services.BookService;
import com.alexdev.simpleget.services.OrderService;
import com.alexdev.simpleget.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private BookService bookService;

    @Autowired
    private UserService userService;

    @GetMapping("/orders")
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }
    @GetMapping("/order/{userId}")
    public Order getOrderByUserId(@PathVariable("userId")Long userId){
        return orderService.getOrderByUserId(userId);
    }

    @PostMapping("/orders")
    public void saveOrder(@RequestBody Order newOrder){
        Book book = newOrder.getOrderBook();
        bookService.saveBook(book);

        User user = newOrder.getOrderUser();
        userService.saveUser(user);

        newOrder.setOrderBook(book);
        newOrder.setOrderUser(user);

        orderService.saveOrder(newOrder);
    }


    @PutMapping("/order/{orderId}")
    public void updateOrder(@RequestBody Order updateOrder, @PathVariable Long orderId){
        orderService.saveOrder(Order.builder()
                .orderId(orderId)
                .orderUser(updateOrder.getOrderUser())
                .orderBook(updateOrder.getOrderBook())
                .cantidad(updateOrder.getCantidad())
                .build());

    }
    @DeleteMapping("/order/{orderId}")
    public void deleteOrderByUserId(@PathVariable("orderId")Long orderId){
        orderService.deleteOrderById(orderId);
    }
}
