package com.nivtek.training.junit;

public class ArithmeticOperation {

  public int add(int x, int y) {
    return x + y;
  }
  
  public int divide(int x, int y) {
    if (y == 0) throw new IllegalArgumentException("Cannot divide by 0");
    return x / y;
  }
}
