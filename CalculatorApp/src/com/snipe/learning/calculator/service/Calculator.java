package com.snipe.learning.calculator.service;

import com.snipe.learning.calculator.exception.CalculatorException;
import com.snipe.learning.domain.Data;

public interface Calculator {
	public int add(Data data) throws  CalculatorException;
	public int sub(Data data);
	public int mul(Data data);
	public int div(Data data) throws CalculatorException;

}
