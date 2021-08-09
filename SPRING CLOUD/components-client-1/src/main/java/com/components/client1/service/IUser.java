package com.components.client1.service;

import java.util.List;

import com.components.client1.entity.User;

public interface IUser {
	
	User registerUser(String name, String email, String password, int UserTypeId);
	
	List<User> getUsers();
	
	User getUser(String email, String password);
}
