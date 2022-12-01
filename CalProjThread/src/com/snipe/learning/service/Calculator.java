package com.snipe.learning.service;

import com.snipe.learning.domain.Data;
import com.snipe.learning.exception.CalculatorException;

/**
 * This is the caluclator interface
 * @author Mallikarjuna G D
 *
 */
public interface Calculator {
	public int add(Data data);
	public int sub(Data data) throws CalculatorException;
	public int mul(Data data);
	public int div(Data data) throws CalculatorException;
	
}
