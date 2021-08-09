package com.components.client2.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.components.client2.dto.UserTypeEntity;


@FeignClient(name = "COMPONENT-CLIENT-2", fallback = ComponentClient2HystrixFallbackFactory.class)
public interface ComponentsClient2 {

	@PostMapping("components_two/register_user_type")
	public UserTypeEntity registerUserType(@RequestBody  UserTypeEntity userTypeEntity);
	
	@GetMapping("components_two/get_user_type")
	public UserTypeEntity getUser(@RequestParam (name= "id") int id);
}
