package com.nivtek.training.arrays;

public class DemoArrays {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // Single Dimensional Array
    int[] singleDimArray = { 7, 2, 5 };
    
    /* Long way of initializing a single dimensional array
    int[] anotherSingleDimArray = new int[5];
    anotherSingleDimArray[0] = 4;
    anotherSingleDimArray[1] = 11;
    anotherSingleDimArray[2] = 3;
    anotherSingleDimArray[3] = 7;
    anotherSingleDimArray[4] = 2;
     */

    // Easier way of initializing a single dimensional array
    int[] anotherSingleDimArray = { 4, 11, 3, 7, 2 };

    System.out.println("Printing One Dim Array");
    System.out.println(singleDimArray[1]);
    System.out.println(singleDimArray[2]);
    System.out.println("last element of array: " + singleDimArray[singleDimArray.length - 1]);
    System.out.println("length of single dim array: " + singleDimArray.length);

    // Two Dimensional Array
    int[][] twoDimArray = { { 1, 2 }, { 3, 4 }, {8, 5}, {6, 7} };
    System.out.println("Printing Two Dim Array");
    System.out.println("ZZZ: " + twoDimArray[2][1]); // should print which number ?

    // Three Dimensional Array
    int[][][] threeDimArray = { { { 1, 2 }, { 3, 4 } }, { { 6, 7 }, { 8, 9 } }, { { 10, 13 }, { 11, 9 } } };
    System.out.println("Printing Three Dim Array");
    System.out.println(threeDimArray[0][1][1]);
    System.out.println(threeDimArray[1][1][0]);
    System.out.println(threeDimArray[1][1][1]);
    System.out.println(threeDimArray[1][0][1]);
    System.out.println(threeDimArray[1][1][0]);
    int[] lastDim = threeDimArray[1][0];
    System.out.println(lastDim[1]);

    Object[] myArray = new Object[2];
    myArray[0] = new Integer(5);
    myArray[1] = new Float(5.6);
    
    int[] oldValues = { 5, 4, 3, 2, 1 }; // A 5-element int array
    int[] newValues = new int[10]; // A 10-element int array
    for (int i = 0; i < newValues.length; i = i + 1) {
      System.out.println("array element at index " + i + " has a value of " + newValues[i]);
    }
    
    System.out.println("After copying array to a new array");
    
    // Copy all elements from values to newValues
    System.arraycopy(oldValues, 0, newValues, 6, 4);
    for (int j = 0; j < newValues.length; j++) {
      System.out.println("array element at index " + j + " has a value of " + newValues[j]);
    }
  }

}
