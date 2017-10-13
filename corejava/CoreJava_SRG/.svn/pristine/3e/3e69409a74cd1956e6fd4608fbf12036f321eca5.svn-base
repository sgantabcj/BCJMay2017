package com.crmindz.bcjmay2017.datatypes.strings.lab3;

public class StringEmailValidationDemo {
	private String email = "Sravan@gmail.combc";
	public static void main(String[] args) {
		String s = new StringEmailValidationDemo().getEmail();
		
		if(3<s.length() && s.length()>20){
			System.out.println("Invalid Length of email Id - should be greater than 3 and less than 20 characters");
		}else if(s.matches("^[A-Z]+([A-Za-z0-9_-])*@[A-Za-z0-9]+(\\.[A-Za-z0-9])*(\\.[A-Za-z0-9]{2,})+$")){
			System.out.println("Email Id is VALID!");
		}else if(s.matches("^.*[^A-Za-z0-9.@-_]+.*$")){
			System.out.println("Invalid combination of username");
		}else if(s.matches("^([^A-Z]{1})(.*)")){
			System.out.println("Invalid Case of First Letter");
		}else if(s.matches("^[A-Z]+[A-Za-z0-9_-]*\\.([A-Za-z0-9])*@([.A-Za-z0-9])*$")){
				System.out.println("Invalid Position of Special Characters");
			}
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
}
