package com.nivtek.training.equivalence;

public class DemoEquivalence {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Person sola = new Person("Olusola", 1985);
    Person impersonator = new Person("Olusola", 1985);
    
    // Checks object equality, checks the object ID which
    // is nothing but the address of the objects
    // Will print false;
    System.out.println(sola == impersonator);
    
    // Will print true bcos sola and impersonator have the 
    // same name and year of birth
    System.out.println(sola.equals(impersonator));
    
    Person anotherImpersonator = new Person("Olusola", 1984);
    // Will print false bcos sola and anotherImpersonator have the 
    // same name but different year of birth
    System.out.println(sola.equals(anotherImpersonator));
    
    Person anotherSola = sola;
    System.out.println(sola == anotherSola);
    System.out.println(anotherSola.equals(sola));
    
    anotherSola = new Person("Olusola", 1985);
    System.out.println(sola == anotherSola);
    System.out.println(anotherSola.equals(sola));
  }

}
