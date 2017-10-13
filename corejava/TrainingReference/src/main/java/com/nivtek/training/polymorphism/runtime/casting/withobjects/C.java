package com.nivtek.training.polymorphism.runtime.casting.withobjects;

@SuppressWarnings("all")
public class C extends B {

  public void print() { System.out.println("this is a C "); }
  
    public static void main(String[] args) {
      
         A aObj = new B(); // implicit upcast
         B b = (B) aObj; // explicit downcast
         System.out.println("Success - downcast a to b");
         C c = (C) aObj; // will throw ClassCastException !
         System.out.println("Success - downcast a to c");
         
         A aa = new C();
         B bb = (B) aa;
         System.out.println("Success - downcast aa to bb");
         C cc = (C) aa;
         System.out.println("Success - downcast aa to cc " + cc);
    }
}

