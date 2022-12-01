package com.snipe.learning.corejava;

public class OverLoadEx {
	private void OverLoadEx() {
		System.out.println("welcome to overload method");
	}

	private void OverLoadEx(int x) {
		System.out.println("welcome to overload method" + x);
	}

	private void OverLoadEx(int x, int y) {
		System.out.println("welcome to overload method" + x + "::" + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadEx ove = new OverLoadEx();
		ove.OverLoadEx();
		ove.OverLoadEx(10);
		ove.OverLoadEx(10,20);

	}

}
