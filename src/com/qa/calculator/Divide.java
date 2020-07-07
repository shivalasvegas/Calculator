package com.qa.calculator;
import java.util.logging.Level;
import java.util.logging.Logger;

class Divide {
	
	public static final Logger LOGGER = Logger.getLogger(Divide.class.getName());
	
	private int num1;
	private int num2;
	
	public Divide() {
		
	}
	
	public Divide(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;		
	}
	
	public void divider() throws DivideByZeroException {
		LOGGER.setLevel(Level.WARNING);
		LOGGER.log(Level.INFO, "INFO test");
		LOGGER.warning("Warning test");
		
		
		if (num2 == 0) {
			throw new DivideByZeroException("Did you want to divide by zero!?");
		}
		
		System.out.println("I have divided your numbers: " + (double)num1/(double)num2);		
	}

}
