package com.bcj.sampleproject.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String[] args) {
		// first way of using regex using pattern and matcher classes // using
		// compile method of pattern // using matcher and matches methods of matcher class
		String s="sganta.bcj@gmail.com",s1="sravan";
		Pattern p = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher m = p.matcher(s);
		boolean b = m.matches();
		if (b) {
			System.out.println(s+" is valid");
		} else {
			System.out.println(s+" is not a email, please check again");
		}
		m.reset();
		while(m.find()){
			System.out.printf("group2: %s\ngroup3: %s\n"
								,m.group(2),m.group(3));
		}
		
		//
		// // second way of using regex using pattern class
		String result = (Pattern.matches("[a-z]+", s1)) ? " matches pattern" : " does not match the pattern";
		System.out.println(s1+result);

		String testString = "sH_@";
//		To check if a set of expressions are present irrespective of the order of them in the string ?= should be used.
		if (testString.matches("(?=.*[A-Z]+)(?=.*[a-z]+)(?=.*_+).*@")) {
			System.out.println("matches");
		} else {
			System.out.println("mismatch");
		}
	}
}
