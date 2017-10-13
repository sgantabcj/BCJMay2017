package com.nivtek.training.collections.generics;

import java.util.*;

import com.nivtek.training.polymorphism.runtime.shapes.*;

public class GenericsWildcardExample1 {

    public static void main( String[] args) {
        // Create a List of Shape objects
        List<Shape> listOfShapes = new ArrayList<Shape>();

        // Adding a Shape is no problem
        listOfShapes.add( new Circle(5) );
        listOfShapes.add( new Rectangle(5,6) );

        // The following line compiles without error
        List<?> objs = listOfShapes;
        // objs.add(new Line(4,4,5,5));
        /*
         * But now we can't make any assumptions about the type of
         * objects in the objs List. In fact, the only thing that
         * we can safely do with them is treat them as Objects.
         * For example, implicitly invoking toString() on them.
         */

        for (Object eachObject : objs) {
            Shape myShape = (Shape) eachObject;
            myShape.draw();
            System.out.println("String representation: " + eachObject);
        }
        
        for (Shape eachShape: listOfShapes) {
          eachShape.draw();
          System.out.println("String representation: " + eachShape);
        }
        
        List<Rectangle> listOfRectangles = new ArrayList<Rectangle>();

        // Adding a Shape is no problem
        listOfRectangles.add( new Rectangle(2,3) );
        listOfRectangles.add( new Rectangle(5,6) );
        // Cannot add a Circle to the listOfRectangles
        // listOfRectangles.add( new Circle(5) );

        // The following line compiles without error
        List<? extends BoundedShape> anotherListOfObjects = listOfRectangles;
        // Cannot add unbounded shapes to this list
        // anotherListOfObjects.add(new Line(2,3,4,5));
        
        /*
         * But now we can't make any assumptions about the type of
         * objects in the objs List. In fact, the only thing that
         * we can safely do with them is treat them as Objects.
         * For example, implicitly invoking toString() on them.
         */

        for (BoundedShape eachShape: anotherListOfObjects) {
            eachShape.draw();
            System.out.println("String representation: " + eachShape);
        }
        
        for (Rectangle eachRectangle: listOfRectangles) {
          eachRectangle.draw();
          System.out.println("String representation: " + eachRectangle);
        }
        
        List<Shape> myShapes = new ArrayList<Shape>();
        myShapes.add(new Square(3));
        myShapes.add(new Line(2,3,4,5));
        List<? super BoundedShape> listOfBoundedShapes =  myShapes;
        listOfBoundedShapes.add(new Square(5));
        // Cannot add an object that is not a bounded shape, uncomment line below to see the error
        // listOfBoundedShapes.add(new Line(2,5,4,8));
        for (Object eachObj : listOfBoundedShapes) {
            Shape eachShape = (Shape) eachObj;
            eachShape.draw();
        }
    }
}
