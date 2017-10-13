package com.nivtek.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList {

  /**
   * @param args
   */
  public static void main(String[] args) {
    List<String> myToDoList = new ArrayList<String>();
    myToDoList.add("Get Groceries");
    myToDoList.add("Car wash");
    myToDoList.add("Take son to swim lesson");
    
    // foreach construct to iterate over a collection
    for (String eachItemInList : myToDoList) {
      System.out.println(eachItemInList);
    }
    System.out.println();
    
    for (int i = 0; i < myToDoList.size(); ++i) {
      System.out.println(myToDoList.get(i));
    }
    System.out.println();
    
    Iterator<String> myIter = myToDoList.iterator();
    while (myIter.hasNext()) {
      System.out.println(myIter.next());
    }
  }
}
