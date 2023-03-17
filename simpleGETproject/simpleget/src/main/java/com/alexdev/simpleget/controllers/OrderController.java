package com.alexdev.simpleget.controllers;

import com.alexdev.simpleget.entity.Order;
import com.alexdev.simpleget.entity.User;
import com.alexdev.simpleget.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class OrderController {

    @Autowired
    private OrderService orderService;

    public Order createOrder(@RequestParam Order order){
        return orderService.createOrder(order);
    }

    public List<Order> getOrderByUserId(@PathVariable("userId")Long userId){
        return orderService.getOrderByUserId(userId);
    }

    public void saveOrder(@RequestBody Order order){
        orderService.saveOrder(order);
    }

    public void deleteOrderByUserId(@PathVariable("userId")Long userId){
        orderService.deleteOrderByUserId(userId);
    }

    public void updateOrder(@RequestBody Order updateOrder, @PathVariable Long orderId){
        orderService.updateOrder(Order.builder()
                .orderId(orderId)
                .orderUser(updateOrder.getOrderUser())
                .orderBook(updateOrder.getOrderBook())
                .build());

    }
}
