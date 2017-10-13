package com.crmindz.bcjmay2017.flowcontrol.lab4;

public class MultiplesPrinter {
	public static void main(String[] args) {
		System.out.println("N\tN*10\tN*100\tN*1000");
		for(int i=1;i<=5;i++){
			System.out.printf("%d\t%d\t%d\t%d\n",i,i*10,i*100,i*1000);
		}
	}
}
