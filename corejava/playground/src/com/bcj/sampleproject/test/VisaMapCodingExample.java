package com.bcj.sampleproject.test;

import java.util.HashMap;
import java.util.Map;

public class VisaMapCodingExample {

	public static void main(String[] args) {
		String s = "Texas=Austin;NewYork=NY;Georgia=Atlanta;";
		System.out.println("Output map for string:"+s+" is :"+storeInHashMap(s));
	}
	
	public static Map<String,String> storeInHashMap(String input){
		Map<String,String> outputMap = new HashMap<String,String>();
		String[] statesArray = input.split(";");
		for(String state : statesArray){
			String[] stateArray = state.split("=");
			outputMap.put(stateArray[0], stateArray[1]);
		}
		return outputMap;
		
		
		/*int index = 0;
		while(index<=input.length()){
			if(input.indexOf(';', index)>0){
				
				outputMap.put(key, value)
			}
		}*/
	}
}
