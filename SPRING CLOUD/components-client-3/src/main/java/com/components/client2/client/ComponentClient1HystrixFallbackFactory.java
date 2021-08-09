package com.components.client2.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.components.client2.dto.User;

@Component
public class ComponentClient1HystrixFallbackFactory implements ComponentsClient1 {

	@Override
	public User registerUser(User user) {
		// TODO Auto-generated method stub
		User user_hystrix = User.builder()
				.name("none")
				.email("none")
				.password("none").build();
		return user_hystrix;
	}

	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		User user_hystrix = User.builder()
				.name("none")
				.email("none")
				.password("none").build();
		return user_hystrix;
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		User user_hystrix = User.builder()
				.name("none")
				.email("none")
				.password("none").build();
		
		List<User> list = new ArrayList<>();
		list.add(user_hystrix);
		return list;
	}

}
