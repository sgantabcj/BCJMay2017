package com.nivtek.training.breakstatement;

public class DemoBreakWithLabel {

  public static void main(String[] args) {
    int[][] nums = {    
                        { 1, 3, 7, 5 }, 
                        { 5, 4, 4, 4 }, 
                        { 7, 4, 2, 9 } 
                   };
    int search = 4;

    int countOfFours = 0;
    foundNumber:
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        if (nums[i][j] == search) {
          System.out.println("FOUND " + search + " at position " + i + "," + j);
          // When it finds the first three 4s, it comes out of the outer loop
          // If the break is commented out, it will find all the 4s.
          countOfFours++;
          if (countOfFours == 3) {
            break foundNumber;
          }
        } else {
          System.out.println("Did not find " + search + " at position " + i + "," + j);
        }
      }
    }
    System.out.println("Finished execution!");
  }
}
