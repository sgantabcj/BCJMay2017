package com.nivtek.training.polymorphism.runtime.shapes;

public final class Square extends BoundedShape {

  public Square(float side) {
    super();
    this.side = side;
  }

  public void draw() {
    System.out.println("Drawing a square ...");
  }

  @Override
  public float getArea() {
    // return (float) Math.pow(side, 2);
    return side * side;
  }

  @Override
  public float getPerimeter() {
    return 4 * side;
  }
  
  private float side;

}
