package com.nivtek.training.method.signature;

public class DemoOverloading {

  /**
   * @param args
   */
  public static void main(String[] args) {
    DemoOverloading ds = new DemoOverloading();
    ds.concreteMethod(25);
    ds.concreteMethod(2, (float) 3.0);
    ds.concreteMethod((float) 2.5, 4);
  }
  
  public int concreteMethod(int i) {
    return 1;
  }
  
  public int concreteMethod(int i, float f) {
    return 2;
  }
  
  public int concreteMethod(float i, int f) {
    return 3;
  }
  
  // uncomment lines below to see a duplicate method definition
  /*
  public int concreteMethod(int f, float i) {
    return (float) 2.0;
  }
  */

}
