package com.qa.calculator;

public class Runner {

	public static void main(String[] args) {
	
		MyCalculator  myCalc = new MyCalculator();
		int myNum1 = 1;
		int myNum2 = 3;
		
		Divide myDiv = new Divide(3, 0);
		myDiv.divider();
		
		
//		myCalc.setNumbers(myNum1, myNum2);
//		
//		//System.out.println("You wanna add huh? No problem ... " + myCalc.getNumber1() + " + " + myCalc.getNumber2() + " = "  + myCalc.addTwoNumbers());
//		//System.out.println("You wanna subtract now?! No problem ... " + myCalc.getNumber1() + " - " + myCalc.getNumber2() + " = " + myCalc.takeTwoNumbers());
//		
//		myNum1 = myCalc.inputNumber1();
//		myNum2 = myCalc.inputNumber2();
//		
//		myCalc.chooseOption(myNum1, myNum2);
//		
		

	}

}
