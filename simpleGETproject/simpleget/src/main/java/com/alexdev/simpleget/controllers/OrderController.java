package com.alexdev.simpleget.controllers;

import com.alexdev.simpleget.entity.Order;
import com.alexdev.simpleget.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class OrderController {

    @Autowired
    private OrderService orderService;

    public Order createOrder(@RequestParam Order order){
        return orderService.create(order);
    }

    public List<Order> getOrderByUserId(@PathVariable("userId"))
}
