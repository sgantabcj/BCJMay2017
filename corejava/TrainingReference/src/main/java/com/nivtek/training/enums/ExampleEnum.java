package com.nivtek.training.enums;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

public class ExampleEnum {

  public enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST,
    SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
  }

  public enum Colors {
    RED, YELLOW, GREEN
  }

  public static void main(String[] args) {
    System.out.println("Printing all the enum values of Month:");
    for (Month m : Month.values()) {
      System.out.println(m);
    }
    System.out.println();

    System.out.println("Converting a string to an enum");
    Month myMonth = Month.valueOf("JULY");
    System.out.println("The month is a " + myMonth);
    System.out.println();

    System.out.println("Printing months in a range from May to Oct:");
    for (Month m : EnumSet.range(Month.MAY, Month.OCTOBER)) {
      System.out.println(m);
    }
    System.out.println();

    System.out.println("Printing entries from an EnumMap:");
    Map<Colors, String> enumMap = new EnumMap<Colors, String>(Colors.class);
    enumMap.put(Colors.RED, "Color of blood");
    enumMap.put(Colors.GREEN, "Color of Leaves");
    enumMap.put(Colors.YELLOW, "Color of flowers");
    
    Set<Colors> keySet = enumMap.keySet();
    for (Colors color : keySet) {
      String value = enumMap.get(color);
      System.out.println(color + ": " + value);
    }
  }

}
