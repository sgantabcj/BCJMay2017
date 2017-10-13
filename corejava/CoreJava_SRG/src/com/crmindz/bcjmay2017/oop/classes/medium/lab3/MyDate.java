package com.crmindz.bcjmay2017.oop.classes.medium.lab3;

public class MyDate {
	private int day;
	private int month;
	
	public MyDate(int month, int day, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void displayDate(){
		System.out.printf("%d/%d/%d",this.getMonth(),this.getDay(),this.getYear());
	}
	
	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}
	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}
	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	private int year;
	
}
