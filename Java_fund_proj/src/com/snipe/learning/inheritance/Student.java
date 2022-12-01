package com.snipe.learning.inheritance;

public class Student extends Person{
    String rollNum;
    String course;
    Student(String name, int age, String sex, String rollNum, String course){
    	super(name,age,sex);
       	this.rollNum = rollNum;
    	this.course = course;
    }
    
    public void display() {
    	System.out.println("the student details::");
    	System.out.println(this.name+"::"+this.age+"::"+this.sex+"::"+this.rollNum+"::"+this.course);
    }
}
