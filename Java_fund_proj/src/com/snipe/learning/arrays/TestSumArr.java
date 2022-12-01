package com.snipe.learning.arrays;

public class TestSumArr {

	public static void main(String args[]) {
		SumArr sumArr = new SumArr(5);
		sumArr.readArr();
		sumArr.showArr();
		System.out.println("TOTAL"+sumArr.getTotal());
		sumArr.sortArr();
		sumArr.showArr();
	}
}
