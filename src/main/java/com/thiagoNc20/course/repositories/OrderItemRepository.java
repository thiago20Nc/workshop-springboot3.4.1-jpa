package com.thiagoNc20.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagoNc20.course.entities.OrderItem;
import com.thiagoNc20.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
	
}
