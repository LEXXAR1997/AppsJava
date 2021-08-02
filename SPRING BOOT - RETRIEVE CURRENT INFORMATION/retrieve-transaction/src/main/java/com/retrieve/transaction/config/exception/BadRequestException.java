package com.retrieve.transaction.config.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BadRequestException extends RuntimeException {

	private int code;
	private String type;
	
	public BadRequestException() {}
	public BadRequestException(int code, String type) {
		this.code = code;
		this.type = type;
	}

	public BadRequestException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
}
