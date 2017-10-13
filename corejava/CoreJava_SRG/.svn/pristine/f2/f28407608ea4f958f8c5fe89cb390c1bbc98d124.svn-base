package com.crmindz.bcjmay2017.collections.lists.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.Test;

import com.crmindz.bcjmay2017.collections.lists.ArrayListManipulationDemo;

public class ArrayListManipulationDemoTest {

	@Test
	public void IsDoubleList() {
		ArrayListManipulationDemo listDemo = new ArrayListManipulationDemo();
		ArrayList<String> testList = new ArrayList<String>();
		testList.add("test");
		listDemo.doubleList(testList);
		ArrayList<String> expectedList = new ArrayList<String>();
		expectedList.add("test");
		expectedList.add("test");
		assertThat("Successfully doubled all the items of the list",expectedList,is(testList));
	}

}
