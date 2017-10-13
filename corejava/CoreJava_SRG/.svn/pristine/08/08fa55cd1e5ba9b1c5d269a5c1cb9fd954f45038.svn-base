package com.crmindz.bcjmay2017.datatypes.arrays;

import java.util.Arrays;

/*
 * provides methods to find exponents of bases 2 and n
 */
public class Exponent {
	public static void main(String[] args) {
		Exponent obj = new Exponent();
		int base = 3, power = 7;

		// to get an array of exponents with base 2
		int[] exponentsBaseTwoArray = obj.powerBaseTwo(power);
		System.out.println("Exponents array with base " + base + " power " + power + " is: "
				+ Arrays.toString(exponentsBaseTwoArray));

		// to get an array of exponents with base n
		int[] exponentsBaseNArray = obj.powerBaseN(base, power);
		System.out.println("Exponents array with base " + base + " power " + power + " is: "
				+ Arrays.toString(exponentsBaseNArray));
	}

	// returns array of exponents with base 2 of powers 0 till the argument
	// passed
	public int[] powerBaseTwo(int power) {
		int[] exponentsArray = new int[power];
		for (int i = 0; i < power; i++) {
			exponentsArray[i] = (int) Math.round(Math.pow(2, i));
		}
		return exponentsArray;
	}

	// returns array of exponents with base and powers as the arguments passed
	public int[] powerBaseN(int base, int power) {
		int[] exponentsArray = new int[power];
		for (int i = 0; i < power; i++) {
			exponentsArray[i] = (int) Math.round(Math.pow(base, i));
		}
		return exponentsArray;
	}
}
