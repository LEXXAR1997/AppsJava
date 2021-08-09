package com.components.client2.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
	
	int ID;
	String name;
	String email;
	String password;
	int userTypeId;
	
	public User(String name, String email, String password, int userTypeId) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.userTypeId = userTypeId;
	}
	
	
}
