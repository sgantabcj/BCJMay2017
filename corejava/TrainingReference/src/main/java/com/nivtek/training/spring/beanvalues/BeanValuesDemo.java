package com.nivtek.training.spring.beanvalues;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanValuesDemo {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "BeanValues-SpringContext.xml" });
    
    FileNameGenerator firstFileGen = (FileNameGenerator) context.getBean("firstFileGen");
    System.out.println("Name: " + firstFileGen.getName() + ", type: " + firstFileGen.getType());
    
    FileNameGenerator anotherFirstFileGen = (FileNameGenerator) context.getBean("firstFileGen");
    System.out.println("Name: " + anotherFirstFileGen.getName() + ", type: " + anotherFirstFileGen.getType());
    
    // Will be == if firstFileGen is a singleton bean
    if (firstFileGen == anotherFirstFileGen) {
      System.out.println("Are equal via == b'cos it is a singleton");
    } else {
      System.out.println("Are NOT equal via ==");
    }
    
    FileNameGenerator secondFileGenObject = (FileNameGenerator) context.getBean("secondFileGen");
    System.out.println("Name: " + secondFileGenObject.getName() + ", type: " + secondFileGenObject.getType());
    
    FileNameGenerator yetAnotherSecondFileGenObject = (FileNameGenerator) context.getBean("secondFileGen");
    System.out.println("Name: " + yetAnotherSecondFileGenObject.getName() + ", type: " + yetAnotherSecondFileGenObject.getType());
    
    // Will NOT be == if secondFileGen is a prototype bean
    if (secondFileGenObject == yetAnotherSecondFileGenObject) {
      System.out.println("Are equal via ==");
    } else {
      System.out.println("Are NOT equal via == bcos it is a prototype bean!");
    }
    
    if (firstFileGen.equals(secondFileGenObject)) {
      System.out.println("first and dup are equal via equals");
    }
    
    if (firstFileGen == secondFileGenObject) {
      System.out.println("first and dup are equal via ==");
    } else {
      System.out.println("first and dup are NOT equal via ==");
    }
    
    FileNameGenerator thirdFileGen = (FileNameGenerator) context.getBean("thirdFileGen");
    System.out.println("Name: " + thirdFileGen.getName() + ", type: " + thirdFileGen.getType());
  }
}
