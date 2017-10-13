package com.bcj.sampleproject.test;

public class BankAccount {
	public static void main(String[] args) {
		BankAccountCreation b = new BankAccountCreation();
		b.bankAccountCreation(832345,"Ankit",1000);  
		b.displayInfo();  
		b.checkBalance();  
		b.deposit(40000);  
		b.checkBalance();  
		b.withdraw(15000);  
		b.checkBalance();  
	}
}

class BankAccountCreation{
	int acc_no;
	String accHolderName;
	float accBalance;
	public void bankAccountCreation(int n,String name, float b){
		acc_no = n;
		accHolderName = name;
		accBalance = b;
	}
	void displayInfo(){
		System.out.println("Account name: "+accHolderName+"\nAccount number: "+acc_no+"\nAccount balance: "+accBalance);
	}
	void checkBalance(){
		System.out.println("Your account balance is : "+accBalance);
	}
	void deposit(int n){
		accBalance += n;
		System.out.println("Your account balance is : "+accBalance);
	}
	void withdraw(int n){
		if(accBalance<n){
			System.out.println("Sry, your account balance is insuficient");
		}else{
			accBalance -= n;
			System.out.println("Your account balance is : "+accBalance);
		}
	}
}
