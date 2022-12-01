package com.snipe.learn.corejava.fundmentals;

import java.io.IOException;
import java.util.Scanner;

public class Prime {
	
	public static void main(String args[]) throws IOException{
		System.out.println("please enter the limit of prime to generate");
		Scanner scan = new Scanner(System.in);
		int limit= scan.nextInt();
		
		//2, 3,5, 8
		// 8 -->  2 3 4 5 6 
		// 1, 2,3,4, 5,7,8 ->
		
		
		
		for ( int i=2; i<=limit;i++) {
			boolean isPrime = true;
			 for(int j = 2; j < i/2; j++) {
				 if(i%j==0) {
					 isPrime = false;
					 break;
				 }
			 }
			 if(isPrime)
			 System.out.println(i);
		}
		
		
	}

}
