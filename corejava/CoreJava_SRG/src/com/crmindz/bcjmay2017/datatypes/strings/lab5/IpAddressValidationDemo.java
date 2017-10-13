package com.crmindz.bcjmay2017.datatypes.strings.lab5;

public class IpAddressValidationDemo {
	public static void main(String[] args) {
		String ip = "3.333.123.123";
		if(validateIp(ip)){
			System.out.println(ip+" is valid");
		}else{
			System.out.println(ip+" is not valid");
		}
	}
	static boolean validateIp(String ip){
		if(ip.matches("[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}")){
			return true;
		}else{
			return false;
		}
	}
}
