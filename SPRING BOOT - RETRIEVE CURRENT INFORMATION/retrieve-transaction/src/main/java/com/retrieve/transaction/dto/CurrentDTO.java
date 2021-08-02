package com.retrieve.transaction.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrentDTO {
	
	  private int customerId;
	  private String transactionDateStart;
	  private String transactionDateEnd;

}
