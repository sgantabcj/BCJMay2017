package com.nivtek.training.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DemoMap {

  public static void main(String[] args) {
    // To preserve the order of iteration to be the same as the order of insertion,
    // use a LinkedHashMap instead of just a HashMap
    Map<Object, String> testMap = new HashMap<Object, String>();
    testMap.put(5, "Ben Jude");
    testMap.put(6, "Ben Jude");
    // Yes, Maps can contain null keys
    testMap.put(null, "Sola");
    // Yes, Maps can contain null values as well         
    testMap.put(7, null);
    // Duplicate keys will not throw an exception, 
    // the new key/value entry will replace the older key/value entry.
    testMap.put(5, "Another Ben");

    // Iterate over a Map using the entrySet
    Iterator<Map.Entry<Object, String>> iter = testMap.entrySet().iterator();
    int countOfEntries = 0;
    while(iter.hasNext()) {
      countOfEntries++;
      Map.Entry<Object, String> myEntry = iter.next();
      Integer eachKeyInMap = (Integer) myEntry.getKey();
      if (eachKeyInMap != null) {
        System.out.println("key: " + eachKeyInMap.intValue());
      } else {
        System.out.println("key: null");
      }
      // System.out.println("key: " + myEntry.getKey());
      System.out.println("value: " + myEntry.getValue());
    }
    System.out.println("Number of entries in test map: " + countOfEntries);
    System.out.println();
    System.out.println();
    
    // Iterate over a Map using the keySet
    Iterator<Object> keyIter = testMap.keySet().iterator();
    countOfEntries = 0;
    while(keyIter.hasNext()) {
      countOfEntries++;
      Integer eachKeyInMap = (Integer) keyIter.next();
      if (eachKeyInMap != null) {
        System.out.println("key: " + eachKeyInMap.intValue());
      } else {
        System.out.println("key: null");
      }
      System.out.println("value: " + testMap.get(eachKeyInMap));
    }
    System.out.println("Number of entries in test map: " + countOfEntries);
    System.out.println();
    
    Map<String, String> empToEmployerMap = new HashMap<String, String>();
    empToEmployerMap.put("Parashuram", "Saxon Global");
    empToEmployerMap.put("Afees", "Pioneer");
    empToEmployerMap.put("Sujit", "nivtek");
    empToEmployerMap.put("Chima", "Pioneer");
    empToEmployerMap.put("Afees", "Microsoft");
    
    // Iterate using keySet
    System.out.println("Printing the map entries using a keySet");
    for (String eachEmpName : empToEmployerMap.keySet()) {
      System.out.println(eachEmpName + " works for " + empToEmployerMap.get(eachEmpName));
    }
    System.out.println();
    
    // Iterate using entrySet
    System.out.println("Printing the map entries using an entrySet");
    for (Map.Entry<String, String> eachEmployeeAndCompany : empToEmployerMap.entrySet()) {
      System.out.println(eachEmployeeAndCompany.getKey() + " works for " + eachEmployeeAndCompany.getValue());
    }
    System.out.println();
    
    // Doing the same without Generics
    Map mapWithoutGenerics = new HashMap();
    mapWithoutGenerics.put(5, "Ben Jude");
    mapWithoutGenerics.put(6, "Ben Jude");
    // Yes, Maps can contain null keys
    mapWithoutGenerics.put(null, "Sola");
    // Yes, Maps can contain null values as well         
    mapWithoutGenerics.put(7, null);
    // Duplicate keys will not throw an exception, 
    // the new key/value entry will replace the older key/value entry.
    mapWithoutGenerics.put(5, "Another Ben");
    
    countOfEntries = 0;
    Iterator anotherIter = mapWithoutGenerics.entrySet().iterator();
    while(anotherIter.hasNext()) {
      countOfEntries++;
      Map.Entry myEntry = (Map.Entry) anotherIter.next();
      Integer eachKey = (Integer) myEntry.getKey();
      if (eachKey != null) {
        System.out.println("key: " + eachKey.intValue());
      } else {
        System.out.println("key: null");
      }
      // System.out.println("key: " + myEntry.getKey());
      System.out.println("value: " + myEntry.getValue());
    }
    System.out.println("Number of entries in mapWithoutGenerics: " + countOfEntries);
    System.out.println();
    
    countOfEntries = 0;
    Iterator anotherKeyIter = mapWithoutGenerics.keySet().iterator();
    while(anotherKeyIter.hasNext()) {
      countOfEntries++;
      Integer eachKey = (Integer) anotherKeyIter.next();
      if (eachKey != null) {
        System.out.println("key: " + eachKey.intValue());
      } else {
        System.out.println("key: null");
      }
      // System.out.println("key: " + myEntry.getKey());
      System.out.println("value: " + mapWithoutGenerics.get(eachKey));
    }
    System.out.println("Number of entries in mapWithoutGenerics: " + countOfEntries);
  }

}
