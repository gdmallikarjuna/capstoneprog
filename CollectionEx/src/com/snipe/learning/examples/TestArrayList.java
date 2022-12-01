package com.snipe.learning.examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class TestArrayList {

	public static void main(String[] args) {
	 
	    SortedSet arr1= new TreeSet();	
     	arr1.add(10);
		arr1.add(20);
		arr1.add(20);
		arr1.add(20);
		arr1.add(12.45f);
		arr1.add(100);
		System.out.println("set implementation:"+arr1);
		
		
		
		
		List<Integer> arr2=new ArrayList<Integer>();
		arr2.add(10);
		arr2.add(30);
		arr2.add(30);
		arr2.add(30);
		arr2.add(50);
		arr2.add(60);
			
		System.out.println(arr2);
		
		Set<Integer> arr3=new HashSet<Integer>(arr2);
		arr3.add(50);
		arr3.add(60);
		arr3.add(70);
		arr3.add(80);
		arr3.add(90);
		arr3.add(100);
		System.out.println(arr3);
		
		Set<Integer> arr4=new HashSet<Integer>();
		arr4.add(50);
		arr4.add(60);
		arr4.add(70);
		arr4.add(80);
		arr4.add(90);
		arr4.add(100);
		System.out.println(arr4);
		
		//union
		arr2.retainAll(arr4);
		System.out.println(arr2);
		//work with
		//traditional method or legacy using iterator
		Iterator<Integer> iter = arr4.iterator();
		while(iter.hasNext()) {
			Integer num = iter.next();
			System.out.println("Iterator --numbers:-->"+num);
		}
		
		
		for(Integer num:arr4) {
			System.out.println("for--numbers:-->"+num);
		}
		
		//latest trend -- lambda expression 
		arr4.forEach(System.out::println);
	}

}
