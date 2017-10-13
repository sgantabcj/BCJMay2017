package com.nivtek.training.hibernate.mapping.onetomany.fetch;

import org.hibernate.Session;

public class HibernateSessionGetDemo {
  public static void main(String[] args) {
    System.out.println("Hibernate one to many Fetch (XML Mapping)");
    Session session = HibernateUtil.getSessionFactory().openSession();

    int findStockWithId = 17; // exists in database
    Stock stock = (Stock)session.get(Stock.class, findStockWithId); 
    System.out.println("By this time, hibernate would have issued a select stmt");
    if (stock != null) {
      System.out.println(stock.toString());
    } else {
      System.out.println("stock with id: " + findStockWithId + " NOT FOUND");
    }
    
    findStockWithId = 18; // does not exist in database
    stock = (Stock)session.get(Stock.class, findStockWithId); 
    System.out.println("By this time, hibernate would have issued a select stmt");
    if (stock != null) {
      System.out.println(stock.toString());
    } else {
      System.out.println("stock with id: " + findStockWithId + " NOT FOUND");
    }
  }
}