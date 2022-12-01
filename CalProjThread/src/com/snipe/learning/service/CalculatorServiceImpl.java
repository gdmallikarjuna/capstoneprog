package com.snipe.learning.service;

import com.snipe.learning.domain.Data;
import com.snipe.learning.exception.CalculatorException;
import com.snipe.learning.persistence.CalDao;
import com.snipe.learning.persistence.CalDaoImpl;

public class CalculatorServiceImpl implements Calculator{
	
	CalDao dao = new CalDaoImpl();
	
	/**
	 * 
	 */
	@Override
    public int add(Data data) {
    	return dao.add(data);
    }

	@Override
	public int sub(Data data) throws CalculatorException {
		// TODO Auto-generated method stub
		return dao.sub(data);
	}

	@Override
	public int mul(Data data) {
		// TODO Auto-generated method stub
		return dao.mul(data);
	}

	@Override
	public int div(Data data) throws CalculatorException{
		// TODO Auto-generated method stub
		return dao.div(data);
	}
}
