package com.snipe.learning;

import java.util.Scanner;
/*
 * File	           : celsiusToFahrenheit.java 
 * Version         : 1.0
 * Author          : Snipe Tech Pvt Ltd		 
 * Created Date    : 24 July 2021
 * Purpose         : To convert given Celsius to Fahrenheit
 * This software is the confidential and proprietary information of
 * Snipe Tech Pvt Ltd, Bangalore. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Snipe Tech Pvt Ltd.
 **/

public class celsiusToFahernheit {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the temperature in celsius");
		float degree = scanner.nextFloat();
		
		System.out.println("The Faherenheit value is:");
		
		float fhnt = (degree*9/5)+32;
		System.out.println(degree+" Celsius ="+fhnt+" Fahrenheit");
		
	}

}
