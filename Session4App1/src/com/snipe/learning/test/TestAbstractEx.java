package com.snipe.learning.test;

import com.snipe.learning.abandi.Addition;
import com.snipe.learning.abandi.Calculator;

public class TestAbstractEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Calculator cal = new Addition();
     System.out.println(cal.add(10, 20));
     System.out.println(cal.sub(20, 30));
     
	}

}
