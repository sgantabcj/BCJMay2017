package com.nivtek.training.exceptions;

public class DemoCatchExceptionsOfSameBaseType {

  /**
   * @param args
   */
  public static void main(String[] args) {

    // Example to illustrate that the derived
    // class type must be caught first
    try {
      testMethodThatThrowsExceptions(1);
    } catch (ExceptionC e) {
      System.out.println("Caught Exception C in main");
    } catch (ExceptionB e) {
      System.out.println("Caught Exception B in main");
    }

    try {
      testMethodThatThrowsExceptions(2);
    } catch (ExceptionC e) {
      System.out.println("Caught Exception C in main");
    } catch (ExceptionB e) {
      System.out.println("Caught Exception B in main");
    }
    
    try {
      testMethodThatThrowsExceptions(3);
    } catch (ExceptionC e) {
      System.out.println("Caught Exception C in main");
    } catch (ExceptionB e) {
      System.out.println("Caught Exception B in main");
    }

  }

  private static void testMethodThatThrowsExceptions(int i) throws ExceptionB {
    if (i == 1) {
      try {
        callMethodAThrowsExceptionA();
      } catch (ExceptionA e) {
        System.out.println("Caught Exception A in method testMethodThatThrowsExceptions");
      }
    } else if (i==2) {
      callMethodAThrowsExceptionB();
    } else {
      callMethodAThrowsExceptionC();
    }
  }

  private static void callMethodAThrowsExceptionC() throws ExceptionC {
    throw new ExceptionC();
  }

  private static void callMethodAThrowsExceptionB() throws ExceptionB {
    throw new ExceptionB();
  }

  private static void callMethodAThrowsExceptionA() throws ExceptionA {
    throw new ExceptionA();
  }

}
