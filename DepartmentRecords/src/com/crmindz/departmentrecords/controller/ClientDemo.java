package com.crmindz.departmentrecords.controller;

import java.util.List;
import java.util.Scanner;

import com.crmindz.departmentrecords.service.DepartmentService;
/**
 * this class holds methods for user interaction.
 * 
 * @author Sravan
 *
 */
public class ClientDemo {
	
	DepartmentService deptService = new DepartmentService();
	Scanner sc = new Scanner(System.in);
	private String departmentRecordsString;
	
	
	public static void main(String[] args) {
		ClientDemo clientDemo = new ClientDemo();
		clientDemo.readUserInput();
		clientDemo.displayRecords();
		clientDemo.sc.close();
	}
	/**
	 * reads the user input.
	 */
	public void readUserInput(){
		System.out.println("Please enter the data string:");
		departmentRecordsString = sc.nextLine();
		deptService.saveDepartmentData(departmentRecordsString);
	}
	/**
	 * displays the department records.
	 */
	public void displayRecords(){
		System.out.println("The input you have entered:");
		List<String> deptData = deptService.fetchDepartmentData();
		for(String record : deptData){
			System.out.println(record.replace(":", "\t-\t"));
		}
		System.out.println("Would you like to retrieve data from a given department:");
		int deptRecordValue = deptService.fetchDepartmentRecord(sc.nextLine());
		if(deptRecordValue!=-1){
			System.out.println(deptRecordValue);
		}else{
			System.out.println("Sorry, no match found");
		}
	}
}