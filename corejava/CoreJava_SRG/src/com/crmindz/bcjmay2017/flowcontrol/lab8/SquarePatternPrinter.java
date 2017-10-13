package com.crmindz.bcjmay2017.flowcontrol.lab8;

public class SquarePatternPrinter {
	public static void main(String[] args) {
		printPattern(20);
	}
	public static void printPattern(int sideLength){
		if(sideLength>=1 && sideLength<=20){
			for(int i=0;i<sideLength;i++){
				for(int j=0;j<sideLength;j++){
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
