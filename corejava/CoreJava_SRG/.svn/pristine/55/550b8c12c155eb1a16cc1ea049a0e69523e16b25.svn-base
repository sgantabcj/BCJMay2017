package com.crmindz.bcjmay2017.datatypes.arrays;

import java.util.Arrays;

/*
 * provides method to get fibonacci series of a desired length
 */
public class Fibonacci {
	public static void main(String[] args) {
		Fibonacci obj = new Fibonacci();
		int length = 9;
		// getting fibonacci series of a length 9
		int[] fibonacciArray = obj.getFibonacci(length);
		System.out.println("fibonacci series of length " + length + " is :" + Arrays.toString(fibonacciArray));
	}

	// returns an array of fibonacci series for the length argument passed
	public int[] getFibonacci(int n) {
		int[] fibonacciArray = new int[n];
		for (int i = 0; i < n; i++) {
			if (i == 0 || i == 1) {
				fibonacciArray[i] = 1;
			} else {
				fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
			}
		}
		return fibonacciArray;
	}
}
