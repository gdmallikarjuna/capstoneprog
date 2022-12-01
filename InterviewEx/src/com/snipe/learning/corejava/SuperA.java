package com.snipe.learning.corejava;

import java.io.IOException;

public class SuperA {
  public void add(int a, int b) {
	  System.out.println("Add are ::a="+a+"b="+b +"::"+(a+b));
  }
  
  public void sub(int a, int b)  throws IndexOutOfBoundsException{
	  System.out.println("Add are ::a="+a+"b="+b +"::"+(a-b));
  }
  
  public void mul(int a, int b)  throws IOException{
	  System.out.println("Mul are ::a="+a+"b="+b +"::"+(a*b));
  }
}
