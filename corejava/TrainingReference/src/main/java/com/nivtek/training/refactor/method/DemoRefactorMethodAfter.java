package com.nivtek.training.refactor.method;

public class DemoRefactorMethodAfter {
  
  public static void main(String[] args) {
    
    aboutMyself("Dallas",  "TX");
    aboutMyself("Los Angeles", "CA");
    aboutMyself("Washington DC", "WA");
    
    int i = 5, l = 6;
    System.out.println(add(i, l));
    
    System.out.println(add(3, 9));
  }

  private static int add(int i, int j) {
    return i + j;
  }

  private static void aboutMyself(String city, String state) {
    System.out.println("Hello, My name is Sujit Kumar");
    System.out.println("I live in " + city +"," + state + ".");
    System.out.println("I am a java instructor");
    System.out.println("I work for nivtek");
  }
}
