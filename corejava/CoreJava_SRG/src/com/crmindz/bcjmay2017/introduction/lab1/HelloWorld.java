package com.crmindz.bcjmay2017.introduction.lab1;

/*
 * Accepts cmd line arguments and prints them
 */
public class HelloWorld {
	// main method
	public static void main(String[] args) {
		if (args.length != 0) {
			String firstName = args[0];
			String lastName = args[1];
			int age = Integer.parseInt(args[2]);
			display(firstName, lastName, age);
		}
	}

	// method to display the cmd line arguments
	private static void display(String fName, String lName, int age) {
		System.out.println("Hi " + fName + " " + lName + ". How are you doing?" + "\nyour age is " + age);
	}
}
