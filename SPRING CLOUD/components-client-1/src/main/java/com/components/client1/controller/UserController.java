package com.components.client1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.components.client1.entity.User;
import com.components.client1.service.UserService;


@RestController
@RequestMapping("components_one/")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/register_user")
	public User registerUser(@RequestBody  User user) {
		return userService.registerUser(user.getName(), user.getEmail(), user.getPassword(), user.getUserTypeId());
	}
	
	@PostMapping("/get_user")
	public User getUser(@RequestBody  User user) {
		return userService.getUser(user.getEmail(), user.getPassword());
	}
	
	@GetMapping("/get_users")
	public List<User> getUsers() {
		return userService.getUsers();
	}
}
