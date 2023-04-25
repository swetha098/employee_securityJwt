package com.ust.EmployeesecurityJwt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.EmployeesecurityJwt.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);
	
	
	
}
