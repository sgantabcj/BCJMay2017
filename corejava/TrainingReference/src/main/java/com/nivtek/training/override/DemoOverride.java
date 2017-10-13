package com.nivtek.training.override;

public class DemoOverride {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Manager m1 = new Manager("Bob", "345-11-987", "Manage Cleaning Department");
    m1.setBaseVacationDays(15);
    m1.setExtraVacationDays(10);
    m1.print("Manager Details", "-------- END --------");
    System.out.println();
    m1.print("Manager Details");
  }
}
