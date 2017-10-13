package com.crmindz.bcjmay2017.oop.overloading.lab1;

public class DemoPrint {
	public static void main(String[] args) {
		PrintDetails pd = new PrintDetails();
		pd.printHeader('*');
		pd.printHeader('Z',20);
		pd.printHeader("University of Dallas");
	}
}
