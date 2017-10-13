package com.bcj.sampleproject.test;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FibonacciPrinter {

	public static void main(String[] args) throws IOException {
		System.out.println("Choose the way in which you want to enter the input \n1.Scanner\n2.BufferReader");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String choice = br.readLine();
		System.out.println("Please enter the max range of fibonacci series you want to display:");
		int maxOffset = 0;
		switch(choice.toLowerCase().trim()) {
			case "1":
			case "scanner":
				Scanner sc = new Scanner(System.in);
				maxOffset = sc.nextInt();
				break;
			case "2":
			case "bufferreader":
				maxOffset = Integer.parseInt(br.readLine().trim());
				break;
		}
		fibonacciPrinter(maxOffset);
	}
	
	public static void fibonacciPrinter(int maxOffset){
		if(maxOffset == 1){
			System.out.print("1");
		}else if(maxOffset == 2){
			System.out.print("1 1");
		}else{
			System.out.print("1 1");
			int previous1 = 1;
			int previous2 = 1;
			int sum = 2;
			while(sum<=maxOffset){
				System.out.print(" "+sum);
				sum = previous1 + previous2;
				previous1 = previous2;
				previous2 = sum;
			}
		}
	}
}
