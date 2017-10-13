package com.nivtek.training.interfaces;

public class Circle implements Shape {

  private double radius;
  
  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double computeArea() {
    return (Math.PI * (radius * radius));
  }

  @Override
  public void draw() {
    System.out.println("Circle is drawn!");
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    Shape myShape = new Circle(3.5);
    myShape.draw();
    System.out.println("Area of my circle: " + myShape.computeArea());
    
    myShape = new Square(4.0);
    myShape.draw();
    System.out.println("Area of my square: " + myShape.computeArea());
  }

}
