package com.ust.EmployeesecurityJwt;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ust.EmployeesecurityJwt.entity.User;
import com.ust.EmployeesecurityJwt.repo.UserRepository;

@SpringBootApplication
public class EmployeesecurityJwtApplication {
	@Autowired
    private UserRepository repository;
    @PostConstruct
    public void initUsers() {
        List<User> users = Stream.of(
                new User(101, "javatechie", "password", "javatechie@gmail.com","9182092380"),
                new User(102, "user1", "pwd1", "user1@gmail.com","12345678"),
                new User(103, "user2", "pwd2", "user2@gmail.com","12345678"),
                new User(104, "user3", "pwd3", "user3@gmail.com","12345678")
        ).collect(Collectors.toList());
        repository.saveAll(users);
    }
	public static void main(String[] args) {
		SpringApplication.run(EmployeesecurityJwtApplication.class, args);
	}

}
