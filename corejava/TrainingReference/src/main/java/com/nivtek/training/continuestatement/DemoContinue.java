package com.nivtek.training.continuestatement;

public class DemoContinue {
  public static void main(String[] args) {
    int[] nums = { 0, 3, 4, 5, 7, 2, 6, 9, 8, 7, 1 };
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] % 2 != 0) {
          // continue will skip the remaining lines in the loop 
          // and continue with the remaining iterations of the loop
            continue;
            // System.out.println("This line will never compile as it is unreachable code");
        }
        System.out.println(nums[i] + " is even");
    }
  }
}
