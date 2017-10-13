package com.nivtek.training.annotations;

import java.util.Date;

@SuppressWarnings("unused")
public class DemoAnnotations extends MyBaseClass {

  private int j;

  @SuppressWarnings("unused")
  public static void main(String[] args) {
    int i;
    System.out.println("hello");
  }

  @SuppressWarnings("deprecation")
  public void foo() {
    int j = 5;
    System.out.println("value of j: " + j);
    
    Date d = new Date();
    d.getDay();
  }
  
  @Override
  public void testMethod() {
    System.out.println("In derived testMethod");
  }
}
