package com.snipe.learning.persistence;

import com.snipe.learning.exception.CalculatorException;
import com.snipe.learning.exception.ErrorCode;

public class CalDaoImpl implements CalDao{

	@Override
    public int add(int firstNum, int secondNum) {
    	return firstNum + secondNum;
    }

	@Override
	public int sub(int firstNum, int secondNum) throws CalculatorException {
	    int num;
		try {
	    	
	    	if(firstNum >0 && secondNum >0) {
	    		num =firstNum - secondNum;
	    	}else {
	    		throw new CalculatorException(ErrorCode.NO_POSITIVE_NUM);
	    	}
	    		
	    }catch(ArithmeticException ae) {
	    	throw new CalculatorException(ErrorCode.UNKNOWN_ERROR);
	    }
		
		return num;
	}

	@Override
	public int mul(int firstNum, int secondNum) {
		return firstNum * secondNum;
	}

	@Override
	public int div(int firstNum, int secondNum) throws CalculatorException   {
	    int num;
		try {
			num =firstNum / secondNum;
		}catch(ArithmeticException ce){
			throw new CalculatorException("second num is zero",ce,ErrorCode.DIV_INPUT_ERROR);
		}
		
		return num; 
	}
}
