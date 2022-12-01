package com.snipe.learning.calculator.controller;

import java.util.Scanner;

import com.snipe.learning.calculator.exception.CalculatorException;
import com.snipe.learning.calculator.service.Calculator;
import com.snipe.learning.calculator.service.CalculatorServiceImpl;
import com.snipe.learning.domain.Data;

class Cal1 implements Runnable {
	Calculator service = new CalculatorServiceImpl();
	Data data = new Data();

	public void run() {
			compute("Add", data);
			compute("Sub", data);
			compute("Mul", data);
			compute("Div", data);
	}

	public void compute(String oper, Data data) {

		switch (oper) {
		case "Add":
			try {
				System.out.println("Addition" + service.add(data));
			} catch (CalculatorException ce) {
				System.out.println(ce.getErrorCode());
				ce.printStackTrace();
			}

			break;

		case "Sub":
			System.out.println("Subtraction" + service.sub(data));
			break;

		case "Mul":
			System.out.println("Multiplication" + service.mul(data));
			break;

		case "Div":
			try {
				System.out.println("Division" + service.div(data));
			} catch (CalculatorException ce) {
				System.out.println(ce.getErrorCode());
				ce.printStackTrace();
			}
			break;

		}
	}

}

public class CalculatorThread {
	static Cal1 cal = new Cal1();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the firstnumber");
		cal.data.setFirstNumber(scanner.nextInt());

		System.out.println("Enter the secondNumber");
		cal.data.setSecondNumber(scanner.nextInt());
		
		Thread thread = new Thread(cal);
		System.out.println(thread.getState());
		thread.start();
		System.out.println(thread.getState());

	}

}
