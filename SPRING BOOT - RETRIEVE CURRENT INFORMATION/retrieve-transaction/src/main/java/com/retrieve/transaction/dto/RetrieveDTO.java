package com.retrieve.transaction.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RetrieveDTO {
	
	private int accountId;
	private int branchId;
	private String transactionDateStart;
	private String transactionDateEnd;
	
	
}