package com.nivtek.training.inheritance.testpackage;

import com.nivtek.training.inheritance.A;

public class B extends A {
  private String b = null;
  
  public void doB() {
      doA();
      System.out.println("B says " + getB());
  }

  public void setB(String b) {
    this.b = b;
  }

  public String getB() {
    return b;
  }
}
