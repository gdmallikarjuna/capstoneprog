package com.snipe.learning.calculator.controller;

import java.util.Scanner;

import com.snipe.learning.calculator.exception.CalculatorException;
import com.snipe.learning.calculator.service.Calculator;
import com.snipe.learning.calculator.service.CalculatorServiceImpl;
import com.snipe.learning.domain.Data;

class Cal{
	Calculator service = new CalculatorServiceImpl();
	
	public void compute(String oper, Data data) {
		
		switch(oper) {
		case "Add": 
		    try {
		    	System.out.println("Addition"+service.add(data));
		    }catch(CalculatorException ce) {
	        	System.out.println(ce.getErrorCode());
	        	ce.printStackTrace();
	        }
	
			break;
		
		case "Sub": 
			System.out.println("Subtraction"+service.sub(data));
			break;
		
		case "Mul": 
			System.out.println("Multiplication"+service.mul(data));
			break;
			
		case "Div": 
			    try {
		        	System.out.println("Division"+service.div(data));
		        }catch(CalculatorException ce) {
		        	System.out.println(ce.getErrorCode());
		        	ce.printStackTrace();
		        }
			break;
			
		
		}
	}
	
}



public class CalculateController {
	static Cal cal = new Cal();
	public static void main(String[] args) {
		Data data = new Data();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the firstnumber");
		data.setFirstNumber(scanner.nextInt());
		
		System.out.println("Enter the secondNumber");
		data.setSecondNumber(scanner.nextInt());
		
		
		cal.compute("Add",data);
		cal.compute("Sub",data);
		cal.compute("Mul",data);
		cal.compute("Div",data);
		System.out.println("end");
	}

}
