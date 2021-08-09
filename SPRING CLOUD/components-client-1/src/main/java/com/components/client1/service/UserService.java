package com.components.client1.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.components.client1.entity.User;
import com.components.client1.repository.UserRepository;

@Service
public class UserService implements IUser{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User registerUser(String name, String email, String password, int UserTypeId) {
		// TODO Auto-generated method stub
		userRepository.save(new User(name, email, password, UserTypeId));
		
		
		List<User> users = (List<User>) userRepository.findAll();
		
		List<User> user = users.stream().filter(x -> x.getEmail().equals(email) && x.getPassword().equals(password)).collect(Collectors.toList());
		
		return user.get(0);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User getUser(String email, String password) {
		// TODO Auto-generated method stub
		List<User> users = (List<User>) userRepository.findAll();
		
		List<User> user = users.stream().filter(x -> x.getEmail().equals(email) && x.getPassword().equals(password)).collect(Collectors.toList());
		
		return user.get(0);
	}

}
