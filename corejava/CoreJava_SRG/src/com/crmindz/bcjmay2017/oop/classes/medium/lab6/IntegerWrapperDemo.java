package com.crmindz.bcjmay2017.oop.classes.medium.lab6;

public class IntegerWrapperDemo {
	public static void main(String[] args) {
		IntegerWrapper intWrapper1 = new IntegerWrapper(1);
		IntegerWrapper intWrapper2 = new IntegerWrapper(2);
		
		System.out.printf("Value of  i in object intWrapper1 is: %d and intWrapper2 is: %d before swap\n"
				,intWrapper1.getI(),intWrapper2.getI());
		
		intWrapper1.swap(intWrapper1, intWrapper2);
		
		System.out.printf("Value of  i in object intWrapper1 is: %d and intWrapper2 is: %d after swap"
								,intWrapper1.getI(),intWrapper2.getI());
	}
}
