package com.components.client2.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.components.client2.dto.User;


@FeignClient(name = "COMPONENT-CLIENT-1", fallback = ComponentClient1HystrixFallbackFactory.class)
public interface ComponentsClient1 {
	
	@PostMapping("components_one/register_user")
	public User registerUser(@RequestBody  User user);
	
	@PostMapping("components_one/get_user")
	public User getUser(@RequestBody  User user);
	
	@GetMapping("components_one/get_users")
	public List<User> getUsers();
}
