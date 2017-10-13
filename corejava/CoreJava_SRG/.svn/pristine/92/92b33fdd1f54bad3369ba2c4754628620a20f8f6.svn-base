package com.crmindz.bcjmay2017.datatypes.arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * JUnit test cases for ArrayJuitDemo class
 */
public class ArrayJunitDemoTest {
	// checks getOddElementsArray method for correct operation
	@Test
	public void testGetOddElementsArray() {
		ArrayManipulationJunitDemo tester = new ArrayManipulationJunitDemo();
		int[] testArray = { 1, 2, 3, 4, 5, 6 };
		int[] expectedArray = { 1, 3, 5 };
		assertArrayEquals(expectedArray, tester.getOddElementsArray(testArray));
	}

	// checks getIncrementedArray method for correct operation
	@Test
	public void testGetIncrementedArray() {
		ArrayManipulationJunitDemo tester = new ArrayManipulationJunitDemo();
		int[] testArray = { 1, 2, 3, 4, 5, 6 };
		int[] expectedArray = { 1, 4, 3, 6, 5, 8 };
		assertArrayEquals(expectedArray, tester.getIncrementedArray(testArray));
	}

	// checks getThreeMultiplesArray method for correct operation
	@Test
	public void testGetThreeMultiplesArray() {
		ArrayManipulationJunitDemo tester = new ArrayManipulationJunitDemo();
		int[] testArray = { 1, 2, 3, 4, 5, 6 };
		int[] expectedArray = { 3, 6 };
		assertArrayEquals(expectedArray, tester.getThreeMultiplesArray(testArray));
	}

	// checks getArrayAverage method for correct operation
	@Test
	public void testGetArrayAverage() {
		ArrayManipulationJunitDemo tester = new ArrayManipulationJunitDemo();
		int[] testArray = { 1, 2, 3 };
		float expectedVal = 2f;
		float delta = 0.01f;
		assertEquals(expectedVal, tester.getArrayAverage(testArray), delta);
	}

	// checks getHighestArrayElement method for correct operation
	@Test
	public void testGetHighestArrayElement() {
		ArrayManipulationJunitDemo tester = new ArrayManipulationJunitDemo();
		int[] testArray = { 1, 2, 3 };
		int expectedVal = 3;
		assertEquals(expectedVal, tester.getHighestArrayElement(testArray));
	}

	// checks getLowestArrayElement method for correct operation
	@Test
	public void testGetLowestArrayElement() {
		ArrayManipulationJunitDemo tester = new ArrayManipulationJunitDemo();
		int[] testArray = { 1, 2, 3 };
		int expectedVal = 1;
		assertEquals(expectedVal, tester.getLowestArrayElement(testArray));
	}

	// checks getElementsSmallerThanAverage method for correct operation
	@Test
	public void testGetElementsSmallerThanAverage() {
		ArrayManipulationJunitDemo tester = new ArrayManipulationJunitDemo();
		int[] testArray = { 1, 2, 3 };
		int[] expectedArray = { 1 };
		assertArrayEquals(expectedArray, tester.getElementsSmallerThanAverage(testArray));
	}

}
