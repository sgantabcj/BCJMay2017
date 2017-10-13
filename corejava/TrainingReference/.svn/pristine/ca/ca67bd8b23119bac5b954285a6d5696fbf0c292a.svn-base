package com.nivtek.training.system;

import java.util.Date;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

public class DemoSystemClass {

  public static void main(String[] args) {

    int[] srcArray = { 9, 7, 11, 3, 5 };
    int [] destArray = new int[3];
    System.arraycopy(srcArray, 1, destArray, 0, 3);
    for (int eachElem : destArray) {
      System.out.println(eachElem);
    }

    System.out.println();
    System.out.println("Env variable username value: " + System.getenv("username"));
    System.out.println();
    
    Map<String, String> envMap = System.getenv();
    for (String eachKey : envMap.keySet()) {
      System.out.println("key = " + eachKey + ", value = " + envMap.get(eachKey));
    }
    System.out.println();
    System.out.println("-----------------------");
    
    
    Properties allSysProps = System.getProperties();
    for (Object eachKey : allSysProps.keySet()) {
      System.out.println("key = " + eachKey + ", value = " + envMap.get(eachKey));
    }
    
    System.out.println("File separator: " + System.getProperty("file.separator"));
    System.out.println("Line separator: " + System.getProperty("line.separator"));
    System.out.println("Path separator: " + System.getProperty("path.separator"));
    System.out.println("OS Name: " + System.getProperty("os.name"));
    System.out.println("OS Version: " + System.getProperty("os.version"));
    System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
    
    // Access properties passed from the command line
    System.out.println("WHOAMI: " + System.getProperty("WHOAMI"));
    System.out.println("WHEREAMI: " + System.getProperty("WHEREAMI"));
    
    // Explicitly call the garbage collector
    System.gc();
    
    Scanner myScanner = new Scanner(System.in);
    // Read integer input
    System.out.print("Enter an integer input:");
    int intValueReadFromScanner = myScanner.nextInt();
    System.out.println(intValueReadFromScanner);
    
    System.out.println("Printing to standard output which is the console window");
    System.err.println("Printing to standard error which is by default the console window");
    
    Date myCurrentDate = new Date(System.currentTimeMillis());
    System.out.println("Current Date: " + myCurrentDate);
    
    System.out.println("Max memory: " + Runtime.getRuntime().maxMemory());
    System.out.println("Total memory: " + Runtime.getRuntime().totalMemory());
    
    // Non-zero status means abnormal termination, verify on unix using $? and errorlevel on windows
    System.exit(2);
  }
}
