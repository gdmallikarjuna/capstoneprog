package com.snipe.learning.corejava;

public class OrderExExecution {

	 static{
	      System.out.println("This is a static block");
	   }
	 OrderExExecution(){
	      System.out.println("This a constructor");
	   }
	   public static void demo() {
	      System.out.println("This is an instance method");
	   }
	   public static void main(String args[]){
	      new OrderExExecution().demo();
	   }

}

