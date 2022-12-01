package com.snipe.training.inheritance;

public class Division extends Calculator{

	public Division(int firstNumber, int secondNumber) {
		super(firstNumber, secondNumber);
	}

	public float compute() {
		
		return this.firstNum / this.secondNum ;
	}
}
