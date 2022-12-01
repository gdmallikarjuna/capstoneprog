package com.snipe.learning.inheritance;
/*
 * File	           : Inheritance.java 
 * Version         : 1.0
 * Author          : Snipe Tech Pvt Ltd	 
 * Created Date    : 24 July 2021
 * Purpose         : To generate employee and student information using
 * person information should be acquired
 * This software is the confidential and proprietary information of
 * Snipe Tech Pvt Ltd, Bangalore. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Snipe Tech Pvt Ltd.
 **/
public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student student = new Student("mallik",44,"Male","R001","MTech");
        student.display();
        
        Employee employee= new Employee("Kholi",34,"Male","L2417",30000);
        employee.display();
	}

}
