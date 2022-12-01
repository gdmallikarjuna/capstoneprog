package com.snipe.learning.calculator.exception;
/**
 * The calculator exception messages
 * 
 * @author Mallikarjuna G D
 *
 */
public class CalculatorException extends Exception{

	private String errorCode;
	
	public String getErrorCode() {
		return errorCode;
	}

	public CalculatorException(String errorCode) {
		super();
		this.errorCode = errorCode;
	}
	
	public CalculatorException(String message, Throwable cause, String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}
	
	public CalculatorException(String message,  String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}
	
	public CalculatorException(Throwable cause,  String errorCode) {
		super(cause);
		this.errorCode = errorCode;
	}
	
}
