package com.bcj.sampleproject.test;

public class MultithreadingSynchronizedMethodDemo extends Thread {

	static String[] msg = { "Beginner", "java", "tutorial,", ".,", "com",
			"is", "the", "best" };
	public MultithreadingSynchronizedMethodDemo(String id) {
		super(id);
	}
	public static void main(String[] args) {
		MultithreadingSynchronizedMethodDemo thread1 = new MultithreadingSynchronizedMethodDemo("thread1: ");
		MultithreadingSynchronizedMethodDemo thread2 = new MultithreadingSynchronizedMethodDemo("thread2: ");
		thread1.start();
		thread2.start();
		boolean t1IsAlive = true;
		boolean t2IsAlive = true;
		do {
			if (t1IsAlive && !thread1.isAlive()) {
				t1IsAlive = false;
				System.out.println("t1 is dead.");
			}
			if (t2IsAlive && !thread2.isAlive()) {
				t2IsAlive = false;
				System.out.println("t2 is dead.");
			}
		} while (t1IsAlive || t2IsAlive);
	}
	void randomWait() {
		try {
			Thread.currentThread().sleep((long) (1000 * Math.random()));
		} catch (InterruptedException e) {
			System.out.println("Interrupted!");
		}
	}
	public synchronized void run() {
		SynchronizedOutput.displayList(getName(), msg);
	}
}

class SynchronizedOutput {

	// if the 'synchronized' keyword is removed, the message
	// is displayed in random fashion
	public static synchronized void displayList(String name, String list[]) {
		for (int i = 0; i < list.length; i++) {
			MultithreadingSynchronizedMethodDemo t = (MultithreadingSynchronizedMethodDemo) Thread
					.currentThread();
			t.randomWait();
			System.out.println(name + list[i]);
		}
	}
}
