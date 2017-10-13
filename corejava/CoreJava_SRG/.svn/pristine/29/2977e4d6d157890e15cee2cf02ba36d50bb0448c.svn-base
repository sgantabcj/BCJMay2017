package com.crmindz.bcjmay2017.oop.classes.simple.lab4;

public class Student {
	private int studentId;
	private String studentName;
	private String branchName;
	private float qualifyingExamMarks;
	private char studentType;
	private char residentialStatus;
	private int yearOfEngg;
	
	
	public Student(int studentId,char studentType){
		this.studentId = studentId;
		this.studentType = studentType;
	}
	
	public boolean validateStudentName(){
		if(this.studentName.length()<5 && this.studentName.length()>25){
			System.out.print("The length of the name should be minimum 5 characters and a maximum of 25 characters");
			return false;
		}else{
			return true;
		}
	}
	
	public boolean validateBranchName(){
		if(this.branchName.equalsIgnoreCase("CSE") || this.branchName.equalsIgnoreCase("ECE") 
				|| this.branchName.equalsIgnoreCase("EEE") || this.branchName.equalsIgnoreCase("MECH")
				|| this.branchName.equalsIgnoreCase("Bio-Tech")){
			return true;
		}else{
			this.branchName = "CSE";
			System.out.print("Invalid Branch Name, set to CSE");
			return false;
		}
	}
	
	public boolean validateExamMarks(){
		if(this.qualifyingExamMarks<65 && this.qualifyingExamMarks>100){
			System.out.print("Invalid marks, the range of marks is between 65 and 100");
			return false;
		}else{
			return true;
		}
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the branchName
	 */
	public String getBranchName() {
		return branchName;
	}
	/**
	 * @param branchName the branchName to set
	 */
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	/**
	 * @return the studentType
	 */
	public char getStudentType() {
		return studentType;
	}
	/**
	 * @param studentType the studentType to set
	 */
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the qualifyingExamMarks
	 */
	public float getQualifyingExamMarks() {
		return qualifyingExamMarks;
	}
	/**
	 * @param qualifyingExamMarks the qualifyingExamMarks to set
	 */
	public void setQualifyingExamMarks(float qualifyingExamMarks) {
		this.qualifyingExamMarks = qualifyingExamMarks;
	}
	/**
	 * @return the residentialStatus
	 */
	public char getResidentialStatus() {
		return residentialStatus;
	}
	/**
	 * @param residentialStatus the residentialStatus to set
	 */
	public void setResidentialStatus(char residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
	/**
	 * @return the yearOfEngg
	 */
	public int getYearOfEngg() {
		return yearOfEngg;
	}
	/**
	 * @param yearOfEngg the yearOfEngg to set
	 */
	public void setYearOfEngg(int yearOfEngg) {
		this.yearOfEngg = yearOfEngg;
	}
	
}
