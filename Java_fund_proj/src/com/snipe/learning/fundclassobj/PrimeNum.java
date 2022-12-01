package com.snipe.learning.fundclassobj;

import java.util.Scanner;

/*
 * File	           : PrimeNum.java 
 * Version         : 1.0
 * Author          : Snipe Tech Pvt Ltd	 
 * Created Date    : 24 July 2021
 * Purpose         : To generate the prime series for the given limit
 * This software is the confidential and proprietary information of
 * Snipe Tech Pvt Ltd, Bangalore. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Snipe Tech Pvt Ltd.
 **/


public class PrimeNum {
  int limit;
  public PrimeNum(int limit) {
	  this.limit = limit;
  }
	
  public void generate() {
	  System.out.println("The Generated Prime series");
	  boolean isPrime= false;
	  for(int i=2;i<this.limit;i++) {
		  isPrime = true;
		  for(int j=2;j<i/2;j++) {
			  if(i%j==0) {
				  isPrime = false;
				  break;
			  }
			  
		  }
		  if(isPrime) {
			  System.out.println(i);
		  }
	  }
  }
  public static void main(String args[]) {
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("enter the limit of prime number");
	  PrimeNum primeNum = new PrimeNum(scanner.nextInt());
	  primeNum.generate();
	  scanner.close();
  }
  
}
