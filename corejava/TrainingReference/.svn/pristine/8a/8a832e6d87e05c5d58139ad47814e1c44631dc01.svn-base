package com.nivtek.training.finalkeyword;

public class DemoFinalDerived extends DemoFinalBase {
// public class DemoFinalDerived {

  private final static int[] constantArrayOfInts;
  private static int[] arrayOfInts;
  
  // static initializer - this will get loaded
  // the first time the JVM loads the class from the .class file
  static {
    constantArrayOfInts = new int[10];
  }
  
  // instance attribute which is a constant 
  // It needs to be initialized before the constructor ends
  private final String name;
  private int id;
  
  public DemoFinalDerived() {
    // initialize the name, cannot change it later
    // SET IN STONE !!
    this.name = "Ben";
    id = 1;
  }

  // Uncomment lines below after extending the non-final class DemoFinalBase
  /*
  @Override
  public final void foo() {
    System.out.println("in derived foo");
  }
  */
  
  /**
   * @param args
   */
  public static void main(String[] args) {
    DemoFinalDerived dc = new DemoFinalDerived();
    
    // Try setting the name, it will fail because it is a constant.
    // Constants cannot be changed after they are initialized.
    // dc.name = "Sola";
    
    // Variable name can be changed after initialization.
    String name = "Kumar";
    name = "Onyekachi";
    
    final String constantName = "Sujit";
    // Try uncommenting the line below, it will fail bcos it is a constant
    // constantName = "Dominion";
    
    // Elements of the array are NOT constants, just the array is final
    constantArrayOfInts[7] = 6;
    
    // You cannot change the constant array to point to another array
    // constantArrayOfInts = new int[5];
    
    // You can change an array of ints which is not constant
    arrayOfInts = new int[10];
    arrayOfInts = new int[5];
    
    final int i = 7;
    // You cannot change the value of a local constant after initializing it
    // i = 8;
    
    DemoFinalDerived dc1 = new DemoFinalDerived();
    final DemoFinalDerived dc2 = dc1;
    DemoFinalDerived dc3 = new DemoFinalDerived();
    // You cannot change the value of a local constant after initializing it.
    // dc2 = dc3;
    
    // You can change the non-constant attribute of a final local object reference
    dc2.id = 10;
    
    // You cannot change the constant attribute of any object
    // dc2.name = "Hello";
    
    showMethodWithConstantParameter(5);
    showMethodWithConstantParameter(8);
  }
  
  private static void showMethodWithConstantParameter(final int j) {
    // You cannot change a final method parameter within the scope of the method
    // j = 10;
    System.out.println("value of the final method parameter cannot change " + j);
  }

}
