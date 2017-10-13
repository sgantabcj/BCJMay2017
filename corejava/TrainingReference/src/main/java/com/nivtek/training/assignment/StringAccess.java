package com.nivtek.training.assignment;

public class StringAccess {

  /**
   * @param args
   */
  public static void main(String[] args) {
    String myString = args[0];
    
    int lengthOfString = myString.length();
    
    String swappedString = "";
    for (int i = 0; i < lengthOfString; i=i+2) {
      swappedString += myString.charAt(i+1);
      swappedString += myString.charAt(i);
    }
    System.out.println(swappedString);
  }

}
