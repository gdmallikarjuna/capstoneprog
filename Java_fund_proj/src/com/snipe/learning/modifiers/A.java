package com.snipe.learning.modifiers;

public class A {
	int def_a=0;
	private int pri_a=1;
	protected int pro_a=2;
	public int pub_a=3;
	
	public A() {}
	
	public void display() {
	 System.out.println("CLASS A::");
     System.out.println("DEFAULT"+def_a);
     System.out.println("PRIVATE"+pri_a);
     System.out.println("PROTECTED"+pro_a);
     System.out.println("PUBLIC"+pub_a);
	}
}
