package com.alexdev.simpleget.controllers;

import com.alexdev.simpleget.entity.Order;
import com.alexdev.simpleget.entity.User;
import com.alexdev.simpleget.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public List<Order> getAllOrders(@RequestParam Order order){
        return orderService.getAllOrders(order);
    }
    @GetMapping("/orders/{userId}")
    public Order getOrderByUserId(@PathVariable("userId")Long userId){
        return orderService.getOrderByUserId(userId);
    }

    @PostMapping("/orders")
    public void saveOrder(@RequestBody Order order){
        orderService.saveOrder(order);
    }

    @DeleteMapping("/orders/{userId}")
    public void deleteOrderByUserId(@PathVariable("userId")Long userId){
        orderService.deleteOrderByUserId(userId);
    }

    @PutMapping("/orders/{userId}")
    public void updateOrder(@RequestBody Order updateOrder, @PathVariable Long orderId){
        orderService.updateOrder(Order.builder()
                .orderId(orderId)
                .orderUser(updateOrder.getOrderUser())
                .orderBook(updateOrder.getOrderBook())
                .build());

    }
}
