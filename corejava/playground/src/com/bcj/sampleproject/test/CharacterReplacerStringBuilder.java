package com.bcj.sampleproject.test;

public class CharacterReplacerStringBuilder {

	public static void main(String[] args) {
		System.out.println("Replacing 'l' in lol with b: "+replace("lol",'l','b'));
		System.out.println("Replacing 'l' in lol with b using recursive method: "+replaceRecursive("lol",'l','b'));
	}
	
	static String replace(String str, char targetChar, char replaceChar){
		StringBuilder sb = new StringBuilder(str);
		for(int i=0;i<str.length();i++){
			if(sb.charAt(i) == targetChar){
				sb.setCharAt(i, replaceChar);
			}
		}
		return sb.toString();
	}
	
	static public String replaceRecursive(String str, char targetChar, char replaceChar){
		int index = str.indexOf(targetChar);
		
		if(index == -1){
			return str;
		}
		
		
		return replaceRecursive(str.substring(0, index)+replaceChar+str.substring(index+1) , targetChar, replaceChar);
	}
}
