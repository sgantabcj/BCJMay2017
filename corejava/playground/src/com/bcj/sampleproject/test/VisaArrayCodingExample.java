package com.bcj.sampleproject.test;

import java.util.Arrays;

public class VisaArrayCodingExample {
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,100,101,102};
		int input = 107;
		System.out.println("Does sum of any two elements of array "+Arrays.toString(array)+" is equal to "+input+"? :"+hasSumInt(array, input));
	}
	
	public static boolean hasSumInt(int[] array, int input){

		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]+array[j] == input){
					return true;
				}
			}
		}
		
		return false;
	}
	
}
