package com.thiagoNc20.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagoNc20.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
}
