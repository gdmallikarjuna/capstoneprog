package com.snipe.training.inheritance;

public class Multiplication extends Calculator {

	public Multiplication(int firstNumber, int secondNumber) {
		super(firstNumber, secondNumber);
	}

	public float compute() {
		return this.firstNum * this.secondNum;
	}
}
