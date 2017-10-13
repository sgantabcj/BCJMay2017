package com.crmindz.bcjmay2017.overloading.lab2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	private String firstName;
	private String lastName;
	private int employeeId;
	private Date dateOfBirth;
	
	/**
	 * 
	 */
	public Employee() {
	}
	/**
	 * @param firstName
	 */
	public Employee(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @param firstName
	 * @param lastName
	 */
	public Employee(String firstName, String lastName) {
		this(firstName);
		this.lastName = lastName;
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param employeeId
	 */
	public Employee(String firstName, String lastName, int employeeId) {
		this(firstName,lastName);
		this.employeeId = employeeId;
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param employeeId
	 * @param dateOfBirth
	 */
	public Employee(String firstName, String lastName, int employeeId, Date dateOfBirth) {
		this(firstName,lastName,employeeId);
		this.dateOfBirth = dateOfBirth;
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Employee emp1 = new Employee("sravan");
		Employee emp2 = new Employee("sravan","ganta");
		Employee emp3 = new Employee("sravan","ganta",101);
		Employee emp4 = new Employee("sravan","ganta",101,new GregorianCalendar(1993,Calendar.DECEMBER,9).getTime());
		System.out.printf("first name: %s\nlast name: %s\nemp Id : %d\ndate: %tB %td,%ty"
							,emp4.firstName,emp4.lastName,emp4.employeeId
							,emp4.dateOfBirth,emp4.dateOfBirth,emp4.dateOfBirth);
	}
}
