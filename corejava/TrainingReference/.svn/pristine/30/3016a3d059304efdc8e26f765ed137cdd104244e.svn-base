package com.nivtek.training.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class DemoBufferedReader {

  public static void main(String[] args) {
    try {
      File myFile = new File("c:\\temp\\status11.txt");

      // Apply the decorator pattern by wrapping each object
      // into a new object that adds more responsibilities.
      // First read a file as bytes using FileInputStream
      // Convert the bytes to characters by wrapping as an InputStreamReader
      // Buffer the characters as lines using BufferedReader
      BufferedReader in = new BufferedReader(
                                  new InputStreamReader(
                                      new FileInputStream(myFile), "UTF8"));

      String eachLineRead;
      while ((eachLineRead = in.readLine()) != null) {
        System.out.println(eachLineRead);
      }
      in.close();
    } catch (UnsupportedEncodingException e) {
      System.out.println(e.getMessage());
    } catch (IOException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}