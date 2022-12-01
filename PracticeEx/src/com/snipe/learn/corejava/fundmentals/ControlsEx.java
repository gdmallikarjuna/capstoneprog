package com.snipe.learn.corejava.fundmentals;

import java.util.Scanner;

public class ControlsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.println("Enter the limit of natural numbers");
		Scanner scan = new Scanner(System.in);
		int limit= scan.nextInt();
		//initalization
		/*
		 * int count=0; while(count<limit) { //condition //process statement
		 * System.out.println("counter::"+count); //increment or decrement count =
		 * count+1; }
		 */
		
		/*int count=0;
		do {
			//process statement
			 System.out.println("counter::"+count);
			//increment or decrement
			 count = count+1;
			
		}while(count<limit);*/
		
		
		//for loop
		
		for(int count=0;count<limit;count = count+1) {
			
			System.out.println("counter::"+count);
		}
		
		
		
	}

}
