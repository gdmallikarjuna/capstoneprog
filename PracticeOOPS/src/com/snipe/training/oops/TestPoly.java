package com.snipe.training.oops;

import com.snipe.training.inheritance.Addition;
import com.snipe.training.inheritance.Division;
import com.snipe.training.inheritance.Multiplication;
import com.snipe.training.inheritance.Subtraction;
import com.snipe.training.inheritance.SuperAdd;
import com.snipe.training.inheritance.Calculator;

public class TestPoly {
  public static void main(String args[]) {
	  
	  Calculator calculator = new Addition(20,30);
      System.out.println(calculator.compute());
      
      calculator = new Subtraction(20,30);
      System.out.println(calculator.compute());
      
      calculator = new Multiplication(20,30);
      System.out.println(calculator.compute());
      
      calculator = new Division(30,60);
      System.out.println(calculator.compute());
      
      calculator = new SuperAdd(10,20,30);
      System.out.println(calculator.compute());
      
      
  }
}
