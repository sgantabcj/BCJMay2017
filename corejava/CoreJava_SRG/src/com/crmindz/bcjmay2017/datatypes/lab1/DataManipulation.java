package com.crmindz.bcjmay2017.datatypes.lab1;

import java.util.Arrays;

/*
 * Class does various operations on different data types
 */
public class DataManipulation {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		finding sum of two ints and two floats
//		sum can be displayed with only two digits using %.2f as format specifier
		  int a=10;
		  int b=40;
		  float c=142.5f;
		  float d=333.62f;
		  float sum = a+b+c+d;
		  System.out.printf("Sum of   %d, %d, %.2f, %.2f is: %.2f",a,b,c,d,sum);
		  
//		  performing arithmetic operations on two numbers
		  int i = 45;
		  int j = -21;
		  System.out.printf("Given two numbers %d, %d :"
				  			+"\ntheir sum is: %d"
				  			+"\ntheir difference is: %d"
				  			+"\ntheir product is: %d"
				  			+"\ntheir division is: %d",i,j,(i+j),(i-j),(i*j),(i/j));
		  
		  String helloString = "Hello how are you";
		  char testChar = 'H';
		  int testInt = 1;
		  long intToLong = (long) testInt;
		  int longToInt = (int) intToLong;
		  
		  int[] intArray = new int[10];
		  for(int k=0;k<intArray.length;k++){
			  intArray[k]=1;
		  }
		  System.out.println("Array with 10 elements with each element value as 1: "+Arrays.toString(intArray));
		  
		  char[] charArray = new char[26];
		  for(int k=0;k<charArray.length;k++){
			  charArray[k] = (char)(k+97);
		  }
		  System.out.println("Array with lower case alphabet is: "+Arrays.toString(charArray));
		  
		  int[][] twoDArray = new int[7][5];
		  int count=0;
		  for(int k[]:twoDArray){
			  for(int l:k){
				  l=count++;
				  System.out.print(l+" ");
			  }
			  System.out.println();
		  }
		  
		  String testString ="10";
		  int stringToInt = Integer.parseInt(testString);
		  System.out.println("Integer converted from string is: "+testString);
	}
}