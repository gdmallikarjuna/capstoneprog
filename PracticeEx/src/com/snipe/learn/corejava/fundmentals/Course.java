package com.snipe.learn.corejava.fundmentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Course {
	
	public static void main(String args[]) throws IOException{
		
		//how to read the input
		//Scanner scan = new Scanner(System.in); 
		
		//reading the course info
		//System.out.println("Please enter the course name::");
		//String cname = scan.nextLine();
		//float cfee= scan.nextFloat();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String cname = br.readLine();
		float cfee= Integer.parseInt(br.readLine());
		
		System.out.println("the course name:;"+cname+"::"+"coursefee::"+cfee);
		
	}

}
