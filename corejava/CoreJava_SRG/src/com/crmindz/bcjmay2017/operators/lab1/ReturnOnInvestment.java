package com.crmindz.bcjmay2017.operators.lab1;

import java.math.BigDecimal;
/*
 * class to calculate the value of investment
 */
public class ReturnOnInvestment {
	private static BigDecimal HUNDRED = new BigDecimal("100");

	public static void main(String[] args) {
		BigDecimal investment = new BigDecimal("14000");
		BigDecimal firstYearPercentage = new BigDecimal("40");
		BigDecimal thirdYearLoss = new BigDecimal("1500");
		BigDecimal thirdYearPercentage = new BigDecimal("12");

		BigDecimal firstYearValue = investment.add(getPercentage(firstYearPercentage, investment));
		BigDecimal secondYearValue = firstYearValue.subtract(thirdYearLoss);
		BigDecimal thirdYearValue = secondYearValue.add(getPercentage(secondYearValue, thirdYearPercentage));

		System.out.println("Investment: " + investment.toString() + "\nFirst year value after 40% profit: "
				+ firstYearValue.toString() + "\nSecond year value after $1500 loss: " + secondYearValue.toString()
				+ "\nThird year value after 12% profit: " + thirdYearValue.toString());
	}
/*
 * returns result as BigDecimal accepting arguments value and percentage
 */
	public static BigDecimal getPercentage(BigDecimal percentage, BigDecimal value) {
		BigDecimal result = value.multiply(percentage);
		result = result.divide(HUNDRED, BigDecimal.ROUND_HALF_EVEN);
		return rounded(result);
	}
/*
 * returns a rounded BigDecimal number accepting argument a BigDecimal number
 */
	public static BigDecimal rounded(BigDecimal value) {
		return value.setScale(2, BigDecimal.ROUND_HALF_EVEN);
	}
}
