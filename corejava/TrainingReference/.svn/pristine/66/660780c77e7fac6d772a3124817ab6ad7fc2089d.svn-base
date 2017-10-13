package com.nivtek.training.operator;

import java.util.Date;

public class DemoOperators {

  public static void main(String[] args) {
    // Arithmetic division and remainder operators
    int quot = 5 / 2;
    System.out.println("5 / 2 assigned to int type results in " + quot);
    int rem = 5 % 2;
    System.out.println("5 % 2 assigned to int type results in " + rem);

    // Explicit Casting for arithmetic division operator
    float fquot = 5 / (float) 2;
    System.out.println("5 / (float) 2 assigned to float type results in " + fquot);
    // Implicit Casting for arithmetic remainder operator
    float fRem = 5 % 2;
    System.out.println("5 % 2 assigned to float type results in " + fRem);

    int a = 1;
    int b = 2;
    // Uncomment line below to see compilation error, JVM cannot do an implicit cast from int to short
    //  short c = a + b; 

    // To fix the above compilation problem, do an explicit cast to short
    short c1 = (short) (a + b);
    System.out.println(c1);
    
    // Post-fix plus plus operator
    int x = 5;
    int y = x++; // y = x; x = x + 1  => first assign & then increment
    System.out.println("y: " + y + ", x: " + x);
    
    // Pre-fix plus plus operator
    int a1 = 5;
    int b1 = ++a1; // a1 = a1 + 1; b1 = a1; => first increment & then assign
    System.out.println("b1: " + b1 + ", a1: " + a1);
    
    // Explanation of concatenation of strings to integers
    /*
      2 + " equals " + 1 + 1
      "2" + " equals " + 1 + 1
      "2 equals " + 1 + 1
      "2 equals " + "1" + 1
      "2 equals 1" + 1
      "2 equals 1" + "1"
      "2 equals 11"
     */
    String test = 1 + 1 + " equals " + 1 + 1;
    System.out.println(test);
    
    test = "1" + 1 + 1 + " equals " + 1 + 1;
    System.out.println(test);

    // Logical && (AND) operator and relational operators >= (greater than or equal to) and == (equal to)
    int xxx = 5, yyy = 6;
    if ((xxx >= 5) && (yyy == 6)) {
      System.out.println("xxx is greater than or equal to 5 and yyy equal to 6");
    }
    
    // Logical || (OR) operator relational operators > (greater than) and < (less than)
    if ((xxx > 6) || (yyy < 7)) {
      System.out.println("xxx is greater than 6 or yyy is less than 7");
    }
    
    // the toString method on the now object
    // is automatically called by the JVM when concatenating a date to a string
    Date now = new Date();
    String msg = "The time is: " + now;
    System.out.println(msg);
    
    // Assignment Operators +=, -=, /=, %=
    int abc = 23;
    abc += 5;
    System.out.println(abc);
    abc -= 3;
    System.out.println(abc);
    abc /= 5;
    System.out.println(abc);
    abc %= 2;
    System.out.println(abc);
    
    // Operator precedence and associativity
    int xx = 5, yy = 3, zz = 2;
    int value = xx + yy * zz;
    System.out.println(value);
    value = (xx + yy) * zz;
    System.out.println(value);
    
    // Ternary operator ?:
    // a ? b : c  => if a is true, use b otherwise use c
    value = 5 > 3 ? 25 : 10; 
    System.out.println(value);
    
    char A = 5 < 3 ? 'Y' : 'Z';
    System.out.println(A);
    
    // Operator instanceof
    Object s = "abc";
    if (s instanceof String) {
      System.out.println("s is an instance of string");
    } else {
      System.out.println("s is NOT an instance of string");
    }
    
    if (s instanceof Date) {
      System.out.println("s is an instance of Date");
    } else {
      System.out.println("s is NOT an instance of Date");
    }
  }
}
