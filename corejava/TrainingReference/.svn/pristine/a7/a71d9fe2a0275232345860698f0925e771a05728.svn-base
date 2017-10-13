package com.nivtek.training.polymorphism.compiletime;

public class DemoOverloading {

 public void print(String s){
  System.out.println("Printing method with one parameter"); 
 }
 
 protected int print(String a, String b){
   System.out.println("Printing method with two parameters, both are strings.");
   return 0;
 }
 
 public final void print(String a, int b){
   System.out.println("Printing method with two parameters, first is a string, second is an int.");
 }
 
 public static void myPrint(String a, String b){
   System.out.println("Static Printing method with two parameters, both are strings.");
 }
 
 public static void myPrint(String a, int b){
   System.out.println("Static Printing method with two parameters, first is a string, second is an int.");
 }
 
 public static void main(String[] args){
   DemoOverloading t1= new DemoOverloading();
   t1.print("hello");
   t1.print("a", "b");
   t1.print("a", 5);
   DemoOverloading.myPrint("a", "b");
   DemoOverloading.myPrint("a", 5);
 }
}
