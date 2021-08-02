package com.retrieve.transaction.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDescription {
	private String TransactionType;
	private String Descripcion;
	private String amount;
	
}
