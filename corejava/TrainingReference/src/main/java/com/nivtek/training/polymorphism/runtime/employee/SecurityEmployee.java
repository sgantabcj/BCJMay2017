package com.nivtek.training.polymorphism.runtime.employee;

public class SecurityEmployee extends Employee {

  @Override
  public float calculateMonthlyWages(int numberOfHoursWorked) {
    return numberOfHoursWorked * 45;
  }
  
}
