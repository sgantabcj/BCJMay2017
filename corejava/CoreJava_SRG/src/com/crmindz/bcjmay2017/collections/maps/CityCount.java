package com.crmindz.bcjmay2017.collections.maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CityCount {
	public static void main(String[] args) {
		Map<String,String> cityMap = new HashMap<String,String>();
		cityMap.put("John", "Dallas");
		cityMap.put("Babbar", "NewYork City");
		cityMap.put("Akbar", "Houston");
		cityMap.put("Rizwan", "Dallas");
		cityMap.put("Jorge", "Paris");
		cityMap.put("Roshan", "Dallas");
		cityMap.put("Sujit", "Houston");
		Map<String,Integer> cityCountMap = new CityCount().cityCount(cityMap);
		System.out.println(cityCountMap);
	}
	public Map<String,Integer> cityCount(Map<String,String> cityMap){
		Map<String,Integer> cityCountMap = new HashMap<String,Integer>();
		Set<String> citySet = new HashSet<String>(cityMap.values());
		for(String city : citySet){
			int count = 0;
			for(String cityInMap : cityMap.values()){
				if(cityInMap.equals(city)){
					count++;
				}
			}
			cityCountMap.put(city, count);
		}
		return cityCountMap;
	}
}
