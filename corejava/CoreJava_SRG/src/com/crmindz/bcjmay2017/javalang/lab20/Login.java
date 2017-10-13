package com.crmindz.bcjmay2017.javalang.lab20;

public class Login {
	private static String[] usernames = {"admin","finance","student"};
	private static String[] passwords= {"Admin","Finance","Student"};
	private String username;
	private String password;
	
	public Login(){
		this.username = "student";
		this.password = "Student";
	}
	
	public boolean validateLogin(){
		for(int i=0 ; i<usernames.length ; i++){
			if(usernames[i].equalsIgnoreCase(this.username) && passwords[i].equalsIgnoreCase(this.password)){
				return true;
			}
		}
		return false;
	}
}
