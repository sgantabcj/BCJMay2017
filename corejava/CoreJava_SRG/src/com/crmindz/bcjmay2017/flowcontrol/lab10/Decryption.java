package com.crmindz.bcjmay2017.flowcontrol.lab10;

import java.util.Scanner;

public class Decryption {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number to encrypt:");
		String inputStr = sc.next();
		sc.close();
		
		String decryptedStr = getDecryptValue(inputStr);
		System.out.printf("for input %s : encrypted value is: %s",inputStr,decryptedStr);
	}
	public static String getDecryptValue(String input){
		int reversedValue = 0;
		for(int i=0;i<input.length();i++){
			int temp = (Integer.parseInt(Character.toString(input.charAt(i)))%10+10)-7;
			if(temp>9){
				reversedValue = (temp%10)+(reversedValue*10);
			}else{
				reversedValue = temp+(reversedValue*10);
			}
		}
		String decryptedStr = "";
		decryptedStr+=((reversedValue/10)%10) ;
		decryptedStr+= (reversedValue%10) ;
		decryptedStr+= ((reversedValue/1000)%10) ;
		decryptedStr+= ((reversedValue/100)%10);
		return decryptedStr;
	}
}
