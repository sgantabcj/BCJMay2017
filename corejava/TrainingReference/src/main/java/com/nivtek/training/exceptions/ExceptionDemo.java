package com.nivtek.training.exceptions;

/**
 * @author Sujit
 * This program shows how exceptions are handled
 */
public class ExceptionDemo {

    public static void main (String[] args) {
       divideInASafeManner(args);
    }

    private static void divideInASafeManner(String[] args) {
        try {
            System.out.println(divideArray(args));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("-------------------------------");
            System.out.println("Program needs 2 integers to do division!");
            System.out.println("-------------------------------");
            showUsage(args);
        } catch (NumberFormatException e) {
            System.out.println("-------------------------------");
            System.out.println("Arguments must be integers!");
            System.out.println("-------------------------------");
            showUsage(args);
        } catch (ArithmeticException e) {
            System.out.println("-------------------------------");
            System.out.println("Cannot divide a number by zero!");
            System.out.println("-------------------------------");
            showUsage(args);
        } finally {
          // this block will ALWAYS GET EXECUTED NO MATTER WHAT
          System.out.println();
          System.out.println("Goodbye!");
        }
    }

    private static void showUsage(String[] args) {
      System.err.println("Usage: java com.training.exceptions.ExceptionDemo <num1> <num2>");
      System.err.println("<num1> should be an integer");
      System.err.println("<num2> should be an integer");
      System.err.println("For example:");
      System.err.println("java com.training.exceptions.ExceptionDemo 6 2");
      System.err.println("You entered:");
      System.err.println("java com.training.exceptions.ExceptionDemo " + 
          args[0] + " and " + args[1]);
    }

    private static float divideArray(String[] array) {
        String s1 = array[0];
        String s2 = array[1];
        return divideStrings(s1, s2);
    }

    private static float divideStrings(String s1, String s2) {
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        return divideInts(i1, i2);
    }

    private static int divideInts(int i1, int i2) {
        return i1 / i2;
    }
}