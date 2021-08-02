package com.retrieve.transaction.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction{
	private String id;
	private int customerId;
	private String date;
	private TransactionDescription transactionDescription;
	
}
