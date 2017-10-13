package com.nivtek.training.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * This program reads integers passed to it from the command-line
 * or the lines from STDIN, sorts them, and writes the result to STDOUT.
 */
public class TestList {
  
    public static void main(String[] args) throws IOException {
      
   
      
        // Always program to interfaces. Use interface instead of class when
        // declaring the listOfLinesRead
        List<Integer> listOfLinesRead = new LinkedList<Integer>();
        // These 2 lines will also work but you are limiting the 
        // flexibility to change the implementing class.
        // LinkedList<Integer> listOfLinesRead = new LinkedList<Integer>();
        // ArrayList<Integer> listOfLinesRead = new ArrayList<Integer>();
        
        collectInputs(args, listOfLinesRead);
        
        // Now sort the input
        Collections.sort(listOfLinesRead);
        
        // Print the sorted input using an iterator    
        printSortedList(listOfLinesRead);
    }

    private static void collectInputs(String[] args, List<Integer> listOfLinesRead) throws IOException {
      if (args.length > 0) {
          for (int i = 0; i < args.length; i++) {
            int numberRead = Integer.parseInt(args[i]);
            listOfLinesRead.add(numberRead);
          }
      } else {
          // Collect the input into a list
          BufferedReader reader = new BufferedReader(new InputStreamReader(
                  System.in));
          String line = null;
          while ((line = reader.readLine()).length() > 0) {
            if ("STOP".equalsIgnoreCase(line)) break;
            try {
              listOfLinesRead.add(Integer.parseInt(line));
            } catch (NumberFormatException ex) {
              System.out.println("Found a line which is not an integer, line:" + line);
              System.out.println("Ignoring " + line);
            }
          }
      }
    }

    private static void printSortedList(List<Integer> listOfLinesRead) {
      Iterator<Integer> i = listOfLinesRead.iterator();
      while ( i.hasNext()) {
          System.out.println(i.next());
      }
    }
}