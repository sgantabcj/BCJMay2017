package com.nivtek.training.threads.introduction;

public class DemoExtendThread extends Thread {

  private String threadName;

  DemoExtendThread(String name) {
    threadName = name;
    System.out.println("Creating " + threadName);
  }

  public void run() {
    System.out.println("Running " + threadName);
    try {
      for (int i = 4; i > 0; i--) {
        System.out.println("Thread: " + threadName + ", " + i);
        // Let the thread sleep for 2 seconds.
        Thread.sleep(2000);
      }
    } catch (InterruptedException e) {
      System.out.println("Thread " + threadName + " interrupted.");
    }
    System.out.println("Thread " + threadName + " exiting.");
  }

  public void start() {
    System.out.println("Starting " + threadName);
    new Thread(this, threadName).start();
  }

  public static void main(String args[]) {
    DemoExtendThread T1 = new DemoExtendThread("Thread-1");
    T1.start();

    DemoExtendThread T2 = new DemoExtendThread("Thread-2");
    T2.start();
  }
}