package com.nivtek.training.classesandobjects;

public class Employee {
    private String name;
    private String ssn;
    private String emailAddress;
    private int yearOfBirth;
    
    public void setName(String name) {
      this.name = name;
    }
    public String getName() {
      return name;
    }
    public void setSsn(String ssn) {
      this.ssn = ssn;
    }
    public String getSsn() {
      return ssn;
    }
    public void setEmailAddress(String emailAddress) {
      this.emailAddress = emailAddress;
    }
    public String getEmailAddress() {
      return emailAddress;
    }
    public void setYearOfBirth(int yearOfBirth) {
      this.yearOfBirth = yearOfBirth;
    }
    public int getYearOfBirth() {
      return yearOfBirth;
    }
    
    public void printEmployee() {
      System.out.println("Name: " + this.name +
          ", ssn: " + this.ssn +
          ", yob: " + this.yearOfBirth +
          ", email: " + this.emailAddress);
    }
    
    public String toString() {
      return ("Name: " + this.name +
          ", ssn: " + this.ssn +
          ", yob: " + this.yearOfBirth +
          ", email: " + this.emailAddress);
    }
    
    public static void printEmployee(Employee emp) {
      System.out.println("Name: " + emp.name +
          ", ssn: " + emp.ssn +
          ", yob: " + emp.yearOfBirth +
          ", email: " + emp.emailAddress);
    }
}
