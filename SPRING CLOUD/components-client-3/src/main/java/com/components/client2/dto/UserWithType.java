package com.components.client2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserWithType {
	int ID;
	String name;
	String email;
	String password;
	UserTypeEntity userType;
}
