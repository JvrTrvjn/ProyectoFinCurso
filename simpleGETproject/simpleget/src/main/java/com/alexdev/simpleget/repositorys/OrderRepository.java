package com.alexdev.simpleget.repositorys;

import com.alexdev.simpleget.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
