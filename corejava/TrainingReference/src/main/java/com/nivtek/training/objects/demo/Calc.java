package com.nivtek.training.objects.demo;

import java.util.Scanner;

public class Calc {

  public Calc() {
  }

  public Calc(int x, int y, int z) {
    super();
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int getZ() {
    return z;
  }

  public void setZ(int z) {
    this.z = z;
  }

  public void initFromStdIn() {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the first Integer");
    this.x = input.nextInt();
    System.out.println("Please enter the Second Integer");
    this.y = input.nextInt();
    System.out.println("Please enter the Third Integer");
    this.z = input.nextInt();
  }

  public int multiplyThreeNumbers() {
    return x * y * z;
  }
  
  public int addThreeNumbers() {
    return x + y + z;
  }
  
  public static void main(String[] args) {
    System.out.println("This program will calculate the product of three integers.");
    Calc calc = new Calc();
    calc.initFromStdIn();
    System.out.println("The Prduct is :" + calc.multiplyThreeNumbers() + "! Thank You");
    Calc anotherCalc = new Calc(2, 3, 4);
    System.out.println("The Prduct is :" + anotherCalc.multiplyThreeNumbers() + "! Thank You");
  }

  private int x;
  private int y;
  private int z;
}