package com.snipe.learning.interfac;

public class TestCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate cal = new CalculateServiceImpl();
		System.out.println(cal.add(10, 20));
		System.out.println(cal.sub(10, 20));
		System.out.println(cal.mul(10, 20));
		System.out.println(cal.div(10, 20));
		
	}

}
