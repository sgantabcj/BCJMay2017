package com.nivtek.training.interfaces.inheritance;

public class DemoInterfaceInheritance implements InterfaceC {

  /**
   * @param args
   */
  public static void main(String[] args) {
    InterfaceC myC = new DemoInterfaceInheritance();
    myC.testA();
    myC.testB();
    myC.testC();
    
    InterfaceB myB = new DemoInterfaceInheritance();
    myB.testB();
    
    ((InterfaceC) myB).testC();
  }

  public void testC() {
    System.out.println("running testC");
  }

  public void testA() {
    System.out.println("running testA");
  }

  public void testB() {
    System.out.println("running testB");
  }
}
