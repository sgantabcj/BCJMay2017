package com.nivtek.training.polymorphism.runtime.employee;

@SuppressWarnings("unused")
class EmployeeDemo {
  
  public static void main(String[] args) {

    int numberOfHoursWorked = 160;
    
    Employee e1 = new SecurityEmployee();
    e1.name = "John";
    e1.ssn = "555-12-345";
    e1.emailAddress = "john@company.com";
    System.out.println("Security emp monthly pay: " + e1.calculateMonthlyWages(numberOfHoursWorked));

    Employee e2 = new ManagementEmployee();
    e2.name = "Tom";
    e2.ssn = "456-78-901";
    e2.yearOfBirth = 1974;
    System.out.println("Management emp monthly pay: " + e2.calculateMonthlyWages(numberOfHoursWorked));
    
    Employee e3 = new Employee();
    System.out.println("Default emp monthly pay: " + e3.calculateMonthlyWages(numberOfHoursWorked));
  }
}