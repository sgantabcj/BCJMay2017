package com.nivtek.training.string;

public class B extends A {
  static String str = "B";
  
  void overload() {
    System.out.println("in B");
  }
  
  public static void main(String[] args) {
    System.out.println(B.str);
    B b = new B();
    Long myLong = 21l;
    b.overload();
  }
}
