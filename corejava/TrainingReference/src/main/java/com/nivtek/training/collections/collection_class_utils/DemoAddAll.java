package com.nivtek.training.collections.collection_class_utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DemoAddAll {

  /**
   * @param args
   */
  public static void main(String[] args) {
      List<? super B> myList = new ArrayList<B>();
      A a1 = new A();
      B b1 = new B();
      B b2 = new B();
      myList.add(b1);
      myList.add(b2);
      
      B b3 = new B();
      B b4 = new B();
      B b5 = new B();
      Collections.addAll(myList, b3, b4);
      Collections.addAll(myList, b5);
      // myList.add(a1);
  }

}
