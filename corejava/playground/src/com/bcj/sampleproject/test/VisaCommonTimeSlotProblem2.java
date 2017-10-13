package com.bcj.sampleproject.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VisaCommonTimeSlotProblem2 {
	private static Map<String,Integer> timeSlotMap = new HashMap<String,Integer>();

	public static void main(String[] args) {
		
		incrementMapValues(4,7);
		incrementMapValues(5,9);
		incrementMapValues(3,10);
		
		
		List<String> commonSlotList = new ArrayList<String>();
		int maxValue = Collections.max(timeSlotMap.values());
		for(String timeSlot: timeSlotMap.keySet()){
			if(timeSlotMap.get(timeSlot) == maxValue){
				commonSlotList.add(timeSlot);
			}
		}
		
		System.out.println(commonSlotList.toString());
	}
	public static void incrementMapValues(int startTime, int endTime){
		for(int i=startTime;i<endTime;i++){
			if(timeSlotMap.get(i+"to"+(i+1))==null){
				timeSlotMap.put(i+"to"+(i+1), 1);
			}else{
				timeSlotMap.put(i+"to"+(i+1), timeSlotMap.get(i+"to"+(i+1))+1);
			}
		}
	}
}
