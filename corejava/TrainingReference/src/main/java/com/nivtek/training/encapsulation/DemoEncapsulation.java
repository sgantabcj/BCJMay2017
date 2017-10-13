package com.nivtek.training.encapsulation;

import com.nivtek.training.constructors.Cube;

public class DemoEncapsulation {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Cube mycube = new Cube();
    // You cannot access private attributes. Try uncommenting the line below.
    // mycube.length = 5;
    // However, you can change it via a public mutator
    mycube.setLength(5);
  }

}
