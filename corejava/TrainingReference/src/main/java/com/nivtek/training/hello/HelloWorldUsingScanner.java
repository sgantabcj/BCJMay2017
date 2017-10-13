package com.nivtek.training.hello;

import java.util.Scanner;

public class HelloWorldUsingScanner {

  public static void main(String[] args) {
    // This is a single line comment
    
    Scanner inputCollector = new Scanner(System.in);
    System.out.print("Enter first name:");
    String firstName = inputCollector.next();
    System.out.print("Enter last name:");
    String lastName = inputCollector.next();
    System.out.print("Enter age:");
    int age = inputCollector.nextInt();
    
    /* This type of comment  
     * spans more than 1 line
     */
    System.out.println("Hello! This is your first java program!!");
    System.out.println("How are you doing Mr. " + firstName + " " + lastName + " ?");
    System.out.println("Your age is " + age);

  }

}
