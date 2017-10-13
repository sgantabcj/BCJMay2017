package com.crmindz.bcjmay2017.collections.sets.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import com.crmindz.bcjmay2017.collections.sets.CommonCount;

public class CommonCountTest {

	@Test
	public void testCountCommonItems() {
		CommonCount commonCount = new CommonCount();
		
		
		Integer[] intArray1 = new Integer[] {1,2,3,4};
		Integer[] intArray2 = new Integer[] {1,2};
		
		Collection<Integer> testCollection1 = new ArrayList<Integer>();
		testCollection1.addAll(Arrays.asList(intArray1));
		
		Collection<Integer> testCollection2 = new ArrayList<Integer>();
		testCollection2.addAll(Arrays.asList(intArray2));
		
		assertEquals("Successfully returned the count of common items from two collecitons",2,commonCount.countCommonItems(testCollection1, testCollection2));
	}

}
