package com.snipe.learning.method;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new SBI();
		System.out.println(b.getRateOfInterest());
		
		b = new PNB();
		System.out.println(b.getRateOfInterest());
		
	}

}
