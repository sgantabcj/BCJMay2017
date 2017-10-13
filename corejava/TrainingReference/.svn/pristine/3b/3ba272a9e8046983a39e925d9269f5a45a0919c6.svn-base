package com.nivtek.training.breakstatement;

public class DemoBreak {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.err.println("Usage: DemoBreak <number to search for>");
      return;
    }

    int searchThisNumber = Integer.parseInt(args[0]);
    findIndexOfNumberInArray(searchThisNumber);
  }

  private static void findIndexOfNumberInArray(int search) {
    int[] nums = { 1, 5, 4, 43, -2, 6, 4, 9 };
    boolean found = false;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == search) {
        System.out.println("Found " + search + " at position " + i);
        // break will go out of the enclosing loop and run line 23
        found = true;
        break; 
        // return will just come out of the currently executing method
        // return;
        // System.out.println("This line will never execute for both break & return");
      }
      System.out.println("Found " + nums[i]);
    }
    System.out.println("Break from the previous loop will execute this line!");
    System.out.println("Looking for number: " + search);
    if (found) {
      System.out.println("Found what I was looking for!");
    } else {
      System.out.println("Did NOT find what I was looking for!");
    }
  }
}
