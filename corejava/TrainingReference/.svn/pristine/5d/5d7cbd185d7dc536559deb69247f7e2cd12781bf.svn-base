package com.nivtek.training.threads.synchronization;

public class ThreadUsingSharedData extends Thread {

  private SharedData data;

  public ThreadUsingSharedData(SharedData data) {
    this.data = data;
  }

  public void run() {
    data.accessData();
  }

  public static void main(String[] args) {
    SharedData data = new SharedData();
    
    ThreadUsingSharedData one = new ThreadUsingSharedData(data);
    one.start();
    
    ThreadUsingSharedData two = new ThreadUsingSharedData(data);
    two.start();
    
    // Experiment: guess the output
  }

}
