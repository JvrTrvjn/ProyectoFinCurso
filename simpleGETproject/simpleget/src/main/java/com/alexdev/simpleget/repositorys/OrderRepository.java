package com.alexdev.simpleget.repositorys;

import com.alexdev.simpleget.entity.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

public List<Order> findAll();
public Order findByOrderUser(Long userId);
public Order save(Order updateOrder);
 public void deleteByOrderId(Long orderId);
}
