package com.qa.calculator;

public class DivideByZeroException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	String errorMessage;
	
	public DivideByZeroException() {
		super();
	}

	public DivideByZeroException(String errorMessage){
		super(errorMessage);
		this.errorMessage = errorMessage;
		
	}
	
	public void divideByZeroException(String errorMessage) {
		this.errorMessage = errorMessage;
		
		System.out.println(errorMessage);
	}
}
