package com.crmindz.bcjmay2017.operators.lab5;

public class SquareAndCubePrinter {
	public static void main(String[] args) {
		System.out.println("number square cube");
		for(int i=1;i<11;i++){
			System.out.printf("%d\t%.0f\t%.0f\n",i,Math.pow(i,2),Math.pow(i,3));
		}
	}
}
