package com.crmindz.bcjmay2017.datatypes.arrays;

/*
 * demonstrates the usage of jagged array
 */
public class JaggedArray {
	public static void main(String[] args) {
		// Declaring and initializing the jagged array
		String[][] jaggedArray = { { "Student", "NameT", "Tutorial 1", "Tutorial 2", "Tutorial 3" },
				{ "Tony", "JAVA", "C", "C++" }, { "Thomas", "JAVA", "UNIX" }, { "Dinil", "Linux", "Oracle" },
				{ "Delvin", "RDBMS", "C#", "ORACLE" } };
		// printing out the courses taken by Delvin
		System.out.println("Courses taken by Delvin: ");
		for (String[] tr : jaggedArray) {
			if (tr[0].equals("Delvin")) {
				for (String td : tr) {
					if (td != "Delvin") {
						System.out.print(td + " ");
					}
				}
			}
		}
	}
}
