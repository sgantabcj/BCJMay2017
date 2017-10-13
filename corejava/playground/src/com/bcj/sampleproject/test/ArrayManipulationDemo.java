package com.bcj.sampleproject.test;

import java.util.Arrays;

public class ArrayManipulationDemo {
	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] intArray2 = new int[7];
		// to copy elements from one array to other using array-copy method of
		// System class
		// by mentioning the source index, destination index and number of
		// elements to be copied
		System.arraycopy(intArray, 3, intArray2, 0, 7);
		System.out.println("Array1 is:");
		for (int i : intArray) {
			System.out.print(i);
		}
		System.out.println("Array2 is:");
		for (int i : intArray2) {
			System.out.print(i);
		}
		// to copy a range of elements using copyOfRange method of Arrays class
		int[] intArray3 = Arrays.copyOfRange(intArray, 2, 7);
		System.out.println("Array3 is:");
		for (int i : intArray3) {
			System.out.print(i);
		}
		// sort the array in ascending order
		Arrays.sort(intArray);
		System.out.println("\nSorted Array1 is:");
		for (int i : intArray) {
			System.out.print(i);
		}
		// new parallelSort method from Arrays class
		// first just by sending the array
		Arrays.parallelSort(intArray2);
		System.out.println("parallel sorted intArray2 is:\n" + Arrays.toString(intArray2));
		// second parallel sort implementation by sending starting and ending
		// indices
		int[] intArray4 = { 2, 1, 0, 53, 43, 53, -1, -28, -100 };
		Arrays.parallelSort(intArray4, 0, 7);
		System.out.println("parallel sorted intArray2 is:\n" + Arrays.toString(intArray4));
		// binary search using Arrays class for an element inside the array
		// it returns an index for the matched element
		int searchVal = 9;
		int retVal = Arrays.binarySearch(intArray, searchVal);
		System.out.println("\nThe result of binary search for 9 in intArray is:" + retVal);
		// equals method of Arrays class determines if two arrrays are equal
		boolean isEqual = Arrays.equals(intArray, intArray2);
		System.out.println("Is intArray equal to intArray2: " + isEqual);
		// toString method returns a string representation of contents of
		// specified array
		System.out.println("intArray in string format: " + Arrays.toString(intArray));

		// reversing the elements inside the array
		String[] s = { "s", "r", "a", "v", "a" };
		reverseArray(s);
	}

	// reverses the elements order in an array
	static void reverseArray(String[] s) {
		String temp = "";
		for (int i = 0; i < s.length / 2; i++) {
			temp = s[i];
			s[i] = s[s.length - 1 - i];
			s[s.length - 1 - i] = temp;
		}
	}
}
