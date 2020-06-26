package com.qa.calculator;

public class MyCalculator {

	private int number1 = 0;
	private int number2 = 0;
	
	//getter
	public int getNumber1() {
		return this.number1;
	}
	
	public int getNumber2() {
		return this.number2;
	}
	
	//setter
	public void setNumbers(int num1, int num2) {
		this.number1 = num1;
		this.number2 = num2;
	}
	
	//add two numbers
	public int addTwoNumbers() {
		return this.number1 + this.number2;		
	}
	
	public int takeTwoNumbers() {
		return this.number1 - this.number2;		
	}
//	
//	static int timesTwoNumbers(int a, int b) {
//		return a*b;		
//	}
//	
//	static double divideTwoNumbers(int a, int b) {
//		
//		return (double)a/(double)b;		
//	}
//	
//	static void calculator(int a, int b, int c) {
//		 int myCalc;
//		
//		switch(c) {
//		case 1:
//			myCalc  = a+b;
//			System.out.println("Adding your numbers gives: " + myCalc);
//			break;
//		case 2:
//			myCalc  = a-b;
//			System.out.println("Subtracting your numbers gives: " + myCalc);
//			break;
//		case 3:
//			myCalc  = a*b;
//			System.out.println("Multiplying your numbers gives: " + myCalc);
//			break;
//		case 4:
//			double myDCalc  = (double)a/(double)b;
//			System.out.println("Adding your numbers gives: " + myDCalc);
//			break;
//		}
//	}

}
