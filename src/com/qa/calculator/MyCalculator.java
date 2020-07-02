package com.qa.calculator;

import java.util.Scanner;

public class MyCalculator {
	
	Scanner input = new Scanner(System.in);

	private int number1 = 0;
	private int number2 = 0;
	int option=0;
    int count=0;
    int myCalc = 0;
	
	
	public MyCalculator() {
		
	}
	
	public MyCalculator(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public int inputNumber1() {
			count=0;
             System.out.println("Enter a Number: ");

             do {
                     if(count !=0) {
                             System.out.println("Enter a number between 1 & 12");
                     }
                     count=1;
                     while(!input.hasNextInt()){
                             System.out.println("Enter a valid number between 1-12");
                             input.next();
                     }
                     option = input.nextInt();
             }while(option <= 0);
             
             this.number1 = option;
             
             
             return this.number1;
	}

	public int inputNumber2() {
		count=0;
		
        System.out.println("Enter a Number: ");
        input.nextLine();
        do {
                if(count !=0) {
                        System.out.println("Enter a number between 1 & 12");
                }
                count=1;
                while(!input.hasNextInt()){
                        System.out.println("Enter a valid number between 1-12");
                        input.next();
                }
                option = input.nextInt();
        }while(option <=0);
        
        this.number1 = option;
        
        
        return this.number2;
}
	
	public void chooseOption(int numberA, int numberB) {
        
		this.number1 = numberA;
		this.number2 = numberB;
		count = 0;
		input.nextLine();
		 System.out.println("Select 1 to add");
         System.out.println("Select 2 to subtract");
         System.out.println("Select 3 to mulitply");
         System.out.println("Select 4 to divide");
         System.out.println("Please enter a Number: ");

        do {
                if(count !=0) {
                        System.out.println("Enter a number between 1 & 4");
                }
                count=1;
                while(!input.hasNextInt()){
                        System.out.println("Enter a valid number between 1-4");
                        input.next();
                }
                option = input.nextInt();
        }while(option <= 0 || option >=4);
        
        
        switch(option) {
        	case 1:
        		myCalc = this.number1 + this.number2;	
        		System.out.println("Adding your numbers gives: " + myCalc);
        		break;
        	case 2:
        		myCalc  = this.number1 - this.number2;	
        		System.out.println("Subtracting your numbers gives: " + myCalc);
        		break;
        	case 3:
        		myCalc  = this.number1*this.number2;
        		System.out.println("Multiplying your numbers gives: " + myCalc);
        		break;
        	case 4:
        		double myDCalc  = (double)this.number1/(double)this.number2;
        		System.out.println("Adding your numbers gives: " + myDCalc);
        		break;
		}
        
     
}

	
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

	public int timesTwoNumbers() {
		return this.number1*this.number2;
	}
	public double divideTwoNumbers() {
		
		return (double)this.number1/(double)this.number2;		
	}
	

}
