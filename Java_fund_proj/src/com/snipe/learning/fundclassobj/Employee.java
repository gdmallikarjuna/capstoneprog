package com.snipe.learning.fundclassobj;

/*
 * File	           : Employee.java 
 * Version         : 1.0
 * Author          : Snipe Tech Pvt Ltd	 
 * Created Date    : 24 July 2021
 * Purpose         : To generate read the employee information and display the same
 * This software is the confidential and proprietary information of
 * Snipe Tech Pvt Ltd, Bangalore. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Snipe Tech Pvt Ltd.
 **/
public class Employee {
    String empId;
	String name;
	int age;
	String sex;
	
	public Employee(String empId, String name, int age, String sex) {
		this.empId = empId;
		this.name = name;
		this.age= age;
		this.sex = sex;
	}
	
	public void display() {
		System.out.println("Employee Information");
		System.out.println(this.name + "::" + this.empId + "::"+this.age+ "::"+ this.sex);
	}
	public static void main(String[] args) {
	
		Employee employee = new Employee("mallikarjuna g d","a001",40,"male");
		employee.display();
	}

}
