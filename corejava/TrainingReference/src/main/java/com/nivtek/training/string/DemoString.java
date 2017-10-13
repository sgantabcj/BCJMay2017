package com.nivtek.training.string;

public class DemoString {

  /**
   * @param args
   */
  public static void main(String[] args) {
    String s = "abc";
    System.out.println("Printing a string with value: " + s);
    // My instructor said that Strings are immutable,
    // how can you modify them? My instructor doesn't know much.
    s = "XYYYZZYYZYYY";
    System.out.println("Original upper case string: " + s);
    // Not only can I modify it, I can also change it to lower case,
    // Damn my instructor
    System.out.println("String converted to lower case: " + s.toLowerCase());
    System.out.println("Original upper case string is still unchanged, it's value: " + s);
    String stringWithCharacterReplaced = s.replace('Y', 'B');
    System.out.println("Y replaced with B, it's new value: " + stringWithCharacterReplaced);
    String replace3ConsecutiveYsWithASingleB = s.replaceAll("YYY", "B");
    System.out.println("All Ys replaced by B, it's new value: " + replace3ConsecutiveYsWithASingleB);
    String firstCharactersReplaced = s.replaceFirst("Y", "B");
    System.out.println("First occurance of Y replaced by B, it's new value: " + firstCharactersReplaced);
    
    /*  substring, indexOf, equals, trim, split, endsWith */
    String characters2to4Only = s.substring(1, 4);
    System.out.println("extract part of string, from character 2 to 4: " + characters2to4Only);
    
    int indexOfYYY = s.indexOf("YYY");
    System.out.println("Index of YYY is " + indexOfYYY);
    
    int indexOfYYYY = s.indexOf("YYYY");
    System.out.println("Index of YYYY is " + indexOfYYYY);
    
    if ("XYYYZZYYZYYY".equals(s)) {
      System.out.println("XYYYZZYYZYYY is equal to the original string s");
    }
    
    if ("xyyYZZyyzyyy".equalsIgnoreCase(s)) {
      System.out.println("xyyYZZyyzyyy is equal to the original string s");
    }
    
    String stringWithLotsOfWhiteSpaces = "        Hello    how are you?     ";
    System.out.println("Trimmed string: " + stringWithLotsOfWhiteSpaces.trim());
    System.out.println("Trimmed string with multiple " +
    		"white spaces replaced by" +
    		" a single white space: " + 
    		stringWithLotsOfWhiteSpaces.trim().replaceAll("\\s+", " "));
    
    if (s.endsWith("ZYYY")) {
      System.out.println("s does end with the string ZYYY");
    } else {
      System.out.println("s does NOT end with the string ZYYY");
    }
    
    if (s.startsWith("ZYYY")) {
      System.out.println("s does start with the string ZYYY");
    } else {
      System.out.println("s does NOT start with the string ZYYY");
    }
    
    String longString = "Hello, how    are you";
    if (longString.contains("you")) {
      System.out.println("longString contains the string you");
    }
    
    if (longString.matches(".*you")) {
      System.out.println("longString contains the string \"you\"");
    } else {
      System.out.println("longString does NOT contain the string \"you\"");
    }
    
    String[] splitOfLongString = longString.split("\\s");
    for (int i = 0; i < splitOfLongString.length; i++) {
      System.out.println(splitOfLongString[i]);
    }
    
    // this will not work -> int j = "34"; 
    String j = "34" + 5; // 5 will get implicitly converted to a string only within a concatenation context.
    int i = Integer.parseInt("34");
    // System.exit(1);  This will exit the program immediately. Lines following exit will not execute.
    System.out.println(i);
    float f = Float.parseFloat("234.45");
    System.out.println(f);
    boolean b = Boolean.valueOf("true").booleanValue();
    System.out.println(b);
  }
}
