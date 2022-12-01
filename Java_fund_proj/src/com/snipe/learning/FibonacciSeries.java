package com.snipe.learning;

import java.util.Scanner;

/*
 * File	           : FibonacciSeries.java 
 * Version         : 1.0
 * Author          : Snipe Tech Pvt Ltd	 
 * Created Date    : 24 July 2021
 * Purpose         : To generate the fibonacci series 1 1 2 3 .. so on
 * This software is the confidential and proprietary information of
 * Snipe Tech Pvt Ltd, Bangalore. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Snipe Tech Pvt Ltd.
 **/
public class FibonacciSeries {
  public static void main(String args[]) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter the limit::");
	 int limit = scanner.nextInt();
	 
	 System.out.println("The generated fibonacci series");
	 int firstNum = 0, secondNum=1, thirdNum =1;
	 
	 while(thirdNum <= limit) {
		 System.out.println(thirdNum);
	     thirdNum = firstNum + secondNum;
	     firstNum = secondNum;
		 secondNum = thirdNum;
		 
	 }
	 
	 scanner.close();
	 
  }
}
