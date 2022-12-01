package com.snipe.learning.method;

import java.io.IOException;

public class Calculator {
	
	int Add(int a, int b) {
		return a+b;
	}
	
	float Add(int a, int b, int c) {
		return a+b+c;
	}
	
    int Add(int a, int b,int c,int d) {
    	return a+b+c+d;
    }
    
    public static void main(String args[]) throws IOException{
    	Calculator add = new Calculator();
    	System.out.println(add.Add(10, 20));
    	System.out.println(add.Add(10,20,30));
    	System.out.println(add.Add(10,20,30,40));
    }
}
