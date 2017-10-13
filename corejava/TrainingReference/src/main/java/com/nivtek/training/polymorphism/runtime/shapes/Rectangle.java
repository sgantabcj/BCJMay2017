package com.nivtek.training.polymorphism.runtime.shapes;

/**
 * @author Sujit
 * This is a rectangle class.
 */
public final class Rectangle extends BoundedShape {

  /**
   * @param length  the longer side of a rectangle
   * @param width   the shorter side of a rectangle
   */
  public Rectangle(int length, int width) {
    super();
    this.length = length;
    this.width = width;
  }

  @Override
  public void draw() {
    System.out.println("Drawing a rectangle ...");
  }
  
  @Override
  public float getArea() {
    return length * width;
  }

  @Override
  public float getPerimeter() {
    return (2 * (length + width));
  }
  
  private int length, width;
}
