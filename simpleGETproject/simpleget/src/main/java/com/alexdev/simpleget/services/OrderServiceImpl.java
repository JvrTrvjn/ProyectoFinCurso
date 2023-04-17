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
    public Order getOrderById(Long orderId) {
        //Order order = new Order();
        //order.setOrderId(orderId);
        return orderRepository.findByOrderId(orderId);
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
