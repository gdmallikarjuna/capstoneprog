package com.snipe.learning.calculator.persistence;

import com.snipe.learning.calculator.exception.CalculatorException;
import com.snipe.learning.calculator.exception.ErrorCode;
import com.snipe.learning.domain.Data;

public class CalculatorDaoImpl implements CalculatorDao{

	@Override
	public int add(Data data) {
		// TODO Auto-generated method stub
		return data.getFirstNumber() + data.getSecondNumber();
	}

	@Override
	public int sub(Data data) {
		// TODO Auto-generated method stub
		return data.getFirstNumber() - data.getSecondNumber();
	}

	@Override
	public int mul(Data data) {
		// TODO Auto-generated method stub
		return data.getFirstNumber() * data.getSecondNumber();
	}

	@Override
	public int div(Data data) throws CalculatorException {
		// TODO Auto-generated method stub
		int num=0;
		try {
		    if(data.getSecondNumber() != 0)
			 num=data.getFirstNumber() / data.getSecondNumber();
		    else {
		    	throw new CalculatorException(ErrorCode.GIVE_VALID_INPUT);
		    }
		   
		}catch(CalculatorException e) {
			throw new CalculatorException("second number is zero", ErrorCode.DIV_INPUT_ERROR);
		}
		catch(ArithmeticException ae) {
			throw new CalculatorException("second number is zero", ErrorCode.DIV_INPUT_ERROR);
		}
		catch(Exception e) {
			throw new CalculatorException("Unknown error", ErrorCode.UNKNOWN_ERROR);
		}finally {
			
		}
		
		return num;
	}

}
