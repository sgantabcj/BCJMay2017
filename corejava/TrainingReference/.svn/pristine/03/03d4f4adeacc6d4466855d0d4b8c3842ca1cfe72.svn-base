package com.nivtek.training.hibernate.mapping.onetomany.fetch;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;

public class HibernateSessionLoadDemo {
  public static void main(String[] args) {
    System.out.println("Hibernate one to many Fetch (XML Mapping)");
    Session session = HibernateUtil.getSessionFactory().openSession();

    int findStockWithId = 17; // exists in database
    Stock stock = (Stock)session.load(Stock.class, findStockWithId); 
    System.out.println("By this time, hibernate would NOT have issued a select stmt");
    System.out.println(stock.toString());
    System.out.println("By this time, hibernate would have issued a select stmt");
    
    findStockWithId = 18; // does NOT exist in database
    try {
      stock = (Stock)session.load(Stock.class, findStockWithId); 
      System.out.println(stock.toString()); // it will go to the db to retrieve it and throw the ObjectNotFoundException
    } catch (ObjectNotFoundException onfe) {
      System.out.println("exception message: " + onfe.getMessage());
    }
  }
}