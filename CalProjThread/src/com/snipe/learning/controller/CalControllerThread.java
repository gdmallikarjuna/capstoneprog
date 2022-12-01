package com.snipe.learning.controller;

import java.util.Scanner;

import com.snipe.learning.constants.Constant;
import com.snipe.learning.domain.Data;
import com.snipe.learning.exception.CalculatorException;
import com.snipe.learning.service.Calculator;
import com.snipe.learning.service.CalculatorServiceImpl;

class Calulator extends Thread {

	Calculator cal = new CalculatorServiceImpl();
	Data data = new Data();

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public void run() {
		try {
			compute(Constant.OPER_ADD,this.data);
			compute(Constant.OPER_SUB,this.data);
			compute(Constant.OPER_MUL,this.data);
			compute(Constant.OPER_DIV,this.data);
	
		} catch (CalculatorException ce) {
			System.out.println(ce.getErrorCode());
			ce.printStackTrace();
		}
	}

	public void compute(String oper, Data data) throws CalculatorException {
		switch (oper) {
		case Constant.OPER_ADD:
			System.out.println(cal.add(data));
			break;
		case Constant.OPER_SUB:
			System.out.println(cal.sub(data));
			break;
		case Constant.OPER_MUL:
			System.out.println(cal.mul(data));
			break;
		case Constant.OPER_DIV:
			System.out.println(cal.div(data));
			break;
		}

	}

}

public class CalControllerThread {

	static Calulator cal = new Calulator();
	Data data = new Data();

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		cal.data.setFirstNum(scan.nextInt());
		cal.data.setSecondNum(scan.nextInt());
		cal.start();

	}

}
