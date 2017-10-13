package com.nivtek.training.assignment;

public class DemoUniqueCount {

  public static void main(String[] args) {
    int uniqueCount = 0;
    int current, prev = 0;
    for (int i = 0; i < args.length; ++i) {
      current = Integer.parseInt(args[i]);
      if (i == 0) {
        // initialize prev to a value not equal to current
        prev = current - 1;
      }
      if (current != prev) {
        uniqueCount++;
      }
      // before the loop ends, store current in prev
      prev = current;
    }
    System.out.println("unique count: " + uniqueCount);
  }
}
