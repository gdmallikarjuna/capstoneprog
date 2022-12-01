package com.snipe.learning.corejava;


public class SubB extends SuperA{
	
	// can throw only unchecked exception 
	 public void add(int a, int b) throws ArithmeticException,ArrayIndexOutOfBoundsException {
		  System.out.println("Add are ::a="+a+"b="+b);
	 }
	 
	 public void sub(int a, int b)  throws RuntimeException{
		  System.out.println("Sub are ::a="+a+"b="+b +"::"+(a-b));
	 }
	 
	 public void mul(int a, int b)  {
		  System.out.println("Mul are ::a="+a+"b="+b +"::"+(a*b));
	  }
}
