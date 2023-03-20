package com.alexdev.simpleget.services;

import com.alexdev.simpleget.entity.Order;
import com.alexdev.simpleget.entity.User;
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
        User user = new User();
        user.setUserId(userId);
        return orderRepository.findOrderByUser(user);
    }

    @Override
    public void saveOrder(Order newOrder) {

        orderRepository.save(newOrder);
    }

    @Override
    public void deleteOrderById(Long orderId) {
        orderRepository.deleteById(orderId);
    }

}
