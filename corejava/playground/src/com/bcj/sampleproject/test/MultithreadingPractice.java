package com.bcj.sampleproject.test;

public class MultithreadingPractice {
	public static void main(String[] args) {
		MultiTest threadOne = new MultiTest();
		threadOne.start();
		
		MultiRunnableTest runnableTest = new MultiRunnableTest();
		Thread threadTwo = new Thread(runnableTest,"Thread two");
		threadTwo.start();
	}
}

class MultiTest extends Thread{
	public void run(){
		System.out.println("Thread is running.");
	}
}

class MultiRunnableTest implements Runnable{
	public void run(){
		System.out.println("Thread inside the class which implemented Runnable is running.");
	}
}