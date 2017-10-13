package com.darknight.bcjmay2017.sravan.lab1;

public class RandomPasswordGenerator {
	public static void main(String[] args) {
		String randomPassword = getRandomPassword();
		System.out.println("new random password: "+randomPassword);
	}
	static String getRandomPassword(){
		String password = "";
		for(int i=0;i<8;i++){
			if(i%2==0){
				password+= (char)(Math.random()*26+97);
			}else{
				password+= (int)(Math.random()*10);
			}
		}
		return password;
	}
}
