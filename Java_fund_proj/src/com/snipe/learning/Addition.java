package com.snipe.learning;

import java.util.Scanner;
/*
 * File	           : Addition.java 
 * Version         : 1.0
 * Author          : Snipe Tech Pvt Ltd	 
 * Created Date    : 24 July 2021
 * Purpose         : To read the  integer inputs and perform addition
 * This software is the confidential and proprietary information of
 * Snipe Tech Pvt Ltd, Bangalore. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Snipe Tech Pvt Ltd.
 **/
public class Addition {

	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);
		System.out.println("Enter the first number::");
		int firstNum = scanner.nextInt();
		
		System.out.println("Enter the second number::");
		int secondNum = scanner.nextInt();
		
		int total = firstNum + secondNum;
		
		System.out.println("The total ::"+total);
		scanner.close();
	}

}
