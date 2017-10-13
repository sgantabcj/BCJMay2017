package com.nivtek.training.forstatement;

public class DemoFor {

  /**
   * @param args
   */
  public static void main(String[] args) {
    for (int i = 0; i < args.length && i < 5; i=i+2) {
      if (args[i].endsWith("?") || args[i].endsWith(".")) {
        System.out.println(args[i]);
      } else {
        System.out.print(args[i] + " ");
      }
    }
    System.out.println("the length of array args = " + args.length);
    
    for (String eachElement : args) {
      if (eachElement.endsWith("?") || eachElement.endsWith(".")) {
        System.out.println(eachElement);
      } else {
        System.out.print(eachElement + " ");
      }
    }
  }
}
