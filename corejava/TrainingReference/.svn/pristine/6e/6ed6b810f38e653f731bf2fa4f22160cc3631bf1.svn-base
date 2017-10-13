package com.nivtek.training.ellipsis;

public class TestEllipsis {

  public static final int MIN_VALUE = Integer.MIN_VALUE;
  
  /* Another way of initializing static variables.
   * This is called as a static initializer block
  static {
    MIN_VALUE = Integer.MIN_VALUE;
  }
  */
  
  public static int max(int... values) {
    int max = MIN_VALUE;
    for (int eachValue : values) {
        if (eachValue > max) max = eachValue;
    }
    return max;
}
  
  public static int maxUsingArray(int[] values) {
    int max = MIN_VALUE;
    
    // Older way of iterating
    /*
    for (int i = 0; i < values.length; ++i) {
        if (values[i] > max) max = values[i];
    }
    */
    
    /* New way of iterating */
    for (int eachValue : values) {
      if (eachValue > max) max = eachValue;
    }
    return max;
  }
  
  /**
   * @param args
   * Shows that you can invoke max with different number of args
   */
  public static void main(String[] args) {
    System.out.println("Max of numbers: " + max(8, 3 , 12, 9));
    
    // Same thing implemented using an array, more cumbersome
    int [] intArray = {8, 3 , 12, 9};
    System.out.println("Max of numbers: " + maxUsingArray(intArray));
    
    System.out.println("Max of numbers: " + max(8, 3 , 12, 9, 7, 15, 5));
  }

}
