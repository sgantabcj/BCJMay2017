package com.crmindz.bcjmay2017.collections.maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class RarestItemFinder {
	public static void main(String[] args) {
		Map<String,Integer> cityMap = new HashMap<String,Integer>();
		cityMap.put("Alyssa", 22);
		cityMap.put("Char", 25);
		cityMap.put("Dan", 25);
		cityMap.put("Jeff", 20);
		cityMap.put("Kasey", 20);
		cityMap.put("Kim", 20);
		cityMap.put("Mogran", 25);
		cityMap.put("Ryan", 25);
		cityMap.put("Stef", 22);
		cityMap.put("Kelly", 22);
		
		int rarestAge = new RarestItemFinder().rarest(cityMap);
		System.out.println("Rarest age is: " + rarestAge);
	}
	public int rarest(Map<String,Integer> inputMap){
		
		Map<Integer,Integer> ageCountMap = new HashMap<Integer, Integer>();
		Set<Integer> ageSet = new HashSet<Integer>(inputMap.values());
		
		for(int age : ageSet){
			int count = 0;
			for(int ageInMap : inputMap.values()){
				if(age == ageInMap){
					count++;
				}
			}
			ageCountMap.put(age, count);
		}
		
		
		int rarestAgeCount = (int) new TreeSet<Integer>(ageCountMap.values()).first();
		TreeSet<Integer> rarestAgeSet = new TreeSet<Integer>();
		for(Map.Entry<Integer, Integer> entry : ageCountMap.entrySet()){
			if(entry.getValue() == rarestAgeCount){
				rarestAgeSet.add(entry.getKey());
			}
		}
		int rarestAge = rarestAgeSet.first();
		
		return rarestAge;
	}
}
