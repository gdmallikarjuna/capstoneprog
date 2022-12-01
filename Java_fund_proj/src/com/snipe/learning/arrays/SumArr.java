package com.snipe.learning.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumArr {
	private int a[] = new int[5];
	private int size;

	public SumArr(int len) {
		this.size = len;
	}

	public void readArr() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the :" + this.size + "items");
		for (int i = 0; i < this.size; i++)
			this.a[i] = scan.nextInt();
	}

	public void sortArr() {
		Arrays.sort(a);
	}

	public int getTotal() {
		int sum = 0;
		for (int i:a) {
			sum = sum + i;
		}
		return sum;
	}
	
	public void showArr() {
		System.out.println("SHOW ARRAY ");
		for(int i:this.a) {
			System.out.println(i);
		}
	}
}
