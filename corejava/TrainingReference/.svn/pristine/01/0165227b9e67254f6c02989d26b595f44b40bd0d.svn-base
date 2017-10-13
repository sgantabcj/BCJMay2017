package com.nivtek.training.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoCountStrings {

  /**
   * @param args
   */
  public static void main(String[] args) {
    List<String> myFirstList = new ArrayList<String>();
    myFirstList.add("red");
    myFirstList.add("orange");
    myFirstList.add("blue");
    myFirstList.add("red");
    // "red" occurs only twice instead of atleast 3 times
    System.out.println("Should print false here, it is printing " + checkAnwarAtleastThreeOccurances(myFirstList));

    List<String> mySecondList = new ArrayList<String>();
    mySecondList.add("lamp");
    mySecondList.add("chair");
    mySecondList.add("lamp");
    mySecondList.add("lamp");
    mySecondList.add("chair");
    /*mySecondList.add("table");
    mySecondList.add("chair");
    mySecondList.add("table");*/
    // "table" occurs 4 times
    System.out.println("Should print true here, it is printing " + checkAnwarAtleastThreeOccurances(mySecondList));
  }

  private static boolean checkAtleastThreeOccurances(List<String> myList) {
    Map<String, Integer> countMap = new HashMap<String, Integer>();
    for (String eachString : myList) {
      Integer occurances = countMap.get(eachString);
      if (occurances != null) {
        occurances = new Integer(occurances.intValue() + 1);
      } else {
        occurances = new Integer(1);
      }
      countMap.put(eachString, occurances);
    }
    for (Integer eachInteger : countMap.values()) {
      if (eachInteger.intValue() > 2) {
        return true;
      }
    }
    return false;
  }

  public static boolean checkAnwarAtleastThreeOccurances(List<String> listOfStrings) {
    // return false;
    int count = 0;
    boolean found = false;
    List<String> temp = new ArrayList<String>();

    for (int i = 0; i < listOfStrings.size(); i++) {
        temp.add(listOfStrings.get(i));

}

    for (int j = 0; j < listOfStrings.size(); j++) {

        for (int p = 1; p < listOfStrings.size(); p++) {

            if (temp.get(j).equals(listOfStrings.get(p))) {
                count++;

            }
        }
        break;

    }

    if (count >= 3)
        found = true;

    return found;
  }
}
