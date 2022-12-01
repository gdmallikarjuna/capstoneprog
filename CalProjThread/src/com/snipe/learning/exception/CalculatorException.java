package com.snipe.learning.exception;

public class CalculatorException extends Exception{
  
	private static final long serialVersionUID = 4664456874499611218L;

	private String errorCode;
	
	public CalculatorException(String code) {
		super();
		this.errorCode = code;
	}

	public CalculatorException(String message, Throwable cause, String code) {
		super(message, cause);
		this.errorCode = code;
	}

	public CalculatorException(String message, String code) {
		super(message);
		this.errorCode = code;
	}

	public CalculatorException(Throwable cause, String code) {
		super(cause);
		this.errorCode = code;
	}
	
	public String getErrorCode() {
		return errorCode;
	}

}
