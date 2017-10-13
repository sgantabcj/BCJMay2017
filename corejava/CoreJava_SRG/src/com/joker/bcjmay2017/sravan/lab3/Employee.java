package com.joker.bcjmay2017.sravan.lab3;

public class Employee {
	private int employeeId;
	private char gender;
	private float allowances;
	
	public Employee(int employeeId){
		this.employeeId = employeeId;
	}

	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId
	 *            the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}

	/**
	 * @return the allowances
	 */
	public float getAllowances() {
		return allowances;
	}

	/**
	 * @param allowances
	 *            the allowances to set
	 */
	public void setAllowances(float allowances) {
		this.allowances = allowances;
	}

	/**
	 * @return the basicSalary
	 */
	public double getBasicSalary() {
		return basicSalary;
	}

	/**
	 * @param basicSalary
	 *            the basicSalary to set
	 */
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	private double basicSalary;

	public static void main(String[] args) {
		Employee employeeOne = new Employee(1234);
		employeeOne.setGender('M');
		employeeOne.setAllowances(500);
		employeeOne.setBasicSalary(5000);
		System.out.printf("Details of employee one: id - %d, gender - %c, allowances - %f, basic salary - %f"
							,employeeOne.getEmployeeId(),employeeOne.getGender(),employeeOne.getAllowances()
							,employeeOne.getBasicSalary());
	}
}
