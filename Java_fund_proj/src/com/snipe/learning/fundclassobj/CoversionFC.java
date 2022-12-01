package com.snipe.learning.fundclassobj;

import java.util.Scanner;
/*
 * File	           : CoversionFC.java 
 * Version         : 1.0
 * Author          : Mallikarjuna G D	 
 * Created Date    : 24 July 2021
 * Purpose         : To conversion fahrenheit to celsious and viceversa
 * This software is the confidential and proprietary information of
 * Snipe Tech Pvt Ltd, Bangalore. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Snipe Tech Pvt Ltd.
 **/

class Temperature{
	float degree;
	float fahrenheit;
	
	Temperature(float degree, float fahrenheit){
		this.degree = degree;
		this.fahrenheit = fahrenheit;
	}
	/**
	 * Formula	(0°C × 9/5) + 32 = 32°F
	 */
	public float toCelsious(){
		return (this.degree*9/5.0f)+32;
	}
	/**
	 * Formula	((F − 32) × 5)/9.0
	 */
	public float toFahrenheit(){
		return ((this.fahrenheit-32.0f)*5)/9.0f;
	}
	
	
}


public class CoversionFC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter to conversion celsius to fahrenheit)");
       float degree= scanner.nextFloat();
       System.out.println("Enter to conversion fahrenheit to celsius)");
       float fahernheit = scanner.nextFloat();
		
       Temperature tempearature = new Temperature(degree, fahernheit);
       System.out.println(tempearature.toCelsious());
       System.out.println(tempearature.toFahrenheit());
       scanner.close();
       
	}

}
