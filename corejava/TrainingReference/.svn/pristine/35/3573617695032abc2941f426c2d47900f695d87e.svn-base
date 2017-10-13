package com.nivtek.training.assignment;

public class DemoDigitRange {

  public int digitRange(String numberPassed) {
    /* for 68349, range is 9 - 3 + 1 = 7 for 324, range is 4 - 2 + 1 = 3
    * 
    *   save the first digit of the number to a variable called min
    *   save the first digit of the number to a variable called max
    * 
    *   iterate over each character of the string
    *   BEGIN INNER LOOP 
    *      convert that character to a number 
    *      if that number is more than max assign it to max
    *      if that number is less than min assign it to min
    *   END INNER LOOP
    * 
    *   create a variable called range 
    *   Assign max - min + 1 to range
    *   Return range
    */ 
    String firstChar = numberPassed.substring(0, 1);

    int min = Integer.parseInt(firstChar);
    int max = min;

    for (int i = 1; i < numberPassed.length(); i++) {
      int digitAtCurrentPosition = Integer.parseInt(numberPassed.substring(i, i + 1));
      if (digitAtCurrentPosition >= max) {
        max = digitAtCurrentPosition;
      }
      if (digitAtCurrentPosition <= min) {
        min = digitAtCurrentPosition;
      }
    } // end of inner loop
    int range = max - min + 1;
    return range;
  }

  public static void main(String[] args) {
    /*
     * For each of the command line arguments, find the range.
     * Begin Outer loop
     *   find the range for each argument inside the loop
     *   print range
     * End Outer loop
     * 
     */
    DemoDigitRange ddr = new DemoDigitRange();
    for (int j = 0; j < args.length; ++j) {
      String numberPassed = args[j];
      int range = ddr.digitRange(numberPassed);
      System.out.println(range);
    } // end of outer loop
  } // end of main method
} // end of class
