package com.snipe.learning.controller;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {

	public static void main(String args[]) {
		int count = Runtime.getRuntime().availableProcessors();
		System.out.println("total available processor:"+count);
		
		ScheduledExecutorService service = Executors.newScheduledThreadPool(count); 
	
		//tasks to run after every 10 seconds delay
		service.schedule(new Task(), 10, TimeUnit.SECONDS);
		
		//tasks to run repeat every 10 seconds
		service.scheduleAtFixedRate(new Task(), 10, 10, TimeUnit.SECONDS);
		
		//task to run repeatedly 10 seconds after previous tasks completes
		service.scheduleWithFixedDelay(new Task(),15, 10, TimeUnit.SECONDS);
		
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
