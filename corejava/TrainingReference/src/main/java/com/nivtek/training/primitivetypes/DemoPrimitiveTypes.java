package com.nivtek.training.primitivetypes;

public class DemoPrimitiveTypes {

  //instance variables or attributes or fields
  private int i;
  private double j;
  
  // class variables or attributes or fields
  public static double k = 5.5;
  
  public DemoPrimitiveTypes(double j) {
    this.j = j;
  }
  
  /**
   * @param args
   */
  public static void main(String[] args) {
    DemoPrimitiveTypes dpt = new DemoPrimitiveTypes(8.3);
    System.out.println("instance attribute i: " + dpt.i);
    System.out.println("instance attribute j: " + dpt.j);

    dpt.printDemoPrimitiveTypes();
    System.out.println();
    
    System.out.println("class attribute k: " + DemoPrimitiveTypes.k);
    System.out.println();
    
    DemoPrimitiveTypes anotherDpt = new DemoPrimitiveTypes(12.1);
    System.out.println("instance attribute i: " + anotherDpt.i);
    System.out.println("instance attribute j: " + anotherDpt.j);
    
    anotherDpt.printDemoPrimitiveTypes();
    System.out.println();
    
    // local variable is local to this method, accessible only within this method
    // it is accessible only after it is declared.
    int i = 5;
    System.out.println("local variable i: " + i);
    
    // Print min and max values of int
    System.out.println("min value of integer type: " + Integer.MIN_VALUE);
    System.out.println("max value of integer type: " + Integer.MAX_VALUE);
  }
  
  public void printDemoPrimitiveTypes() {
    System.out.println("i: " + this.i + ", j: " + this.j);
  }

}
