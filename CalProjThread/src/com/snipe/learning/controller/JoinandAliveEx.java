package com.snipe.learning.controller;

class X extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Hai");		}
	}
}

class Y extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Hello");		}
	}
	
	
}



public class JoinandAliveEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x= new X();
		x.start();
		
		Y y = new Y();
		y.start();
		
		try {
			x.join();
			y.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Bye");
	}

}
