package com.snipe.learning.lamda;

public class TestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calculator cal = new CalculatorImpl();
		//System.out.println(cal.add(10, 20));
		
		Calculator cal = (a,b)->a+b;
		System.out.println("it is functional interface"+cal.add(10, 20));
		
		cal = (a,b)->a-b;
		System.out.println(cal.sub(20, 10));
		System.out.println(Calculator.mul(20, 10));
				
		
	}

}
