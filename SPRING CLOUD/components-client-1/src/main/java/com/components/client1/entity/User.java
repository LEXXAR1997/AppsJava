package com.components.client1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int ID;
	@Column(name = "name")
	String name;
	@Column(name = "email")
	String email;
	@Column(name = "password")
	String password;
	@Column(name = "user_type_id")
	int userTypeId;
	
	public User(String name, String email, String password, int userTypeId) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.userTypeId = userTypeId;
	}
	
	
}
