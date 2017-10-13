package com.nivtek.training.interfaces;

public class Square implements Shape {

  private double side;
  
  public Square(double side) {
    super();
    this.side = side;
  }

  @Override
  public double computeArea() {
    return side * side;
  }

  @Override
  public void draw() {
    System.out.println("Draw a square!");
  }

}
