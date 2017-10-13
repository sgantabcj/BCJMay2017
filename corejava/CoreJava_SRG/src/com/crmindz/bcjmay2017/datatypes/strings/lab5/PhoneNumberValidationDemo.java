package com.crmindz.bcjmay2017.datatypes.strings.lab5;

public class PhoneNumberValidationDemo {
	public static void main(String[] args) {
		String phoneNum = "248 986 7555";
		
		boolean validity = validatePhone(phoneNum);
		if(validity){
			System.out.println(phoneNum+" is valid");
		}else{
			System.out.println(phoneNum+" is not valid");
		}
	}
	static boolean validatePhone(String phone){
		if(phone.matches("^[0-9]{3}\\.{1}[0-9]{3}\\.{1}[0-9]{4}$")
				|phone.matches("^[0-9]{3}\\s{1}[0-9]{3}\\s{1}[0-9]{4}$")
				|phone.matches("^[0-9]{3}-{1}[0-9]{3}-{1}[0-9]{4}$")){
			return true;
		}else{
			return false;
		}
	}
}
