package com.nivtek.training.constructors;

// Experiments to do:
// 1) Put a return type of void before both the constructors and see what happens
// 2) If a class is not public it cannot be imported in a class in another package
//    Try removing the public keyword for the Cube class.
public class Cube {

  // these are instance attributes
    private int length;
    private int breadth;
    private int height;
    
    // class variable
    public static int countOfCubes;
    
    public int getVolume() {
        return (getLength() * breadth * height);
    }
    
    public Cube() {
        setLength(10);
        breadth = 10;
        height = 10;
        countOfCubes++;
    }
    
    public Cube(int length, int b, int h) {
        this.setLength(length); // need to be explicit here b'cos of name clash
        breadth = b; // here breadth is nothing but this.breadth => implicit use of this reference
        height = h;
        countOfCubes++;
    }

    public static void main(String[] args) {
        Cube cubeObj1, cubeObj2;
        System.out.println("number of cubes: " + Cube.countOfCubes);
        
        // Access a class member via the class name
        cubeObj1 = new Cube();
        System.out.println("number of cubes: " + Cube.countOfCubes);
        cubeObj2 = new Cube(10, 20, 30);
        System.out.println("number of cubes: " + Cube.countOfCubes);
        
        System.out.println("Volume of Cube1 is : " + cubeObj1.getVolume());
        System.out.println("Volume of Cube1 is : " + cubeObj2.getVolume());
        
        // Access an instance variable via an object
        System.out.println("cube 1 length is " + cubeObj1.getLength());
        System.out.println("cube 2 length is " + cubeObj2.getLength());
    }

    public void setLength(int length) {
      this.length = length;
    }

    public int getLength() {
      return length;
    }
}