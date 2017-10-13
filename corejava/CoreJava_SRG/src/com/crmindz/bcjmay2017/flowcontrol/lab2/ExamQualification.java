package com.crmindz.bcjmay2017.flowcontrol.lab2;

public class ExamQualification {
	public static void main(String[] args) {
		int scoreOne = 56;
		int scoreTwo = 65;
		int scoreThree = 100;
		if(hasPassed(scoreOne)){
			System.out.println("Passed successfully with "+scoreOne);
		}else{
			System.out.println("Failed "+scoreOne);
		}
		if(hasPassed(scoreTwo)){
			System.out.println("Passed successfully with "+scoreTwo);
		}else{
			System.out.println("Failedwith "+scoreTwo);
		}
		if(hasPassed(scoreThree)){
			System.out.println("Passed successfully with "+scoreThree);
		}else{
			System.out.println("Failed "+scoreThree);
		}
	}
	public static boolean hasPassed(int score){
		if(score>=65 && score<=100){
			return true;
		}else{
			return false;
		}
	}
}
