package com.nivtek.training.spring.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJdbcTemplateDemo {

  /**
   * @param args
   */
  public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "JdbcTemplate-SpringContext.xml" });
      
      CustomerDAO myCustDao = (CustomerDAO) context.getBean("customerDAO");
      
      Customer myCust = myCustDao.findByCustomerId("ALFKI");
      System.out.println("customer found: " + myCust);
      
      Customer sreeCust = new Customer("SREE", "Pioneer Inc.", "Irving", "Texas");
      myCustDao.insert(sreeCust);
      System.out.println("Successfully inserted SREE!");
      
      Customer retrievedCustomer = myCustDao.findByCustomerId("SREE");
      System.out.println("SREE customer found: " + retrievedCustomer);
      
    }
}
