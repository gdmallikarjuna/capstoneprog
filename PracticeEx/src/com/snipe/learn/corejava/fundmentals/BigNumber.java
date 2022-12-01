package com.snipe.learn.corejava.fundmentals;

import java.io.IOException;
import java.util.Scanner;

public class BigNumber {
	
	public static void main(String args[]) throws IOException{
		System.out.println("Input the three numbers");
		Scanner scan = new Scanner(System.in);
		int firstNum = scan.nextInt();
		int secondNum = scan.nextInt();
		int thirdNum = scan.nextInt();
		
		float big = 0.0f;
		if(firstNum > secondNum && firstNum >thirdNum) {
			//success do this
			big = firstNum; 
		}else if(secondNum> firstNum && secondNum >thirdNum) {
			//do this
			big = secondNum;
		}else {
			big = thirdNum;
		}
		
		System.out.println("the largest of three numbers ::"+big);
			
		
	}

}
