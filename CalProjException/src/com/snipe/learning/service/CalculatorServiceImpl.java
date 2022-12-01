package com.snipe.learning.service;

import com.snipe.learning.exception.CalculatorException;
import com.snipe.learning.persistence.CalDao;
import com.snipe.learning.persistence.CalDaoImpl;

public class CalculatorServiceImpl implements Calculator{
	
	CalDao dao = new CalDaoImpl();
	@Override
    public int add(int firstNum, int secondNum) {
    	return dao.add(firstNum, secondNum);
    }

	@Override
	public int sub(int firstNum, int secondNum) throws CalculatorException {
		// TODO Auto-generated method stub
		return dao.sub(firstNum, secondNum);
	}

	@Override
	public int mul(int firstNum, int secondNum) {
		// TODO Auto-generated method stub
		return dao.mul(firstNum, secondNum);
	}

	@Override
	public int div(int firstNum, int secondNum) throws CalculatorException{
		// TODO Auto-generated method stub
		return dao.div(firstNum, secondNum);
	}
}
