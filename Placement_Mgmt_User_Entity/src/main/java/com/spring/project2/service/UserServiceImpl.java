package com.spring.project2.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project2.entity.User;
import com.spring.project2.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<User> fetchUserList() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User fetchUserById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

	@Override
	public void deleteUserById(Long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

	@Override
	public User updateUserById(Long id, User user) {
		// TODO Auto-generated method stub
		User udb=userRepository.findById(id).get();
		
		if(Objects.nonNull(user.getUsername()) &&  !"".equalsIgnoreCase(user.getUsername())) {
	           udb.setUsername(user.getUsername());
		}
		
		 if(Objects.nonNull(user.getPassword()) &&
	               !"".equalsIgnoreCase(user.getPassword())) {
	           udb.setPassword(user.getPassword());
	       }
		
		return userRepository.save(udb);
	}

}
