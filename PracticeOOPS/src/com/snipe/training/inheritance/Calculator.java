package com.snipe.training.inheritance;

public abstract class Calculator {
   float firstNum;
   float secondNum;
   
   public Calculator(float firstNum, float secondNum) {
	   this.firstNum = firstNum;
	   this.secondNum = secondNum;
   }
   
   public Calculator(int firstNum, int secondNum) {
	   this.firstNum = firstNum;
	   this.secondNum = secondNum;
   }
   public abstract float compute();
   
}
