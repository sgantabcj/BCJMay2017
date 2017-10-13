package com.nivtek.training.polymorphism.runtime.shapes;

public abstract class BoundedShape extends Shape {

    /**
     * @return calculate & return the area of the bounded shape
     */
    public abstract float getArea();
    
    /**
     * @return calculate & return the perimeter of the bounded shape
     */
    public abstract float getPerimeter();
}
