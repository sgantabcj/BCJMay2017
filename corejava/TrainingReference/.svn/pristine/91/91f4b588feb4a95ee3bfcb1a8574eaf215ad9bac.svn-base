package com.nivtek.training.polymorphism.runtime.casting.withinterfaces;

public class C implements B {
  
  public void printB() {
    System.out.println("printing B");
  }

  public void printA() {
    System.out.println("printing A");
  }
  
  public static void main(String[] args) {
    A aInt = new C(); // implicit upcast works with interfaces as well
    aInt.printA();
    // Line below will not work
    // aInt.printB();
    
    B bInt = new C(); // implicit upcast works with interfaces as well
    // bInt can invoke all of B's methods and all of A's methods
    bInt.printA();
    bInt.printB();
    
    // Line below will not work eventhough every B is an A
    // A anotherInt = new B();
    
    // Implicit upcast valid for interfaces
    aInt = bInt;
    
    // Explicit downcast needed for interfaces as well
    bInt = (B) aInt;
  }
}