package com.crmindz.bcjmay2017.operators.lab4;

import java.text.DecimalFormat;

public class TemperatureScaleConverter {
	public static void main(String[] args) {
		double initialTempInC = 31f;
		double initialTempInF = 88f;
		
		double convertedTempToC = getC(initialTempInF);
		double convertedTempToF = getF(initialTempInC);
		System.out.println(initialTempInF+" F : "+getFormat(convertedTempToC)+" C");
		System.out.println(initialTempInC+" C : "+getFormat(convertedTempToF)+" F");
	}
	public static double getC(double temp){
		return (temp-32)*5/9;
	}
	public static double getF(double temp){
		return temp*9/5+32;
	}
	public static String getFormat(double num){
		return new DecimalFormat("####.##").format(num);
	}
}
