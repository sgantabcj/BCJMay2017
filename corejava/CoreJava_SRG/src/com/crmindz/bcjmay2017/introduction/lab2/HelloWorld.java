package com.crmindz.bcjmay2017.introduction.lab2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Accepts arguments and prints them out
 */
public class HelloWorld {
	public static void main(String[] args) {
		displayScannedArgs();
	}

	// method to display the arguments read from user
	// using scanner class
	private static void displayScannedArgs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter you FirstName");
		String firstName = sc.next();
		System.out.println("Please enter you lastName");
		String lastName = sc.next();
		sc.close();
		int age = 0;
		try {
			System.out.println("Please enter you age");
			age = sc.nextInt();
		} catch (InputMismatchException exception) {
			System.out.println("you have not entered an integer value, please try again");
		}
		if (age != 0) {
			System.out.println("Hi " + firstName + " " + lastName + ". How are you doing?" + "\nyour age is " + age
					+ ". Do something with this life, you have only " + (29 - age) + " more years in your hands.");
		}
	}
}