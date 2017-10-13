package com.nivtek.training.inheritance;

public class A {
  protected String a = null;
  
  protected void doA() {
      System.out.println("A says " + a);
  }
  
  public void doAnotherA() {
    doA();
  }
}
