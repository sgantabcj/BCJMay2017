package com.nivtek.training.threads.introduction;

public class DisplayMessage implements Runnable {
  private String message;

  public DisplayMessage(String message) {
    this.message = message;
  }

  public void run() {
    while (true) {
      System.out.println(message);
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
}
