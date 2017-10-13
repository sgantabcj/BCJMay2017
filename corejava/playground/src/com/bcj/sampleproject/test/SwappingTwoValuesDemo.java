package com.bcj.sampleproject.test;

public class SwappingTwoValuesDemo {
	public static void main(String[] args) {
		int a = 5, b = 6;
		System.out.println("a: " + a + " b: " + b);
		// using arithmetic operators
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a: " + a + " b: " + b);

		// using bitwise operators
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("a: " + a + " b: " + b);

		// using only one statement
		b = a + b - (a = b);
		System.out.println("a: " + a + " b: " + b);
	}
}
