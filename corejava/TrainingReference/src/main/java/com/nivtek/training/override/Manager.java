package com.nivtek.training.override;

public class Manager extends Employee {
  private String responsibility;

  public Manager(String name, String ssn, String responsibility) {
      super(name, ssn);
      this.responsibility = responsibility;
  }

  public void setResponsibility(String responsibility) {
      this.responsibility = responsibility;
  }

  public String getResponsibility() {
      return this.responsibility;
  }

  @Override
  public void print(String header, String footer) {
      // First call the base class's print, the base (parent) class is Employee
      super.print(header, null);
      System.out.println("Responsibility: " + responsibility);
      if (footer != null) {
          System.out.println(footer);
      }
  }
  
  // this is an overloaded method, does not print the footer
  @Override
  public void print(String header) {
    // First call the base class's print, the base (parent) class is Employee
    super.print(header);
    System.out.println("Responsibility: " + responsibility);
  }
}