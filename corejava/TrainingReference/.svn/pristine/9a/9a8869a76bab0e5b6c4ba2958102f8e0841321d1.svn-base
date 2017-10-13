package com.nivtek.training.io.file;

import java.io.File;
import java.io.IOException;

public class DemoFile {

  public static void main(String[] args) {
    if (args.length != 2) {
      showUsage();
      System.exit(1);
    }
    String fileToCreateOrRemove = args[0];
    String command = args[1];

    File filePath = new File(fileToCreateOrRemove);

    if ("create".equalsIgnoreCase(command)) {
      create(filePath);
    } else if ("delete".equalsIgnoreCase(command)) {
      delete(filePath);
    } else {
      showUsage();
      System.exit(1);
    }
  }

  private static void showUsage() {
    System.out.println("Usage: DemoFile <file|directory> <CREATE or DELETE>");
    System.out.println("DemoFile c:\\temp\\foo.txt CREATE");
    System.out.println("DemoFile c:\\temp\\foo.txt DELETE");
  }

  private static void create(File file) {
    if (!file.exists()) {
      try {
        if (!file.createNewFile()) {
          System.out.println("Error: Could not create file: " + file.getAbsolutePath());
        } else {
          System.out.println("Successfully created file: " + file.getAbsolutePath());
        }
         
      } catch (IOException e) {
        System.out.println("Unable to create file: " + file.getAbsolutePath());
      }
    } else {
      // print a message that file already exists
      System.out.println("File: " + file.getPath() + " already exists!");
    }
  }

  private static void delete(File file) {
    if (!file.exists()) {
      System.out.println("No such file or directory: " + file.getAbsolutePath());
    } else if (file.isDirectory() && file.list().length > 0) {
      // Cannot remove a directory containing files
      System.out.println("Directory already contains files: " + file.getAbsolutePath());
      System.out.println("Cannot remove a directory containing files!");
    } else {
      if (!file.delete()) {
        System.out.println("Could not remove: " + file.getAbsolutePath());
      } else {
        System.out.println("Successfully removed file: " + file.getAbsolutePath());
      }
    }
  }
}
