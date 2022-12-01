package com.snipe.learning.persistence;

import com.snipe.learning.domain.Data;
import com.snipe.learning.exception.CalculatorException;

public interface CalDao {
	public int add(Data data);
	public int sub(Data data) throws CalculatorException;
	public int mul(Data data);
	public int div(Data data) throws CalculatorException;
	
}
