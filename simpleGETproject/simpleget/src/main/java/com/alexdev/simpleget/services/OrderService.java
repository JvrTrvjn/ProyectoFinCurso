package com.alexdev.simpleget.services;

import com.alexdev.simpleget.entity.Order;

import java.util.List;

public interface OrderService {
    public List<Order> getAllOrders();

    public Order getOrderByUserId(Long userId);

    public void saveOrder(Order newOrder);


    public void deleteOrderById(Long orderId);
}
