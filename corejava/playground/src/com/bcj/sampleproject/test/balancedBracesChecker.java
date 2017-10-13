package com.bcj.sampleproject.test;

import java.util.Stack;

public class balancedBracesChecker {
	
	public static void main(String[] args) {
		System.out.println("Check if brackets are balanced in {[]}: "+isBalanced("{{(})[]}"));
	}
	
	public static boolean isBalanced(String testString){
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0;i<testString.length();i++){
			char c = testString.charAt(i);
			if(c=='[' || c=='{' || c=='('){
				st.push(testString.charAt(i));
			}else if(c==']'){
				if(st.empty() || st.pop()!='['){
					return false;
				}
			}else if(c=='}'){
				if(st.empty() || st.pop()!='{'){
					return false;
				}
			}else if(c==')'){
				if(st.empty() || st.pop()!='('){
					return false;
				}
			}
		}
		
		if(st.empty()){
			return true;
		}
		
		return false;
	}
	
}
