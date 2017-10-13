package com.nivtek.training.inheritance;

import com.nivtek.training.inheritance.testpackage.B;

public class DemoInheritanceAndAccessModifiers {

  /**
   * @param args
   */
  public static void main(String[] args) {
    A aObj = new A();
    B bObj = new B();
    C cObj = new C();

    aObj.a = "AAA";
    bObj.a = "B's A";
    bObj.setB("BBB");
    cObj.a = "Who cares";
    cObj.setB("Whatever");
    cObj.c = "CCC";

    aObj.doA();
    bObj.doA();
    bObj.doB();
    cObj.doA();
    cObj.doB();
    cObj.doC();

  }

}
