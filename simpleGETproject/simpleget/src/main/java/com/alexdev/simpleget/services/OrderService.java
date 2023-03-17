package com.alexdev.simpleget.services;

import com.alexdev.simpleget.entity.Order;
import com.alexdev.simpleget.entity.User;

import java.util.List;

public interface OrderService {
    public List<Order> getAllOrders();
    public Order getOrderByUserId(Long userId);

    public void updateOrder(Order updateOrder);
    public void deleteOrderById(Long orderId);
}
