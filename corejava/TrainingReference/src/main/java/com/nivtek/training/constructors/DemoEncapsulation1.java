package com.nivtek.training.constructors;

public class DemoEncapsulation1 {
  
  public static void main(String[] args) {
    
    Cube mycube = new Cube(10, 4, 5);
    
    // length attribute is protected so you can access it in the same package
    mycube.setLength(7);
    
    // breadth attribute is private, so you cannot access it even in the same package
    // Try uncommenting the line below.
    // mycube.breadth = 2;
  }
}
