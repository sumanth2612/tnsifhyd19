package com.spring.project2.service;

import java.util.List;

import com.spring.project2.entity.User;

public interface UserService {

	User saveUser(User user);

	List<User> fetchUserList();

	User fetchUserById(Long id);

	void deleteUserById(Long id);
	
	User updateUserById(Long id, User user);

}
