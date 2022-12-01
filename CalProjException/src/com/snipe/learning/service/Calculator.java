package com.snipe.learning.service;

import com.snipe.learning.exception.CalculatorException;

public interface Calculator {
	public int add(int firstNum, int secondNum);
	public int sub(int firstNum, int secondNum) throws CalculatorException;
	public int mul(int firstNum, int secondNum);
	public int div(int firstNum, int secondNum) throws CalculatorException;
	
}
