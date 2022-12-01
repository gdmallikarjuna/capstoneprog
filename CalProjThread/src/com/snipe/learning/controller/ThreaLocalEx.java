package com.snipe.learning.controller;

class User extends Thread{
   
	public User(String name) {
		super(name);
		this.start();
	}
	
	public static ThreadLocal<Integer> uid = new ThreadLocal<Integer>() {
		
		protected Integer initialValue() {
			return 1;
		}
	
	
		public Integer get(){
			return super.get();
		}
		
	
	};
	
	public void set(Integer val) {
		uid.set(val);
	}

	@Override
	public void run() {
		for(int i=0;i<2;i++) {
			System.out.println("User name:"+this.getName() +" Id:"+ uid.get());
			uid.set(uid.get()+1);
		}
	}
	
	

}

public class ThreaLocalEx {

	public static void main(String args[]) {
       new User("Mallikarjuna");
       new User("Ramesh");
	   new User("Mohan");
	}

}
