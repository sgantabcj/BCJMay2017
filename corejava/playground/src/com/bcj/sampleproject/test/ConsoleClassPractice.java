package com.bcj.sampleproject.test;

import java.io.Console;

public class ConsoleClassPractice {
	public static void main(String[] args) {
		Console console = System.console();
		if(console == null){
			System.out.println("No console: non-interactive mode!");
			System.exit(0);
		}
		
		System.out.println("Enter input to display: ");
		String input = console.readLine();
		
		System.out.println("Enter a password:");
		char[] password = console.readPassword();
		
		String passport = console.readLine("Enter your %d (th) passport number:", 2);
		
		System.out.printf("The input you have entered is:\nFirst input:%s\nPassport:%s\nPassword:"
							+password.toString(),input,passport);
	}
}
