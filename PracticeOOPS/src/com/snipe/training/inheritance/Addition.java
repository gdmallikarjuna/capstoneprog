package com.snipe.training.inheritance;

public class Addition extends Calculator {

	public Addition(int firstNumber, int secondNumber) {
		super(firstNumber, secondNumber);
	}

	public float compute() {
		return this.firstNum + this.secondNum;
	}

}
