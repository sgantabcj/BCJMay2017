package com.nivtek.training.assignment;

public class DemoWordCount {

  public int wordCount(String countWordsInThisString) {
     String[] arrayOfWords = countWordsInThisString.split(":;");
     return arrayOfWords.length;
  }
  
  public String convertToLowerCase(String countWordsInThisString) {
    return countWordsInThisString.toLowerCase();
 }
  
  /**
   * @param args
   */
  public static void main(String[] args) {
    
    DemoWordCount wcObject = new DemoWordCount();
    String myHello = "HELLO";
    System.out.println(wcObject.convertToLowerCase(myHello));
    System.out.println(myHello);
    
    // Should get 1 as the output
    System.out.println(wcObject.wordCount("Hello"));

    // Should get 3 as the output
    System.out.println(wcObject.wordCount("boo:;and:;foo"));
  }
  


}
