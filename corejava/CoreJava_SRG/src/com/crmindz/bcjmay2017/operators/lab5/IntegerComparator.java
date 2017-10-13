package com.crmindz.bcjmay2017.operators.lab5;

import java.util.Scanner;

public class IntegerComparator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the integers to perform comparision:");
		int valueOne = sc.nextInt();
		int valueTwo = sc.nextInt();
		sc.close();
		
		if(valueOne==valueTwo){
			System.out.println("These numbers are equal");
		}else if(valueOne>valueTwo){
			System.out.println(valueOne+" is larger");
		}else{
			System.out.println(valueTwo+" is larger");
		}
	}
}
