package com.snipe.training.test;

import java.util.Scanner;

import com.snipe.training.oops.Calculator;

public class TestOOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //invoke class
		 
		Scanner scanner = new Scanner(System.in);
	    float firstNum = scanner.nextFloat();
	    float secondNum = scanner.nextFloat();
		
	    Calculator calculator = new Calculator(firstNum,secondNum);
		System.out.println("Addition:"+calculator.add());
		System.out.println("Subtraction:"+calculator.sub());
		System.out.println("Multiplication:"+calculator.mul());
		System.out.println("Division:"+calculator.div());
		 
	}

}
