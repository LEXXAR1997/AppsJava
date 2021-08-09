package com.components.client2.client;

import org.springframework.stereotype.Component;

import com.components.client2.dto.UserTypeEntity;

@Component
public class ComponentClient2HystrixFallbackFactory implements ComponentsClient2 {

	@Override
	public UserTypeEntity registerUserType(UserTypeEntity userTypeEntity) {
		// TODO Auto-generated method stub
		UserTypeEntity userTypeEntityHystrix = UserTypeEntity.builder()
				.name("none").build();
		return userTypeEntityHystrix;
	}

	@Override
	public UserTypeEntity getUser(int id) {
		// TODO Auto-generated method stub
		UserTypeEntity userTypeEntityHystrix = UserTypeEntity.builder()
				.name("none").build();
		return userTypeEntityHystrix;
	}

}
