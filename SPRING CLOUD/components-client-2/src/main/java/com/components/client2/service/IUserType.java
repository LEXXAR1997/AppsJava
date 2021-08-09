package com.components.client2.service;

import com.components.client2.entity.UserTypeEntity;

public interface IUserType {
	UserTypeEntity registerUserType(String name);
	
	UserTypeEntity getUserEntity(int id);
}
