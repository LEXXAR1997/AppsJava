package com.current.transaction.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.current.transaction.entity.Transaction;

@Repository
public interface TransactionRepositoryInterface extends MongoRepository<Transaction, String>{
	
}
