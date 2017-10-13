package com.nivtek.training.cast;

public class DemoCasting {

    public static void main(String[] args) {
    // Implicit cast follows the rules below
    // Rule 1) byte to short to int
    // Rule 2) char to int
    // Rule 3) int to long to float to double
    float f = 1;
    
    // The line below is an error b'cos a float cannot get implicit cast to an int
    // int i = 1.3; 
    // To make this work do an explicit cast to an int
    int i = (int) 1.3;
    System.out.println(i);
    
    // A floating point literal is basically a double
    // A double cannot be assigned to a float without an explicit cast
    float ff = (float) 1.3;
    System.out.println(ff);
    
    double d = 1.3;
    System.out.println(d);
    
    long l = 32;
    float fff = l; // long to float allowed as there is no loss of magnitude, though there is a loss of precision.
    
    l = (long) ff; // float to long requires an explicit downcast as there is a loss of magnitude.
    
    // References for floating point arithmetic:
    /*
     * 1) http://floating-point-gui.de/formats/fp
     * 2) http://steve.hollasch.net/cgindex/coding/ieeefloat.html
     */
  }
}
