package com.nivtek.training.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * This program computes the frequency of words passed to it either as command
 * line arguments or from STDIN. The result is written back to STDOUT.
 *
 * This demonstrates the use of Maps.
 */
public class TestMap {

    public static void main(String[] args) throws IOException {
        // 1) replace with TreeMap to get them sorted by keys
        // 2) replace with LinkedHashMap to maintain the 
        //    order in which they were inserted into the Map
        Map wordMap = new HashMap();
        
        countWordFrequency(args, wordMap);
        printMapEntries(wordMap);
    }

    private static void countWordFrequency(String[] args, Map wordMap) throws IOException {
      if (args.length > 0) {
          for (int i = 0; i < args.length; i++) {
              countWord(wordMap, args[i]);
          }
      } else {
          getWordFrequency(System.in, wordMap);
      }
    }

    private static void printMapEntries(Map wordMap) {
      for (Iterator i = wordMap.entrySet().iterator(); i.hasNext();) {
          Map.Entry entry = (Map.Entry) i.next();
          System.out.println(entry.getKey() + " :\t" + entry.getValue());
      }
    }

    private static void getWordFrequency(InputStream in, Map wordMap)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        int ch = -1;
        StringBuffer word = new StringBuffer();
        while ((ch = reader.read()) != -1) {
            if (Character.isWhitespace(ch)) {
                if (word.length() > 0) {
                    countWord(wordMap, word.toString());
                    word = new StringBuffer();
                }
            } else {
                word.append((char) ch);
            }
            if ("stop".equalsIgnoreCase(word.toString())) break;
        }
        if (word.length() > 0) {
            countWord(wordMap, word.toString());
        }
    }

    private static void countWord(Map wordMap, String word) {
        Integer count = (Integer) wordMap.get(word);
        if (count == null) {
            count = new Integer(1);
        } else {
            count = new Integer(count.intValue() + 1);
        }
        wordMap.put(word, count);
    }
}
