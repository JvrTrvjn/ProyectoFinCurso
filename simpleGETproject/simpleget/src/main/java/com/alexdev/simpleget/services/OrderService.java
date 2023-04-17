package com.alexdev.simpleget.services;

import com.alexdev.simpleget.entity.Order;

import java.util.List;

public interface OrderService {
    public List<Order> getAllOrders();

    public Order getOrderById(Long orderId);

    public void saveOrder(Order newOrder);


    public void deleteOrderById(Long orderId);
}
