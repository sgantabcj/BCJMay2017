package com.crmindz.bcjmay2017.collections.sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CommonCount {
	public static void main(String[] args) {
		
		CommonCount commonCount = new CommonCount();
		
		Integer[] intArray1 = new Integer[] {3, 7, 3, -1, 2, 3, 7, 2, 15, 15};
		Integer[] intArray2 = new Integer[] {-5, 15, 2, -1, 7, 15, 36};
		
		Collection<Integer> col1 = new ArrayList<Integer>();
		col1.addAll(Arrays.asList(intArray1));
		
		Collection<Integer> col2 = new ArrayList<Integer>();
		col2.addAll(Arrays.asList(intArray2));
		
		int count = commonCount.countCommonItems(col1, col2);
		System.out.println("The common number of element is: "+count);
	}
	
	public int countCommonItems(Collection<Integer> col1,Collection<Integer> col2){
		
		Set<Integer> set1 = new HashSet<Integer>(col1);
		Set<Integer> set2 = new HashSet<Integer>(col2);
		
		set1.retainAll(set2);
		
		return set1.size();
	}
}
