package com.bcj.sampleproject.test;

public class StringReverseDemo {
	public static void main(String[] args) {
		String s = "sravan";
		String sReverse = reverse(s);
		System.out.println(sReverse);
	}
	public static String reverse(String s){
		if(s.length()<2){
			return s;
		}
		return reverse(s.substring(1))+s.charAt(0);
	}
}
