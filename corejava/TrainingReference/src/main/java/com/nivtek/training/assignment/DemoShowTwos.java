package com.nivtek.training.assignment;

public class DemoShowTwos {

  /**
   * @param args
   */
  public static String showTwos(int x) {
   /*
    * if 28 is passed, this method will return "2 * 2 * 7"
    * 
    */
    
    // I am using a dummy returnVal so that the method just compiles
    // You need to return the correct value after using the logic below
    String returnVal = "";
    /*
     * create a variable of type string called returnVal
     * while x is even {
     *   if (returnVal is not empty) {
     *      returnVal = "2 * " + returnVal
     *   } else {
     *     returnVal = "2"
     *   }
     *   get the quotient by dividing x by 2
     *   assign the quotient to x 
     *   
     * }
     * returnVal = returnVal + " * " + x
     */
    return returnVal;
 
  }
  public static void main(String[] args) {
    //showTwos(args);
    /*
     * Iterate over all the args using for loop
     * Inside the loop, parse each argument into primitive integer
     * Invoke the shoTwos method using the primitive integer obtained in the previous step
     * Print the output of showTwos onto the console using System.out.println
     * End the loop
     */
    
  }
}