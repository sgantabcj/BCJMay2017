package com.nivtek.training.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * This program reads integers passed to it from the command-line
 * or the lines from STDIN, sorts them, and writes the result to STDOUT.
 */
public class DemoSet2 {
  
    public static void main(String[] args) throws IOException {
        Set<Integer> setOfNumbersRead = new TreeSet<Integer>();
        
        // Read the inputs and collect them into a set/list
        collectInputs(args, setOfNumbersRead);
        
        // Print the sorted input using an iterator    
        printSet(setOfNumbersRead);
    }

    private static void collectInputs(String[] args, Set<Integer> setOfNumbersRead) throws IOException {
      if (args.length > 0) {
          for (int i = 0; i < args.length; i++) {
            setOfNumbersRead.add(Integer.parseInt(args[i]));
          }
      } else {
          // Collect the input into a list
          BufferedReader reader = new BufferedReader(new InputStreamReader(
                  System.in));
          String line = null;
          while ((line = reader.readLine()).length() > 0) {
            if ("STOP".equalsIgnoreCase(line)) break;
            try {
              setOfNumbersRead.add(Integer.parseInt(line));
            } catch (NumberFormatException ex) {
              System.out.println("Found a line which is not an integer, line:" + line);
              System.out.println("Ignoring " + line);
            }
          }
      }
    }

    private static void printSet(Set<Integer> setOfNumbersRead) {
      Iterator<Integer> i = setOfNumbersRead.iterator();
      while ( i.hasNext()) {
          System.out.println(i.next());
      }
    }
}