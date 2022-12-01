package com.snipe.learning.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamAPI {

	public static void main(String[] args) {
	
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(6);
		arr.add(31);
		arr.add(25);
		System.out.println(arr);
		
		List<Integer> arr1 = arr.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("original"+arr);
		System.out.println("after streaming"+arr1);
		
		
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(1001);
		arr2.add(20101);
		arr2.add(6200);
		arr2.add(3100);
		arr2.add(2500);
		System.out.println(arr2);
		
		List<Integer> updatedSal = arr2.stream().filter(i->i>10000).toList();
		List<Integer> updated1= updatedSal.stream().map(i->i+3000).collect(Collectors.toList());
		System.out.println("updated sal:;"+updatedSal);
		
		
		
	}

}
