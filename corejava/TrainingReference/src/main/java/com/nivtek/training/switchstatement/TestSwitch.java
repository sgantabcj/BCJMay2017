package com.nivtek.training.switchstatement;

public class TestSwitch {

  public static void main(String[] args) {
    if (args.length != 1) {
      System.err.println("Usage: TestSwitch <Some Integer>");
      return;
    }
    
    int var = Integer.parseInt(args[0]);
    invokeMethodContainingSwitch(var);
  }

  private static void invokeMethodContainingSwitch(int var) {
    switch (var) {
      case 3:
      case 5: 
      case 7:
        System.out.println("will be printed for 3, 5 and 7");
        break;
      case 9: 
        System.out.println("Will be used for 9!");
        break;
      case 10: case 11: case 12:
        System.out.println("Will be used for 10 to 12");
        break;
      default:
        System.out.println("default case");
    }
  }
}
