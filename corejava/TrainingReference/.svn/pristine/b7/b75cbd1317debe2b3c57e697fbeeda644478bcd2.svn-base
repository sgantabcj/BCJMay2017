package com.nivtek.training.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sujit
 * For each country code passed on the command line, print the corresponding
 * country name
 */
public class CountryDemoMap {

  public static void main(String[] args) {
    Map<String, String> countryCodeToCountryNameMap = new HashMap<String, String>();
    countryCodeToCountryNameMap.put("USA", "United States of America");
    countryCodeToCountryNameMap.put("GB", "Great Britain");
    countryCodeToCountryNameMap.put("IN", "India");
    countryCodeToCountryNameMap.put("NG", "Nigeria");
    countryCodeToCountryNameMap.put("GER", "Germany");
    countryCodeToCountryNameMap.put("CAN", "Canada");
    
    for (String eachCode : args) {
      String countryName = countryCodeToCountryNameMap.get(eachCode) != null ?
                              countryCodeToCountryNameMap.get(eachCode) : "Country Code NOT found!";
      System.out.println(eachCode + ": " + countryName);
    }
  }

}
