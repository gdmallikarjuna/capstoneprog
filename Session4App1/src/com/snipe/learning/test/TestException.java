package com.snipe.learning.test;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			throw new NullPointerException();
			}catch(NullPointerException e){
			  System.out.println(e);
			}

			try{
			throw new NullPointerException();
			}catch(NullPointerException e){
			  e.printStackTrace();
			}

	}

}
