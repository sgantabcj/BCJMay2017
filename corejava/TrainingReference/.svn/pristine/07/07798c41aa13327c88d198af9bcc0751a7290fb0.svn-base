package com.nivtek.training.threads.introduction;

public class DemoIterateInAThread extends Thread {
  private int max;
  private int min;

  public DemoIterateInAThread(int min, int max) {
    this.min = min;
    this.max = max;
  }

  @Override
  public void run() {
    int counter = min;

    while (counter <= max) {
      System.out.println(Thread.currentThread().getName() + " : " + counter);
      counter++;
    }
  }

  public static void main(String a[]) {
    DemoIterateInAThread t1 = new DemoIterateInAThread(1, 5);
    DemoIterateInAThread t2 = new DemoIterateInAThread(6, 10);
    DemoIterateInAThread t3 = new DemoIterateInAThread(11, 15);
    t1.start();
    t2.start();
    t3.start();
  }
}
