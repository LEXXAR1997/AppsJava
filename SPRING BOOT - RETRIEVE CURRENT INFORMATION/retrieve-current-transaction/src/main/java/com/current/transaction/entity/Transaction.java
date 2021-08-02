package com.current.transaction.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Transactions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction{

	@Id
	private String id;
	private int customerId;
	private String date;
	private TransactionDescription transactionDescription;
	
}
