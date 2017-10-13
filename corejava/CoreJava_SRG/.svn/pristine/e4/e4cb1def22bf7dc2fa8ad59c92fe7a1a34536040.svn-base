package com.crmindz.bcjmay2017.collections.lists.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.crmindz.bcjmay2017.collections.lists.ArrayOddEvenElements;
public class ArrayOddEvenElementsTest {

	@Test
	public void testReverseOddEvenItems() {
		ArrayOddEvenElements oddEven = new ArrayOddEvenElements();
		List<String> testList = new ArrayList<String>();
		testList.add("even");
		testList.add("odd");
		oddEven.reverseOddEvenItems(testList);
		
		List<String> excpectedList = new ArrayList<String>();
		excpectedList.add("odd");
		excpectedList.add("even");
		
		assertThat("Successfully reversed the items present in even and odd indices of the list",excpectedList,is(testList));
	}

}
