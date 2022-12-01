package com.snipe.learning.lamda;
@FunctionalInterface
interface InterA{
	public void method();
}

/*
 * class Demo implements InterA{
 * 
 * @Override public void method() {
 * 
 * System.out.println("welcome to lambda expression"); }
 * 
 * }
 */

@FunctionalInterface
interface Square{
	public int squar(int a);
}

class X implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
      	
}

public class TestLambdaEx {

	public static void main(String[] args) {
	  // InterA demo = new Demo();
      // demo.method();
        
       InterA demo1 = ()-> System.out.println("welcome to lambda expression");       
       demo1.method();
       
       Square sq= (int a)->{
    	    System.out.println("welcome");  
    	    Student1 std = new Student1("mallik","a001");
    	    return a;
       };
       System.out.println(sq.squar(10));
	  
       Runnable thread1 = ()->{
    	   for(int i= 1;i<10;i++) {
    		   System.out.println("welcome to thead");
    	   }
       };
       
       thread1.run();
       
       Thread myThread = new Thread(thread1);
       myThread.start();
       
       }
	}


