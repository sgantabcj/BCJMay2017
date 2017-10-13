package com.nivtek.training.InstanceVsClass;

public class DemoInstanceVsStatic {

  private int id;
  private String name;
  
  private static String message = "Hello";
  
  public DemoInstanceVsStatic(int id, String name, String message) {
    this.id = id;
    this.name = name;
    this.message = message;
  }
  
  public DemoInstanceVsStatic() {
    this.id = 0;
    this.name = "";
  }
  
  public static DemoInstanceVsStatic createCopy(DemoInstanceVsStatic otherObject) {
    DemoInstanceVsStatic d1 = new DemoInstanceVsStatic();
    d1.id = otherObject.id;
    d1.name = otherObject.name;
    return d1;
  }
  
  public String toString() {
    return "id: " + id + ", name: " + name;
  }

  public static void printHello() {
    // the line below is invalid bcos this can only be used in an instance method
    // System.out.println(this.id);
    
    // Class method can use a class attribute but not an instance attribute
    System.out.println(message);
  }
  
  public String getName() {
    return name;
  }

  public void setName(String myName) {
    name = myName; // this is optional when parameter name is different from attribute name
  }

  public int getId() {
    return id;
  }

  // this is a instance method
  public void setId(int id) {
    this.id = id;
    
    // The line below will not work to set the instance attribute called "id".
    // id = id;
    
    // the this is optional if parameter name(myId) is different from attribute name
    // id = myId;
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    // d1 and d2 are instances or objects of class DemoInstanceVsStatic
    DemoInstanceVsStatic d1 = new DemoInstanceVsStatic();
    DemoInstanceVsStatic d2 = new DemoInstanceVsStatic();
    
    // The following are examples of how you 
    // invoke instance methods using objects/instances.
    d1.setId(1);
    d1.setName("Ben");
    System.out.println(d1.id);
    
    d2.setId(2);
    d2.setName("Olusola");
    
    System.out.println(d1);
    System.out.println(d2);
    
    // Both class attributes and class methods are accessed via the Class Name
    System.out.println(DemoInstanceVsStatic.message);
    
    DemoInstanceVsStatic.printHello(); // invoke a class method with a class name
    d1.printHello(); // Generally, class methods are NOT invoked with an object
    
    DemoInstanceVsStatic d4 = new DemoInstanceVsStatic(4, "Dominion", "I am from Nigeria");
    System.out.println(DemoInstanceVsStatic.message);
    System.out.println(d4.name);
    System.out.println(d4.id);
    System.out.println(d4);
    DemoInstanceVsStatic d5 = new DemoInstanceVsStatic(5, "Sanjana", "I am from India");
    System.out.println(DemoInstanceVsStatic.message);
    System.out.println(d4.message);
    System.out.println(d5.message);
  }

}
