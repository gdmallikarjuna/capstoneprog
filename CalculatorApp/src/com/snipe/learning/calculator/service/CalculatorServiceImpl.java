package com.snipe.learning.calculator.service;

import com.snipe.learning.calculator.exception.CalculatorException;
import com.snipe.learning.calculator.exception.ErrorCode;
import com.snipe.learning.calculator.persistence.CalculatorDao;
import com.snipe.learning.calculator.persistence.CalculatorDaoImpl;
import com.snipe.learning.domain.Data;


public class CalculatorServiceImpl implements Calculator{
    
	CalculatorDao dao = new CalculatorDaoImpl();

	@Deprecated
	public int add(Data data) throws  CalculatorException{
		if(data.getFirstNumber() < 0 && data.getSecondNumber() < 0)
		   	throw new CalculatorException(ErrorCode.NO_POSITIVE_NUM);
		 return dao.add(data);
	}

	@Override
	public int sub(Data data) {
		// TODO Auto-generated method stub
		return dao.sub(data);
	}

	@Override
	public int mul(Data data) {
		// TODO Auto-generated method stub
		return dao.mul(data);
	}

	@Override
	public int div(Data data) throws CalculatorException {
		  if(data.getSecondNumber() == 0)
		   	throw new CalculatorException("Input error",ErrorCode.GIVE_VALID_INPUT);
		 
		// TODO Auto-generated method stub
		return dao.div(data);
	}

}
