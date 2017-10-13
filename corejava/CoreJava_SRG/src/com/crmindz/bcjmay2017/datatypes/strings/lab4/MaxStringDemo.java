package com.crmindz.bcjmay2017.datatypes.strings.lab4;

import java.util.Arrays;

public class MaxStringDemo {
	public static void main(String[] args) {
		String inputString = "324, 457, 112, 259, 323, 222";
		String[] inputStringArray = inputString.split(", ");
		int[] numArray = new int[inputStringArray.length];
		for (int i = 0; i < inputStringArray.length; i++) {
			int num = Integer.parseInt(inputStringArray[i]);
			int sum = 0;
			while (num > 0) {
				sum += num % 10;
				num /= 10;
			}
			numArray[i] = sum;
		}
		int maxNum = numArray[0];
		String s1 = "";
		for (int i = 1; i < numArray.length; i++) {
			if (maxNum <= numArray[i]) {
				maxNum = numArray[i];
				s1 += inputStringArray[i] + " ";
			}
		}
		String[] rArray = s1.split(" ");
		int[] rIntArray = new int[rArray.length];
		for (int i = 0; i < rArray.length; i++) {
			rIntArray[i] = Integer.parseInt(rArray[i]);
		}
		System.out.println("Given array is: " + inputString + "\nResult array: " + Arrays.toString(rIntArray));
	}
}
