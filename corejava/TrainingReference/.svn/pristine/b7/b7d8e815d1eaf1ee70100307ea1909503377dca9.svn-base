package com.nivtek.training.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJdbcDemo {

  /**
   * @param args
   */
  public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "Jdbc-SpringContext.xml" });
      
      CustomerDAO myCustDao = (CustomerDAO) context.getBean("customerDAO");
      
      Customer myCust = myCustDao.findByCustomerId("ALFKI");
      System.out.println("customer found: " + myCust);
      
      Customer raviCust = new Customer("RAVI", "Pioneer Inc.", "Irving", "Texas");
      myCustDao.insert(raviCust);
      System.out.println("Successfully inserted RAVI!");
      
      Customer retrievedCustomer = myCustDao.findByCustomerId("RAVI");
      System.out.println("Ravi customer found: " + retrievedCustomer);
      
    }
}
