package com.crmindz.bcjmay2017.classes.medium.lab7;

public class Demo {
	public static void main(String[] args) {
		Traveller t = new Traveller();
		t.setTravellerId(1001);
		t.setBaggageAmount(35);
		t.setExpiryYear(2019);
		t.setNocStatus(true);
		
		Checks c = new Checks();
		boolean isBaggageValid = c.checkBaggage(t);
		boolean isImmigrationValid = c.checkImmigration(t);
		boolean isSecurityCleared = c.checkSecurity(t);
		
		if(isBaggageValid && isImmigrationValid && isSecurityCleared){
			System.out.print("Allow traveller to fly");
		}else{
			System.out.print("Detain traveller for Re-checking");
		}
	}
}
