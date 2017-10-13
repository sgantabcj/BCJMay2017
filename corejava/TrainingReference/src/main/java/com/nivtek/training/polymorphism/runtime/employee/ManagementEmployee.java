package com.nivtek.training.polymorphism.runtime.employee;

public class ManagementEmployee extends Employee {

  @Override
  public float calculateMonthlyWages(int numberOfHoursWorked) {
    return numberOfHoursWorked * 90;
  }
  
}
