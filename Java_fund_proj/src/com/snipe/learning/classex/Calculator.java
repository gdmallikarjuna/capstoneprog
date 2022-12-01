package com.snipe.learning.classex;

public class Calculator {
    int firstNumber;
    int secondNumber;
    
    public Calculator(int firstNumber, int secondNumber) {
    	this.firstNumber = firstNumber;
    	this.secondNumber = secondNumber;
    }
    
    public void add() {
    	System.out.println("The addition");
    	System.out.println(this.firstNumber+this.secondNumber);
    }
    
    public void sub() {
    	System.out.println("the subtraction");
    	System.out.println(this.firstNumber - this.secondNumber);
    }
    
    public void mul() {
    	System.out.println("the multiplication");
    	System.out.println(this.firstNumber * this.secondNumber);
    }
    public void div() {
    	System.out.println("the division");
    	System.out.println(this.firstNumber/this.secondNumber);
    }
}
