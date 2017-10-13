package com.nivtek.training.whilestatement;

public class DemoWhile {

  public static void main(String[] args) {
    useWhileLoopToPrintProgramArguments(args);
    //useDoWhileLoopToPrintProgramArguments(args);
  }

  private static void useWhileLoopToPrintProgramArguments(String[] args) {
    int i = 0;
    while (i < args.length) {
      if (args[i].endsWith("?") || args[i].endsWith(".")) {
        System.out.println(args[i]);
      } else {
        System.out.print(args[i] + " ");
      }
      i++;
    }
    System.out.println("Now the value of i = " + i);
    System.out.println("the length of array args = " + args.length);
  }

  private static void useDoWhileLoopToPrintProgramArguments(String[] args) {
    int i = 0;
    if (args.length > 0) {
      do {
        if (args[i].endsWith("?") || args[i].endsWith(".")) {
          System.out.println(args[i]);
        } else {
          System.out.print(args[i] + " ");
        }
        i++;
      } while (i < args.length);
    }
    System.out.println("Now the value of i = " + i);
    System.out.println("the length of array args = " + args.length);
  }

}
