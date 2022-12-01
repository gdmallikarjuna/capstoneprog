package com.snipe.learning.inheritance;

public class Employee extends Person{
	String empId;
	float salary;
    public Employee(String name,int age,String sex,String empId,float salary ) {
    	super(name,age,sex);
    	this.empId = empId;
    	this.salary = salary;
    }
    
    public void display() {
      System.out.println("the employee details::");
      System.out.println(this.name+"::"+this.age+"::"+this.sex+"::"+this.empId+"::"+this.salary);
    }
}
