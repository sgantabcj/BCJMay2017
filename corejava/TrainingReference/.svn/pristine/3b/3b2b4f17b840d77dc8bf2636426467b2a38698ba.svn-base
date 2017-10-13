package com.nivtek.training.continuestatement;

public class DemoContinueWithLabel {

  public static void main(String[] args) {
    int[][] nums = {    
        { 1, 3, 7, 5 }, 
        { 5, 4, 8, 4 }, 
        { 7, 4, 2, 9 } 
   };
    int search = 4;

    foundNumber:
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        if (nums[i][j] == search) {
          System.out.println("FOUND " + search + " at position " + i + "," + j);
          // When it finds the first 4, it continues with the
          // next iteration of the outer loop
          // If the continue is commented out, it will find all the 4s.
          continue foundNumber;
        } else {
          System.out.println("Did not find " + search + " at position " + i + "," + j);
        }
      }
    }
  }
}
