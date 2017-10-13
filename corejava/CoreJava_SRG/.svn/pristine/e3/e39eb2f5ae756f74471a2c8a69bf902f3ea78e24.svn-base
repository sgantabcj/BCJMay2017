package com.crmindz.bcjmay2017.datatypes.strings.lab2;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
/*
 * Class to manipulate date object
 */
public class DateManipulationDemo {
	public static void main(String[] args) {
		Date d = new Date();
		
		//converting a date to yyyy/MM/dd format
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
		String formattedDate = simpleDateFormat.format(d);
		System.out.println("Current date: "+ formattedDate);
		
		//Extracting three individual substrings from date
		String[] dateStringArray = formattedDate.split("/");
		System.out.println("Date after splitting into individual substrings: "+Arrays.toString(dateStringArray));
	}
}
