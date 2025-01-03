package com.thiagoNc20.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagoNc20.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
