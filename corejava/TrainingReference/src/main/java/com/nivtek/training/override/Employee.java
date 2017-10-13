package com.nivtek.training.override;

public class Employee {

  private String name;
  private String ssn;
  private int baseVacationDays;
  private int extraVacationDays;

  public Employee(String name, String ssn) {
    this.name = name;
    this.ssn = ssn;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSsn() {
    return ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }

  public void print(String header, String footer) {
    printHeader(header);
    printAttributes();
  }

  private void printAttributes() {
    System.out.println("Name: " + name);
    System.out.println("SSN: " + ssn);
    System.out.println("Base Vacation Days: " + baseVacationDays);
    System.out.println("Extra Vacation Days: " + extraVacationDays);
  }

  private void printHeader(String header) {
    if (header != null) {
      System.out.println(header);
      System.out.println("---------------------");
    }
  }

  public void print(String header) {
    // print(header, null);
    printHeader(header);
    printAttributes();
  }

  public int getBaseVacationDays() {
    return baseVacationDays;
  }

  public void setBaseVacationDays(int baseVacationDays) {
    this.baseVacationDays = baseVacationDays;
  }

  public int getExtraVacationDays() {
    return extraVacationDays;
  }

  public void setExtraVacationDays(int extraVacationDays) {
    this.extraVacationDays = extraVacationDays;
  }

}
