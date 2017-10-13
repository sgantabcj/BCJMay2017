package com.nivtek.training.scanner;

import java.util.Scanner;

public class DemoScanner {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter integer values!");
    while (sc.hasNext()) {
      if (sc.hasNextInt()) {
        int i = sc.nextInt();
        System.out.println("Value of integer found: " + i);
      } else {
        String nextInput = sc.next();
        System.out.println("Please enter integer values only");
        if ("stop".equalsIgnoreCase(nextInput)) {
          System.out.println("Quitting ...");
          break;
        }
      }
      
    }
    
  }

}
