package com.prg.services.inventory.common.exception;

public class ErrorObject {
	private String message;
	private int statusCode;

	public ErrorObject(String message, int statusCode) {
		super();
		this.message = message;
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

}
