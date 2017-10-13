package com.crmindz.bcjmay2017.operators.lab5;

import java.util.Scanner;

public class NumberDigitsPrinter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a 5 digit number to print its digits individually separated by spaces:");
		int number = sc.nextInt();
		sc.close();
		int divider = 10000;
		while(number>0){
			System.out.printf("%d   ",number/divider);
			number%=divider;
			divider/=10;
		}
	}
}
