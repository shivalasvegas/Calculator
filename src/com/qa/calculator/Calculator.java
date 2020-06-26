package com.qa.calculator;

//original Calculator class with void main()
public class Calculator {

//	public static void main(String[] args) {
//		
//		System.out.println(addTwoNumbers(1, 3));
//		System.out.println(takeTwoNumbers(1, 3));
//		System.out.println(timesTwoNumbers(1, 3));
//		System.out.println(divideTwoNumbers(1, 3));
//		
//		calculator(1, 2, 3);
//
//	}
	
	static int addTwoNumbers(int a, int b) {
		return a+b;		
	}
	
	static int takeTwoNumbers(int a, int b) {
		return a-b;		
	}
	
	static int timesTwoNumbers(int a, int b) {
		return a*b;		
	}
	
	static double divideTwoNumbers(int a, int b) {
		
		return (double)a/(double)b;		
	}
	
	static void calculator(int a, int b, int c) {
		 int myCalc;
		
		switch(c) {
		case 1:
			myCalc  = a+b;
			System.out.println("Adding your numbers gives: " + myCalc);
			break;
		case 2:
			myCalc  = a-b;
			System.out.println("Subtracting your numbers gives: " + myCalc);
			break;
		case 3:
			myCalc  = a*b;
			System.out.println("Multiplying your numbers gives: " + myCalc);
			break;
		case 4:
			double myDCalc  = (double)a/(double)b;
			System.out.println("Adding your numbers gives: " + myDCalc);
			break;
		}
	}

}
