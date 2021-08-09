package com.components.client2.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.components.client2.entity.UserTypeEntity;
import com.components.client2.repository.UserTypeRepository;

@Service
public class UserTypeService implements IUserType{

	@Autowired
	UserTypeRepository userTypeRepository;
	
	@Override
	public UserTypeEntity registerUserType(String name) {
		// TODO Auto-generated method stub
		userTypeRepository.save(new UserTypeEntity(name));
		
		List<UserTypeEntity> list = (List<UserTypeEntity>) userTypeRepository.findAll();
		
		List<UserTypeEntity> userList = list.stream().filter(x -> x.getName().equals(name)).collect(Collectors.toList());
		
		return userList.get(0);
	}

	@Override
	public UserTypeEntity getUserEntity(int id) {
		// TODO Auto-generated method stub
		List<UserTypeEntity> list = (List<UserTypeEntity>) userTypeRepository.findAll();
		
		List<UserTypeEntity> userList = list.stream().filter(x -> x.getID() == id ).collect(Collectors.toList());
		
		return userList.get(0);
	}

}
