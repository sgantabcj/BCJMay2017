package com.nivtek.training.polymorphism.runtime.shapes;

public class Line extends UnboundedShape {

  public Line(int x1, int y1, int x2, int y2) {
    this.x1 = x1;
    this.x2 = x2;
    this.y1 = y1;
    this.y2 = y2;
  }

  @Override
  public float getLength() {
    return (float) Math.sqrt((y2-y1)*(y2-y1) + (x2-x1)*(x2-x1));
  }

  @Override
  public void draw() {
    System.out.println("Drawing a line ...");
  }

  private float x1, y1, x2, y2;
}
