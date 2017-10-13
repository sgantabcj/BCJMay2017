package com.nivtek.training.polymorphism.runtime.shapes;

public final class Circle extends BoundedShape {
  
  public Circle(int radius) {
    super();
    this.radius = radius;
  }

  public void draw() {
    System.out.println("Drawing a circle ...");
  }

  @Override
  public float getArea() {
    return (PIE * radius * radius);
  }

  @Override
  public float getPerimeter() {
    return (2 * PIE * radius);
  }
  
  private int radius;
  private final float PIE = 22/7;

}
