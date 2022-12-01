package com.snipe.learning.calculator.controller;

class Q{
	int num;
	boolean valueSet = false;
	
	public synchronized int get() {
		System.out.println("num::"+num);
		while(!valueSet) {
			try {
				wait();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		valueSet = false;
        notify();
		return num;
	}
	
	public synchronized void put(int num) {
		while(valueSet) {
			try {
				wait();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		valueSet = true;
		this.num = num;
		notify();
	}
}

class Producer implements Runnable{
	Q q;

	public Producer(Q q) {
		super();
		this.q = q;
		Thread t = new Thread(this,"Producer");
		t.start();
	}
	
	@Override
	public void run() {
	    int i=0;
		while(true) {
			q.put(i++);
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
	    
	}
	
	
}


class Consumer implements Runnable{
Q q;

  public Consumer(Q q) {
	  super();
	  this.q= q;
	  Thread t = new Thread(this, "Consumer");
	  t.start();
  }
  @Override
public void run() {
	// TODO Auto-generated method stub
	while(true) {
	  q.get();	
		try {
			Thread.sleep(800);
		}catch(Exception e) {
			
		}

	}
}	
	

}
public class InterThreadComm {

	 public static void main(String args[]) {
		 Q q = new Q();
		 new Producer(q);
		 new Consumer(q);
	 }
}
