package com.crmindz.bcjmay2017.operators.lab5;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerManipulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter three integers to perform addition, product and finding smallest and largest of them:");
		int[] intArray = new int[3];
		intArray[0] = sc.nextInt();
		intArray[1] = sc.nextInt();
		intArray[2] = sc.nextInt();
		sc.close();
		Arrays.sort(intArray);
		int sum = intArray[0] + intArray[1] + intArray[2];
		System.out.printf("Three input values are: %d, %d, %d\ntheir sum: %d\ntheir product: %d"
							+"\ntheir average: %d\nlargest of them: %d\nsmallest of them: %d"
							,intArray[0],intArray[1],intArray[2],sum,
							(intArray[0]*intArray[1]*intArray[2]),(int)(sum/3),intArray[2],intArray[0]);
	}
}
