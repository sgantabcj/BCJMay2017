package com.crmindz.bcjmay2017.operators.lab5;

public class CheckerBoardPatternPrinter {
	public static void main(String[] args) {
		for(int i=0;i<8;i++){
			for(int j=0;j<16;j++){
				if((i+j)%2==0){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
