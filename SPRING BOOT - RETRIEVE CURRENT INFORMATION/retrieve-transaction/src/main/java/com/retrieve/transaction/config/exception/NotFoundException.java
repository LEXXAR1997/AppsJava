package com.retrieve.transaction.config.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotFoundException extends RuntimeException {
	
	private int code;
	private String type;
	
	public NotFoundException() {}
	public NotFoundException(int code, String type) {
		this.code = code;
		this.type = type;
	}

	public NotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
