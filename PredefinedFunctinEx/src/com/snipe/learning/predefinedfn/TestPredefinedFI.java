package com.snipe.learning.predefinedfn;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Student {
	String collegeName;

	public Student() {
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
}
class User {
	private String name;
	private String password;

	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}



	public class TestPredefinedFI {
		public static void main(String args[]) {

			Predicate<String> isStrLength = str -> str.length() > 6;
			System.out.println(isStrLength.test("MALLIKARJUNA"));
			System.out.println(isStrLength.test("Ramesh"));

			List<String> arrObj1 = new ArrayList<String>();
			// arrObj1.add("Mallik");
			// arrObj1.add("swamy");

			Predicate<List<String>> obj = arr -> arr.isEmpty();
			System.out.println("arr is::" + obj.test(arrObj1));

			Predicate<User> userObj = user -> user.getName().equals("mallik") && user.getPassword().equals("mallik");

			if (userObj.test(new User("mallik", "mallik"))) {
				System.out.println("valid user");
			} else {
				System.out.println("Invalid user");
			}

			Function<Integer, Integer> square = a -> a * a;
			System.out.println(square.apply(10));

			Function<String, Integer> strObj = str -> str.length();
			System.out.println(strObj.apply("welcome"));

			Student std=new Student();
			Consumer<Student> con = a->a.setCollegeName("JNNCE");
			con.accept(std);
			System.out.println(std.getCollegeName());         

			Supplier<Double>  sup = () ->Math.random();
			System.out.println(sup.get());
			
		}

	}


