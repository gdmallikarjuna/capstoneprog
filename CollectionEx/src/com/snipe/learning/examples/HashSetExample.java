package com.snipe.learning.examples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String args[]) {
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(10);
		set1.add(10);
		set1.add(20);
		set1.add(40);
		set1.add(50);
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(70);
		set2.add(10);
		set2.add(80);
		set2.add(100);
		set2.add(510);
		
		//set1.addAll(set2);
		//System.out.println("union");
		//set1.forEach(System.out::println);
		
		/*
		 * System.out.println("intersecton"); set1.forEach(System.out::print);
		 * set2.forEach(System.out::print); System.out.println("intersecton");
		 * 
		 * set1.retainAll(set2); set1.forEach(System.out::println);
		 */
		
		set1.removeAll(set2);
	//	set1.retainAll(set2);
		set1.forEach(System.out::println);
		
		
	}
}
