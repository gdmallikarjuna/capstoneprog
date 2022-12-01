package com.snipe.learning.corejava;
class Employee{
	String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class DifferentCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp =null;
		try {
			System.out.println("name::"+emp.getName());
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("In the exception catch");
		}
		/*
		 * catch(NullPointerException ne) {
		 * System.out.println("In the exception null catch"); }
		 */
	}

}
