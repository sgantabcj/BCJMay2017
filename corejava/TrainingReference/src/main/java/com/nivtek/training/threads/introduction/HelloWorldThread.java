package com.nivtek.training.threads.introduction;

public class HelloWorldThread extends Thread {

  @Override
  public void run() {
    System.out.println("Hey I am running in a thread");
  }

  public static void main(String a[]) {
    HelloWorldThread t = new HelloWorldThread();
    t.start();
  }
}
