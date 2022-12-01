package com.snipe.learning.controller;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {

	public static void main(String args[]) {
		int count = Runtime.getRuntime().availableProcessors();
		System.out.println("total available processor:"+count);
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		for(int i=0;i<10;i++) {
			service.execute(new Task());
		}
		System.out.println("current thread::"+Thread.currentThread().getName());
	}
	 
	static class Task implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Thread name::"+Thread.currentThread().getName());
		}
		
	}
	
}
