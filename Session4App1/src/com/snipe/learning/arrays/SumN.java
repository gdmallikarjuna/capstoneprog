package com.snipe.learning.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumN {
	
	int size=5;
	int arr[]=new int[size];
	
	public SumN(int size) {
		this.size = size;
	}
	
   
	public void read() {
		System.out.println("Enter the "+size+" items");
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<size;i++)
			this.arr[i] = scan.nextInt();
	}
	
	
	public void sort() {
		Arrays.sort(arr);
		for(int num : arr) {
			System.out.println(num);
		}
	}
	
	public void sum( ) {
	  int sum=0;
	  for(int num:arr) {
		sum = sum + num;  
	  }
	  System.out.println("The total sum is::"+sum);
	}



	public String toString() {
		return "SumN [size=" + size + ", arr=" + Arrays.toString(arr) + "]";
	}
	
	
}
