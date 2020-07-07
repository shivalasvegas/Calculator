package com.qa.calculator;

public class Divide {
	
	private int num1;
	private int num2;
	
	public Divide() {
		
	}
	
	public Divide(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;		
	}
	
	public void divider() {
		
		System.out.println("I have divided your numbers: " + (double)num1/(double)num2);		
	}

}
