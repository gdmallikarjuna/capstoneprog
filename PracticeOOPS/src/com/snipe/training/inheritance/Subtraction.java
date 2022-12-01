package com.snipe.training.inheritance;

public class Subtraction extends Calculator{

	public Subtraction(int firstNumber, int secondNumber) {
		   super(firstNumber,secondNumber);
	   }
	   
	   public float compute() {
		   return this.firstNum - this.secondNum;
	   }
	   
}
