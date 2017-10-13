package com.crmindz.bcjmay2017.classes.medium.lab2;

public class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;
	private static float percentageRaise;
	
	public Employee(String fName, String lName, double monthlySalary){
		this.firstName = fName;
		this.lastName = lName;
		if(monthlySalary<0){
			this.monthlySalary = 0.0;
		}else{
			this.monthlySalary = monthlySalary;
		}
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the monthlySalary
	 */
	public double getMonthlySalary() {
		return monthlySalary;
	}
	/**
	 * @param monthlySalary the monthlySalary to set
	 */
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	/**
	 * @return the percentageRaise
	 */
	public float getPercentageRaise() {
		return percentageRaise;
	}
	/**
	 * @param percentageRaise the percentageRaise to set
	 */
	public void setPercentageRaise(float percentageRaise) {
		Employee.percentageRaise = percentageRaise;
	}
	
}
