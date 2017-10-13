package com.nivtek.training.returnvalue;

public class DemoReturn2 {

  public static void main(String[] args) {
    if (args.length != 3) {
      System.err.println("Usage: FindNumber <num1> <num2> <num3>");
      return;
    }

    int[] numbers = { 1, 3, 4, 5, 7, 5, 2, 8, 9, 6 };
    int findNumber1 = Integer.parseInt(args[0]);
    int findNumber2 = Integer.parseInt(args[1]);
    int findNumber3 = Integer.parseInt(args[2]);
    System.out.println(find(numbers, findNumber1, findNumber2, findNumber3));
  }

  public static String find(int[] nums, int num1, int num2, int num3) {
    String indexOfNumbers = "";
    for (int i = 0; i < nums.length; i++) {
      if ((nums[i] == num1) || (nums[i] == num2) || (nums[i] == num3)) {
        indexOfNumbers += i + ", ";
      }
    }
    
    /*
    for (int i = 0; i < nums.length; i++) {
      if ((nums[i] == num1)) {
        indexOfNumbers += i + ", ";
      }
    }
    
    for (int i = 0; i < nums.length; i++) {
      if ((nums[i] == num2)) {
        indexOfNumbers += i + ", ";
      }
    }
    
    for (int i = 0; i < nums.length; i++) {
      if ((nums[i] == num3)) {
        indexOfNumbers += i + ", ";
      }
    }
    */
    
    if (indexOfNumbers.equals("")) {
      return "-1";
    } else {
      return indexOfNumbers;
    }
  }
}
