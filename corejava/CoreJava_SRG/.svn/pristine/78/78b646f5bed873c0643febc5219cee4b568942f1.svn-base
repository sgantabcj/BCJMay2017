package com.crmindz.bcjmay2017.flowcontrol.lab10;

import java.util.Scanner;

public class Encryption {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number to encrypt:");
		String inputStr = sc.next();
		sc.close();
		
		int encryptedValue = getEncryptValue(inputStr);
		System.out.printf("for input %s : encrypted value is: %d",inputStr,encryptedValue);
	}
	public static int getEncryptValue(String input){
		int reversedValue = 0;
		for(int i=0;i<input.length();i++){
			reversedValue = ((Integer.parseInt((Character.toString(input.charAt(i))))%10+7)%10)+(reversedValue*10);
		}
		int encryptedValue = 0;
		encryptedValue = (((reversedValue/10)%10)*1000) + ((reversedValue%10)*100) +
				(((reversedValue/1000)%10)*10) + ((reversedValue/100)%10);
		return encryptedValue;
	}
}
