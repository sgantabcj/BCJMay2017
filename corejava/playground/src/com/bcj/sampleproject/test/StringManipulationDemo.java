package com.bcj.sampleproject.test;

// Contains methods to manipulate a string
public class StringManipulationDemo {
	public static void main(String[] args) {
		String s = " sravan ganta    is a good boy ";
		reverseEachWordOfString(s);

		String reverseStr = reverseString(s);
		System.out.println("reversed string is: " + reverseStr);

		// finding number of words in a string using split method and regex
		String s1 = s.trim();
		String[] sArray = s1.split("\\s+");
		System.out.println("words in \"" + s + "\" found using regex, split are :" + sArray.length);
	}

	// prints a string after reversing the string argument
	static void reverseEachWordOfString(String inputString) {
		String[] words = inputString.split(" ");

		String reverseString = "";

		for (int i = 0; i < words.length; i++) {
			String word = words[i];

			String reverseWord = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}

			reverseString = reverseString + reverseWord + " ";
		}

		System.out.println(inputString);

		System.out.println(reverseString);
	}

	// returns a reversed version of string argument passed
	static String reverseString(String s) {
		System.out.println("Original string: " + s);
		String reverseStr = "";
		for (int i = 0; i < s.length(); i++) {
			reverseStr += s.charAt(s.length() - 1 - i);
		}
		return reverseStr;
	}
}
