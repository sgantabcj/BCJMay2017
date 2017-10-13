package com.nivtek.training.demosuper;

public class USAlien extends USPerson {

    public USAlien(String ssn, String alienNumber) {
      super(ssn);
      this.alienNumber = alienNumber;
    }
    
    private String alienNumber;
    
    @Override
    public String toString() {
      return "alien number: " + alienNumber + ", " + super.toString();
    }

    public static void main(String[] args) {
      USAlien sola = new USAlien("123-02-5566", "789-456");
      System.out.println(sola);
    }
}
