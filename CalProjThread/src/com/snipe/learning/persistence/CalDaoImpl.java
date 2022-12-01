package com.snipe.learning.persistence;

import com.snipe.learning.domain.Data;
import com.snipe.learning.exception.CalculatorException;
import com.snipe.learning.exception.ErrorCode;

public class CalDaoImpl implements CalDao{

	@Override
    public int add(Data data) {
    	return data.getFirstNum() + data.getSecondNum();
    }

	@Override
	public int sub(Data data) throws CalculatorException {
	    int num;
		try {
	    	
	    	if(data.getFirstNum() >0 && data.getFirstNum() >0) {
	    		num =data.getFirstNum() - data.getSecondNum();;
	    	}else {
	    		throw new CalculatorException(ErrorCode.NO_POSITIVE_NUM);
	    	}
	    		
	    }catch(ArithmeticException ae) {
	    	throw new CalculatorException(ErrorCode.UNKNOWN_ERROR);
	    }
		
		return num;
	}

	@Override
	public int mul(Data data) {
		return data.getFirstNum() * data.getSecondNum();
	}

	@Override
	public int div(Data data) throws CalculatorException   {
	    int num;
		try {
			num = data.getFirstNum()  / data.getSecondNum();
		}catch(ArithmeticException ce){
			throw new CalculatorException(ErrorCode.DIV_INPUT_ERROR);
		}
		
		return num; 
	}
}
