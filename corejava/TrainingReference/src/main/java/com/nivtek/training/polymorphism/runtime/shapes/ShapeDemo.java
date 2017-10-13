package com.nivtek.training.polymorphism.runtime.shapes;

import java.util.Scanner;

/**
 * @author Sujit
 * TODO convert all the Abstract Classes in the Shape class hierarchy to Interfaces.
 *
 */
public class ShapeDemo {

  private final static String USAGE = "Usage: Please enter the shape to draw, enter 1 for circle,"
      + " 2 for rectangle, 3 for square, 4 for line, 5 for curve";

  /**
   * @param args
   * @throws IncorrectInputException
   */
  public static void main(String[] args) {
    System.out.println("Using Polymorphism");
    System.out.println("------------------");
    drawUsingPolymorphism();
    System.out.println();
    System.out.println("Without Polymorphism");
    System.out.println("--------------------");
    drawWithoutPolymorphism();
    System.out.println();
  }

  private static void drawWithoutPolymorphism() {
    Shape myShape = null;
    do {
      myShape = getShape();
      if (myShape != null) {
        if (myShape instanceof Circle) {
          Circle circle = (Circle) myShape;
          circle.draw();
        } else if (myShape instanceof Rectangle) {
          Rectangle rect = (Rectangle) myShape;
          rect.draw();
        } else if (myShape instanceof Square) {
          Square square = (Square) myShape;
          square.draw();
        } else if (myShape instanceof Line) {
          Line line = (Line) myShape;
          line.draw();
        } else if (myShape instanceof Curve) {
          Curve curve = (Curve) myShape;
          curve.draw();
        }
        computeAreaPerimeterOrLengthWithoutPolymorphism(myShape);
      }
    } while (myShape != null);
  }

  private static void drawUsingPolymorphism() {
    Shape myShape = null;
    do {
      myShape = getShape();
      if (myShape != null) {
        myShape.draw();
        computeAreaPerimeterOrLengthUsingPolymorphism(myShape);
      }
    } while (myShape != null);
  }

  public static Shape getShape() {
    Scanner input = new Scanner(System.in);
    System.out.println(USAGE);
    int shapeChoice = input.nextInt();

    Shape myShape = null;
    if (shapeChoice == 1) {
      myShape = new Circle(5);
    } else if (shapeChoice == 2) {
      myShape = new Rectangle(3, 4);
    } else if (shapeChoice == 3) {
      myShape = new Square(5);
    } else if (shapeChoice == 4) {
      myShape = new Line(2, 3, 7, 8);
    } else if (shapeChoice == 5) {
      myShape = new Curve();
    } else {
      System.err.println("Incorrect input! " + USAGE);
      myShape = null;
    }

    return myShape;
    /*
     * BoundedShape boundedShape = null; UnboundedShape unboundedShape = null;
     * if (shapeChoice == 1) { boundedShape = new Circle(5); } else if
     * (shapeChoice == 2) { boundedShape = new Rectangle(3, 4); } else if
     * (shapeChoice == 3) { boundedShape = new Square(5); } else if (shapeChoice ==
     * 4) { unboundedShape = new Line(2, 3, 7, 8); } else if (shapeChoice == 5) {
     * unboundedShape = new Curve(); } else { System.err.println("Incorrect
     * input! " + USAGE); throw new IncorrectInputException("valid input values
     * are 1 to 5, user entered " + shapeChoice); } if (shapeChoice <= 3) {
     * return boundedShape; } else { return unboundedShape; }
     */
  }

  private static void computeAreaPerimeterOrLengthUsingPolymorphism(Shape myShape) {
    if (myShape instanceof BoundedShape) {
      BoundedShape bs = (BoundedShape) myShape;
      System.out.println("Area of bounded shape: " + bs.getArea());
      System.out.println("Perimeter of bounded shape: " + bs.getPerimeter());
    } else if (myShape instanceof UnboundedShape) {
      UnboundedShape ubs = (UnboundedShape) myShape;
      System.out.println("Length of unbounded shape: " + ubs.getLength());
    } else {
      System.out.println("Not a recognized shape!");
    }
  }
  
  private static void computeAreaPerimeterOrLengthWithoutPolymorphism(Shape myShape) {
    if (myShape instanceof BoundedShape) {
      if (myShape instanceof Circle) {
        Circle circle = (Circle) myShape;
        System.out.println("Area of bounded shape: " + circle.getArea());
        System.out.println("Perimeter of bounded shape: " + circle.getPerimeter());
      } else if (myShape instanceof Rectangle) {
        Rectangle rectangle = (Rectangle) myShape;
        System.out.println("Area of bounded shape: " + rectangle.getArea());
        System.out.println("Perimeter of bounded shape: " + rectangle.getPerimeter());
      } else if (myShape instanceof Square) {
        Square square = (Square) myShape;
        System.out.println("Area of bounded shape: " + square.getArea());
        System.out.println("Perimeter of bounded shape: " + square.getPerimeter());
      }
      
    } else if (myShape instanceof UnboundedShape) {
      if (myShape instanceof Line) {
        Line line = (Line) myShape;
        System.out.println("Length of unbounded shape: " + line.getLength());
      } else if (myShape instanceof Curve) {
        Curve curve = (Curve) myShape;
        System.out.println("Length of unbounded shape: " + curve.getLength());
      }
    } else {
      System.out.println("Not a recognized shape!");
    }
  }

}
