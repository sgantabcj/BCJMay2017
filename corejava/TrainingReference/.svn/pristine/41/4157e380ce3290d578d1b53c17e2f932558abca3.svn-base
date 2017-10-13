package com.nivtek.training.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Set<String> myColors = new TreeSet<String>();
    myColors.add("Red");
    myColors.add("Yellow");
    myColors.add("Green");
    myColors.add(null);
    myColors.add("Red");
    myColors.add(null);
    
    System.out.println("Printing the set using the enhanced for loop ...");
    for (String eachColor : myColors) {
      System.out.println(eachColor);
    }
    
    System.out.println("Printing the set using an iterator ...");
    Iterator<String> myIter = myColors.iterator();
    while(myIter.hasNext()) {
      System.out.println(myIter.next());
    }
  }
}
