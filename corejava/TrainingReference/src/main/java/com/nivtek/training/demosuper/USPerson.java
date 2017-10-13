package com.nivtek.training.demosuper;

public class USPerson {
  private String ssn;

  public USPerson(String ssn) {
    this.ssn = ssn;
  }

  @Override
  public String toString() {
    return "ssn: " + ssn;
  }
}
