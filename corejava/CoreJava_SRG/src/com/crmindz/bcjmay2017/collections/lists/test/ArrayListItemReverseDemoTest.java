package com.crmindz.bcjmay2017.collections.lists.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.Test;

import com.crmindz.bcjmay2017.collections.lists.ArrayListItemReverseDemo;

public class ArrayListItemReverseDemoTest {

	@Test
	public void testReverseListItem() {
		ArrayListItemReverseDemo listDemo = new ArrayListItemReverseDemo();
		ArrayList<String> testList = new ArrayList<String>();
		testList.add("teststring");
		listDemo.reverseListItem(testList);
		ArrayList<String> expectedList = new ArrayList<String>();
		expectedList.add("gnirtstset");
		assertThat("Successfully reversed the items of the list",expectedList,is(testList));
	}

}
