package com.components.client1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.components.client1.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
}
