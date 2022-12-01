package com.snipe.learning.lamda;
@FunctionalInterface
public interface CalEx extends Calculator {
	default public void m1() {
		System.out.println("welcome");
	}
}
