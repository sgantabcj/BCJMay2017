package com.crmindz.bcjmay2017.flowcontrol.lab7;

public class LargestNumber {
	public static void main(String[] args) {
		int largestNum = getLargest(1,2,3,4,5,2,42,52,52,55);
		System.out.printf("Largest of 1,2,3,4,5,2,42,52,52,55 is : %d",largestNum);
	}
	public static int getLargest(int...series){
		int counter = 0;
		int number = 0;
		int largestNum = 0;
		while(counter<10){
			number = series[counter];
			largestNum = (number>largestNum)?number:largestNum;
			counter++;
		}
		return largestNum;
	}
}
