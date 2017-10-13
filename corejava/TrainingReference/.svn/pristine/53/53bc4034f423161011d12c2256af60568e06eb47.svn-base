package com.nivtek.training.threads.introduction;

public class HelloWorldRunnable implements Runnable {

  @Override
  public void run() {
    System.out.println("Hey I am runnable thread");
  }

  public static void main(String a[]) {
    HelloWorldRunnable t = new HelloWorldRunnable();
    Thread t2 = new Thread(t);
    t2.start();
  }
  
}
