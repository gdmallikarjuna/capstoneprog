package com.snipe.learning.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadCallFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		int count = Runtime.getRuntime().availableProcessors();
		System.out.println("total available processor:" + count);

		ExecutorService service = Executors.newFixedThreadPool(count);

		Future<Integer> future = service.submit(new Task());
		System.out.println(future.get());

		//10 threads
		List<Future> futureArr = new ArrayList<Future>();
		for(int i=0;i<10;i++) {
			Future<Integer> future1 = service.submit(new Task());
			futureArr.add(future1);
		}
		
		for(int i=0;i<10;i++) {
			Future<Integer> future1 = futureArr.get(i);
			System.out.println("result::"+future1.get());
		}
		
		System.out.println("current thread::" + Thread.currentThread().getName());

	}

}

class Task implements Callable<Integer> {

	public Integer call() {
		return new Random().nextInt();
	}
}