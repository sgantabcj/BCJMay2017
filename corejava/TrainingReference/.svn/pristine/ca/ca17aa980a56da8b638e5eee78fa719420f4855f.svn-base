package com.nivtek.training.collections.collection_class_utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoSynchronizedCollections {

  /**
   * @param args
   */
  public static void main(String[] args) {
    
    // Wrapper methods of collections : synchronizedXXX and unmodifiableXXX methods
    // ------------------------------
    // myUnsynchronizedMap is NOT thread safe
    Map<String, String> myUnsynchronizedMap = new HashMap<String, String>();
    // mySynchronizedMap is thread safe
    Map<String, String> mySynchronizedMap = Collections.synchronizedMap(myUnsynchronizedMap);
    
    List<A> myList = new ArrayList<A>();
    A a1 = new A("Sujit");
    myList.add(a1);
    myList.add(new A("Shoib"));
    myList.add(new A("Jorge"));
    List<A> immutableList = Collections.unmodifiableList(myList);
    // Uncomment line below to see exception
    // immutableList.add(new A("Gaury"));
    // Elements of an immutable list can still be modified, though the list itself cannot be modified.
    a1.setName("Kumar");
    
    // Creating a dynamically type safe view of a collection
    // -----------------------------------------------------
    Collection sourceCollection = new ArrayList();
    sourceCollection.add("Java");
    sourceCollection.add("is");
    sourceCollection.add("is");
    sourceCollection.add(new A());
    Collection targetCollection;
    targetCollection = Collections.checkedCollection(sourceCollection, String.class);     
    System.out.println("Dynamically typesafe view: "+targetCollection);
    // Uncomment line below to see that you can no longer add any objects other than string
    // targetCollection.add(new B());
    System.out.println();
    
    // Using read-only methods
    // -----------------------
    System.out.println("Frequence of string \"is\": " + Collections.frequency(sourceCollection, "is"));
    List emptyList = Collections.emptyList();
    System.out.println("Size of empty list: " + emptyList.size());
    
    // Modify the collection
    // ---------------------
    List<String> myList2 = new ArrayList<String>();
    myList2.add("Hello");
    myList2.add("how");
    myList2.add("are");
    myList2.add("you");
    System.out.println("Before reversing list ...");
    for (String eachElement: myList2) {
      System.out.print(eachElement + " ");
    }
    System.out.println();
    
    Collections.reverse(myList2);
    System.out.println("After reversing list ...");
    for (String eachElement: myList2) {
      System.out.print(eachElement + " ");
    }
    System.out.println();
    
    System.out.println("After sorting above list in natural order ...");
    Collections.sort(myList2);
    for (String eachElement: myList2) {
      System.out.print(eachElement + " ");
    }
    System.out.println();
  }
}
