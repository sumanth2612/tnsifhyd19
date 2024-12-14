package com.spring.project2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.spring.project2.entity.User;
import com.spring.project2.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		//TODO: process POST request
		
		return userService.saveUser(user);
	}
	
	@GetMapping("/users")
	public List<User> fetchUserList() {
		return userService.fetchUserList();
	}
	
	@GetMapping("/users/{id}")
	public User fetchUserById(@PathVariable("id") Long id) {
		return userService.fetchUserById(id);
	}
	
	@DeleteMapping("/users/{id}")
	public String deleteUserById(@PathVariable("id") Long id){
		userService.deleteUserById(id);
		return "User deleted Successfully!!";
		
	}
	
	@PutMapping("/users/{id}")
	public User updateUserById(@PathVariable("id") Long id, @RequestBody User user) {
		//TODO: process PUT request
		
		return userService.updateUserById(id, user);
	}
	
	

}
