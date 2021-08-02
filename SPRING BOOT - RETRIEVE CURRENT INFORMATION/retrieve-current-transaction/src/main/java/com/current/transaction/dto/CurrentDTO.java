package com.current.transaction.dto;

public class CurrentDTO {
	
	  private int customerId;
	  private String transactionDateStart;
	  private String transactionDateEnd;
	  
	  
	public CurrentDTO() {}
	
	public CurrentDTO(int customerId, String transactionDateStart, String transactionDateEnd) {
		this.customerId = customerId;
		this.transactionDateStart = transactionDateStart;
		this.transactionDateEnd = transactionDateEnd;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getTransactionDateStart() {
		return transactionDateStart;
	}
	public void setTransactionDateStart(String transactionDateStart) {
		this.transactionDateStart = transactionDateStart;
	}
	public String getTransactionDateEnd() {
		return transactionDateEnd;
	}
	public void setTransactionDateEnd(String transactionDateEnd) {
		this.transactionDateEnd = transactionDateEnd;
	}
	  
	  
}
