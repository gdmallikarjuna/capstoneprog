package com.snipe.learning.corejava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Student implements Cloneable, Serializable {
	public String name;
	public String studId;

	public Student() {
	}

	public Student(String name, String studId) {
		super();
		this.name = name;
		this.studId = studId;
	}

	public String getStudId() {
		return studId;
	}

	public void setStudId(String studId) {
		this.studId = studId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", studId=" + studId + "]";
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

public class WaysClassObjects {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException,
			InvocationTargetException, CloneNotSupportedException, IOException {
		Student student = new Student("Mallik", "AOO1");
		System.out.println("using new keyword:" + student);

		Constructor<?> cls = Class.forName("com.snipe.learning.corejava.Student").getConstructor(String.class,
				String.class);
		Student obj = (Student) cls.newInstance("Ramesh", "A002");
		System.out.println("using Reflection constructor class name:" + obj);

		Class stdCls = Class.forName("com.snipe.learning.corejava.Student");
		Student stdObj = (Student) stdCls.newInstance();
		System.out.println("using Class.forName and  class name:" + obj);

		Student stdA = new Student("Ahamed", "A003");
		Student stdB = (Student) stdA.clone();
		System.out.println("using Clone:" + stdB);

		// serialization
		Student d = new Student("Swamy", "A004");
		FileOutputStream f = new FileOutputStream(
				"F:\\Support\\Training\\sugamys_secondinnings\\corejava\\day5\\file.txt");
		ObjectOutputStream oos = new ObjectOutputStream(f);
		oos.writeObject(d);

		// Deserialization Reading the object from a file
		FileInputStream file = new FileInputStream(
				"F:\\Support\\Training\\sugamys_secondinnings\\corejava\\day5\\file.txt");
		ObjectInputStream in = new ObjectInputStream(file);
		// Method for deserialization of object
		Student object1 = (Student) in.readObject();

		System.out.println("Object has been deserialized ");
		System.out.println("a = " + object1);
	
	}

}
