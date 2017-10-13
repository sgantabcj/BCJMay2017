package com.crmindz.bcjmay2017.flowcontrol.lab6;

import java.math.BigDecimal;

public class CreditLimit {
	public static void main(String[] args) {
//		long accountNum = 12341234;
		BigDecimal openingBalance = new BigDecimal("0");
		BigDecimal purchases = new BigDecimal("2866");
		BigDecimal payments = new BigDecimal("865");
		BigDecimal creditLimit = new BigDecimal("2000");
		
		if(hasExceeded(openingBalance, purchases, payments, creditLimit)){
			System.out.println("Credit limit exceeded");
		}else{
			System.out.println("Credit limit not exceeded");
		}
	}
	public static boolean hasExceeded(BigDecimal openingBalance, BigDecimal purchases, BigDecimal payments, BigDecimal creditLimit){
		return (openingBalance.add(purchases).subtract(payments).compareTo(creditLimit))>0 ? true:false;
	}
}
