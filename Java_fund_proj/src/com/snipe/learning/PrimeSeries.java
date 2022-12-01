package com.snipe.learning;

import java.util.Scanner;
/*
 * File	           : PrimeSeries.java 
 * Version         : 1.0
 * Author          : Snipe Tech Pvt Ltd	 
 * Created Date    : 24 July 2021
 * Purpose         : To generate the prime series 1 1 2 3 .. so on
 * This software is the confidential and proprietary information of
 * Snipe Tech Pvt Ltd, Bangalore. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Snipe Tech Pvt Ltd.
 **/
public class PrimeSeries {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the limit:");
		int limit = scanner.nextInt();
		System.out.println("The Prime Series are:");
		boolean isPrime;
		for(int i=2;i<=limit;i++) {
			isPrime = true;
			for(int j=2;j<i/2;j++) {
				if(i%j==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				System.out.println(i);
		}
		scanner.close();
	}
}
