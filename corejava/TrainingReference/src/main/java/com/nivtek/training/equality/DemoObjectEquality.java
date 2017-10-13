package com.nivtek.training.equality;

public class DemoObjectEquality {

  /**
   * @param args
   */
  public static void main(String[] args) {
    A a1 = new A(3);
    A a2 = a1;
    System.out.println("Is a2 equal to a1?");
    System.out.println(a2 == a1);
    A a3 = new A(5);
    System.out.println("Is a2 equal to a3?");
    System.out.println(a2 == a3);
    A a5 = a3;
    a3 = a1;
    System.out.println("Is a1 equal to a3?");
    System.out.println(a1 == a3);
    System.out.println("Is a2 equal to a3?");
    System.out.println(a2 == a3);
    
    A a4 = a5;
    a4 = a1;
    a5 = a1;
    
  }

}
