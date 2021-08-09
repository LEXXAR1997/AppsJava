package com.components.client2.entity;

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
@Table(name="user_type")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserTypeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int ID;
	@Column(name = "name")
	String name;
	
	public UserTypeEntity(String name) {
		super();
		this.name = name;
	}
	
	
}
