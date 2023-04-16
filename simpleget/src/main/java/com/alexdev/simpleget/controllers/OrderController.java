package com.alexdev.simpleget.controllers;
import com.alexdev.simpleget.entity.Order;
import com.alexdev.simpleget.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }
    @GetMapping("/orders/{userId}")
    public Order getOrderByUserId(@PathVariable("userId")Long userId){
        return orderService.getOrderByUserId(userId);
    }


    @PutMapping("/orders/{orderId}")
    public void updateOrder(@RequestBody Order updateOrder, @PathVariable Long orderId){
        orderService.updateOrder(Order.builder()
                .orderId(orderId)
                .orderUser(updateOrder.getOrderUser())
                .orderBook(updateOrder.getOrderBook())
                .build());

    }
    @DeleteMapping("/orders/{orderId}")
    public void deleteOrderByUserId(@PathVariable("orderId")Long orderId){
        orderService.deleteOrderById(orderId);
    }
}
