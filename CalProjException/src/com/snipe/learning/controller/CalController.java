package com.snipe.learning.controller;

import com.snipe.learning.exception.CalculatorException;
import com.snipe.learning.service.Calculator;
import com.snipe.learning.service.CalculatorServiceImpl;

class Calulator {
	
   Calculator cal = new CalculatorServiceImpl();	

      
   public void  compute(String oper, int firstNum, int secondNum) throws CalculatorException	{
	   switch(oper) {
	   case "Add": System.out.println(cal.add(firstNum, secondNum)); break;
	   case "Sub": 
		     System.out.println(cal.sub(firstNum, secondNum)); 
		     break;
	   case "Mul": System.out.println(cal.mul(firstNum, secondNum)); break;
	   case "Div": System.out.println(cal.div(firstNum, secondNum)); break;
	   }
	   
   }
	
}


public class CalController {
	
	static Calulator cal = new Calulator();	
   
	public static void main(String args[]) {
	   try {
		cal.compute("Add",10,20);
		cal.compute("Sub",-10,-20);
		cal.compute("Mul",10,20);
		cal.compute("Div",10,2);
		
	   } catch (CalculatorException ce) {
		System.out.println(ce.getErrorCode());
		ce.printStackTrace();
	   }
   }
 
}
