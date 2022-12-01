package com.snipe.training.oops;

public class Calculator {
     float firstNum;
     float secondNum;
     float result;
     
     public Calculator(){
    	 
     }
     
     public Calculator(float firstNum, float secondNum){
    	 this.firstNum = firstNum;
    	 this.secondNum = secondNum;
     }
     
     public float add() {
    	 return this.firstNum + this.secondNum;
     }
     
     public float sub() {
    	 return this.firstNum - this.secondNum;
     }
     
     public float mul() {
    	 return this.firstNum * this.secondNum;
     }
     
     public float div() {
    	 return this.firstNum / this.secondNum;
     }
     
}
