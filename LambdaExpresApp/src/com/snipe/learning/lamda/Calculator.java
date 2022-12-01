package com.snipe.learning.lamda;

@FunctionalInterface
public interface Calculator {
	int add(int a, int b);
   default public int sub(int a, int b) {
	   return a -b;
   }
   static int mul(int a,int b) {
	   return a*b;
   }
  // public void div(int a, int b);
}
