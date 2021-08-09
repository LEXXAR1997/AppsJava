package com.components.client2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.components.client2.entity.UserTypeEntity;
import com.components.client2.service.UserTypeService;

@RestController
@RequestMapping("components_two/")
public class UserTypeController {
	
	@Autowired
	UserTypeService userTypeService;
	
	@PostMapping("/register_user_type")
	public UserTypeEntity registerUserType(@RequestBody  UserTypeEntity userTypeEntity) {
		return userTypeService.registerUserType(userTypeEntity.getName());
	}
	
	@GetMapping("/get_user_type")
	public UserTypeEntity getUser(@RequestParam (name= "id") int id) {
	    return userTypeService.getUserEntity(id);
	}
	
}
