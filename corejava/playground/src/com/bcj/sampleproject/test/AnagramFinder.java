package com.bcj.sampleproject.test;

import java.util.Arrays;

public class AnagramFinder {
	public static void main(String[] args) {
		System.out.println("Is peek anagram of keep: "+isAnagram("keep","peek"));
	}
	public static boolean isAnagram(String input, String testString){
		char[] inputArray = input.toCharArray();
		char[] testStringArray = testString.toCharArray();
		
		Arrays.sort(inputArray);
		Arrays.sort(testStringArray);
		
		if(Arrays.equals(inputArray,testStringArray)){
			return true;
		}
		return false;
	}
}
