package com.bcj.sampleproject.test;

public class StringDuplicateCharacters {
	public static void main(String[] args) {
		String s = "sravananasaaa";
		String s1 = s;
		for(int i=0;i<s.length();i++){
			char temp = s.charAt(i);
			int index = i+1;
			while(s.indexOf(temp,index)>-1){
				index = s.indexOf(temp,index);
				s = s.substring(0, index)+s.substring(index+1);
			}
		}
		
		System.out.println("After removing duplicates: "+s);
		String s2 = s1;
		String resultStr = "";
		while(s2.length()>0){
			resultStr += s2.charAt(0);
			s2 = s2.replaceAll(s2.charAt(0)+"", "");
		}
		System.out.println(resultStr);
	}
}
