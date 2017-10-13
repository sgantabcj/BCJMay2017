package com.nivtek.training.assignment;

public class SortTwoNumbers {

  /**
   * @param args
   */
  public static void main(String[] args) {
    /*
     * Plan of action or pseudo code
     * -----------------------------
     * Convert string args[0] to int a
     * Convert string args[1] to int b
     * if a < b {
     *    exchange a and b
     *    int temp = a;
     *    a = b;
     *    b = temp;
     * }
     * 
     * print a and b
     */

    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    System.out.println("Before sorting, a = " + a + ", b = " + b);
    if (a > b) {
      // exchange a and b
      int temp = a;
      a = b;
      b = temp;
    }
    System.out.println("After sorting, a = " + a + ", b = " + b);
  }

}
