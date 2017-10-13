package com.nivtek.training.InstanceVsClass;

public class DemoPrivateAttributeAccess {

  /**
   * @param args
   */
  public static void main(String[] args) {
 // d1 and d2 are instances or objects of class DemoInstanceVsStatic
    DemoInstanceVsStatic d1 = new DemoInstanceVsStatic();
    
    // The following are examples of how you 
    // invoke instance methods using objects/instances.
    d1.setId(5);
    d1.setName("Ben");
    // The line below will not compile bcos you cannot access 
    // private attributes outside the class
    // System.out.println(d1.id);
    
    DemoInstanceVsStatic d2 = DemoInstanceVsStatic.createCopy(d1);
    System.out.println(d2);
    
    /* the lines below will not compile bcos you are trying to access private
     * attributes in a different class
    DemoInstanceVsStatic d3 = new DemoInstanceVsStatic();
    d3.id = d1.id;
    d3.name = d1.name;
    */
    
    // You cannot access a private class attribute outside a class
    // System.out.println(DemoInstanceVsStatic.message);
  }

}
