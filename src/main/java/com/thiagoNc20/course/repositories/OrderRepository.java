package com.thiagoNc20.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagoNc20.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
}
