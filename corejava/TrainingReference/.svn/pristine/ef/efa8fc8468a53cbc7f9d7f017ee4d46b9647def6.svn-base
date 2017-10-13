package com.nivtek.training.threads;

public class DemoRunnable implements Runnable {

  private String threadName;

  DemoRunnable(String name) {
    threadName = name;
    System.out.println("Creating " + threadName);
  }

  public void run() {
    System.out.println("Running " + threadName);
    try {
      for (int i = 4; i > 0; i--) {
        System.out.println("Thread: " + threadName + ", " + i);
        // Let the thread sleep for 5 secs
        Thread.sleep(5000);
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

  public static void main(String[] args) {
    DemoRunnable R1 = new DemoRunnable("Thread-1");
    R1.start();

    DemoRunnable R2 = new DemoRunnable("Thread-2");
    R2.start();
  }

}
