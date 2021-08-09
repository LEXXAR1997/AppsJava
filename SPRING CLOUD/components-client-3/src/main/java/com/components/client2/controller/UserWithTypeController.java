package com.components.client2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.components.client2.client.ComponentsClient1;
import com.components.client2.client.ComponentsClient2;
import com.components.client2.dto.User;
import com.components.client2.dto.UserTypeEntity;
import com.components.client2.dto.UserWithType;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("components_three/")
public class UserWithTypeController {
	
	
	@Autowired
	ComponentsClient1 componentsClient1;
	
	@Autowired
	ComponentsClient2 componentsClient2;
	
	@PostMapping("/register_user_feign")
	public User registerUser(@RequestBody  User user) {
		return componentsClient1.registerUser(user);
	}
	
	@PostMapping("/register_user_type_feign")
	public UserTypeEntity registerUserType(@RequestBody  UserTypeEntity userTypeEntity) {
		return componentsClient2.registerUserType(userTypeEntity);
	}
	
	@PostMapping("/get_user_with_type")
	public UserWithType getUserWithType(@RequestBody  User user) {
		
		User userFeign =  componentsClient1.getUser(user);
		UserTypeEntity userTypeFeign = componentsClient2.getUser(user.getUserTypeId());
		
		log.info(userFeign.toString());
		log.info(userTypeFeign.toString());
		
		return new UserWithType(userFeign.getID(), userFeign.getName(), userFeign.getEmail(), userFeign.getPassword(), userTypeFeign);
	}
}
