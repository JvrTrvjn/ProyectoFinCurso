package com.alexdev.simpleget.services;

import com.alexdev.simpleget.entity.Order;
import com.alexdev.simpleget.repositorys.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository;
    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderByUserId(Long userId) {
        return orderRepository.findByOrderUser(userId);
    }

    @Override
    public void updateOrder(Order updateOrder) {
        orderRepository.save(updateOrder);
    }
    @Override
    public void deleteOrderById(Long orderId) {
        orderRepository.deleteById(orderId);
    }

}
