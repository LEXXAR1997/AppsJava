package com.components.client2.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserTypeEntity {
	
	int ID;
	String name;
	
	public UserTypeEntity(String name) {
		super();
		this.name = name;
	}
	
	
}
