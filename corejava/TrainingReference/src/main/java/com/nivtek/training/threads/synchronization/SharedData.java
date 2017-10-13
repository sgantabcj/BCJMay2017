package com.nivtek.training.threads.synchronization;

public class SharedData {

  private String data = "HAPPY";

  // Experiment: Add and Remove the synchronized keywork in the method signature
  public void accessData() {
    // Experiment: Use synchronized block instead of synchronized method
    // synchronized block is more efficient
    // synchronized(this) {
      for (int i = 0; i < 20; i++) {
        data = data + " " + i + " ";
      }
      System.out.println(data);
    // }
  }
}
