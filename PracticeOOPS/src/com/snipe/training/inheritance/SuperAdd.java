package com.snipe.training.inheritance;

public class SuperAdd extends Addition{
 float thirdNumber;
 
	 public SuperAdd(int firstNumber, int secondNumber, int thirdNum) {
		super(firstNumber, secondNumber);
		this.thirdNumber = thirdNum;
	 }
	 
	 
	 public float compute() {
		 return this.firstNum + this.secondNum+this.thirdNumber;
	 }
}
