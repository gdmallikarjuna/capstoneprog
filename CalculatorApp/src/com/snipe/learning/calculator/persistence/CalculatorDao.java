package com.snipe.learning.calculator.persistence;

import com.snipe.learning.calculator.exception.CalculatorException;
import com.snipe.learning.domain.Data;

public interface CalculatorDao {
	public int add(Data data);
	public int sub(Data data);
	public int mul(Data data);
	public int div(Data data) throws CalculatorException;

}
