package com.snipe.training.oops;

import com.snipe.training.inheritance.Addition;
import com.snipe.training.inheritance.Division;
import com.snipe.training.inheritance.Multiplication;
import com.snipe.training.inheritance.Subtraction;
import com.snipe.training.inheritance.SuperAdd;

public class TestCal {

	public static void main(String[] args) {
      
	
		Addition addition = new Addition(20,30);
        System.out.println(addition.compute());
        
        Subtraction subtraction = new Subtraction(20,30);
        System.out.println(subtraction.compute());
        
        Multiplication multiplication = new Multiplication(20,30);
        System.out.println(multiplication.compute());
        
        Division division = new Division(20,30);
        System.out.println(division.compute());
        
        SuperAdd superAdd = new SuperAdd(10,20,30);
        System.out.println(superAdd.compute());
        
        
        
        
	
	}

}
