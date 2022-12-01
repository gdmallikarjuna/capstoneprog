package com.snipe.learning.classex;

public class Student {
  String name;
  String rollNum;
  int age;
  static String cname="MTech";
  
  public Student(String name, String rollNum, int age) {
	  this.name = name;
	  this.rollNum = rollNum;
	  this.age = age;
  }
  
  
  public void display() {
	  System.out.print(this.name+"::"+this.rollNum+"::"+this.age+"::"+this.cname);
  }
}

