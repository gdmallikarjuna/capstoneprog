package com.snipe.learning.persistence;

import com.snipe.learning.exception.CalculatorException;

public interface CalDao {
	public int add(int firstNum, int secondNum);
	public int sub(int firstNum, int secondNum) throws CalculatorException;
	public int mul(int firstNum, int secondNum);
	public int div(int firstNum, int secondNum) throws CalculatorException;
	
}
