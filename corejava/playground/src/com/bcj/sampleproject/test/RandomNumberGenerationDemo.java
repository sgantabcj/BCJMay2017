package com.bcj.sampleproject.test;

import java.util.Random;

public class RandomNumberGenerationDemo {
	public static void main(String[] args) {
		RandomNumberGenerationDemo thisObj = new RandomNumberGenerationDemo();
		int[] randomNumbers = new int[1000];
		for(int i=0;i<1000;i++){
			System.out.println("Random number : "+thisObj.newRandomNumber());
		}
//		System.out.println("Duplicates exist : "+areDuplicatesPresent(randomNumbers));
	}
	
	public int newRandomNumber(){
		
		Random rand = new Random();
		int max = 100000;
		int min = 10000;
		int newRandomNumber = rand.nextInt((max-min)+1)+min;
		
		return newRandomNumber;
	}
	
	public boolean areDuplicatesPresent(int[] randomNumbers){
		
		return true;
	}
}
