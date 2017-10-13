package com.nivtek.training.classesandobjects.demo;

import com.nivtek.training.classesandobjects.Employee;

public class EmployeeDemo {

  /**
   * @param args
   */
  public static void main(String[] args) {
      Employee e1 = new Employee();
      e1.setName("John");
      e1.setSsn("555-12-345");
      e1.setEmailAddress("john@company.com");

      Employee e2 = new Employee();
      e2.setName("Tom");
      e2.setSsn("456-78-901");
      e2.setYearOfBirth(1974);

      System.out.println("Name: " + e1.getName());
      System.out.println("SSN: " + e1.getSsn());
      System.out.println("Email Address: " + e1.getEmailAddress());
      System.out.println("Year Of Birth: " + e1.getYearOfBirth());

      System.out.println("Name: " + e2.getName());
      System.out.println("SSN: " + e2.getSsn());
      System.out.println("Email Address: " + e2.getEmailAddress());
      System.out.println("Year Of Birth: " + e2.getYearOfBirth());
      System.out.println();
      
      Employee e3 = e1;
      System.out.println("Name of e3: " + e3.getName());
      System.out.println("Name of e1: " + e1.getName());
      
      // If you uncomment the lines below, it will throw a null pointer exception
      // e1 = null;
      // System.out.println("Name of e1: " + e1.getName());
      
      System.out.println("Print John and Tom with instance methods first");
      e3.printEmployee();
      e2.printEmployee();
      System.out.println();
      
      System.out.println("Print John and Tom using the toString instance method");
      System.out.println("e3: " + e3); // call to e3.toString() is implicit
      System.out.println(e2);
      System.out.println();
      
      System.out.println("Print John and Tom with class methods");
      Employee.printEmployee(e3);
      Employee.printEmployee(e2);
      System.out.println();
  }
}