package com.snipe.learning.classex;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner = new Scanner(System.in);
       System.out.println("this student details");
       String sname = scanner.nextLine();
       String rollNum = scanner.nextLine();
       int age= scanner.nextInt();
       
       Student student = new Student(sname,rollNum,age);
       student.display();
	}

}
