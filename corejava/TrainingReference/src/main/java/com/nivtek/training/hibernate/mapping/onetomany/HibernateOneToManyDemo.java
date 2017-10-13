package com.nivtek.training.hibernate.mapping.onetomany;

import java.util.Date;

import org.hibernate.Session;

public class HibernateOneToManyDemo {
  public static void main(String[] args) {
    System.out.println("Hibernate one to many (XML Mapping)");
    Session session = HibernateUtil.getSessionFactory().openSession();

    session.beginTransaction();

    Stock stock = new Stock();
    stock.setStockCode("8987");
    stock.setStockName("FACEBOOK");
    session.save(stock);

    StockDailyRecord aSingleStockDailyRecord = new StockDailyRecord();
    aSingleStockDailyRecord.setPriceOpen(new Float("1.2"));
    aSingleStockDailyRecord.setPriceClose(new Float("1.1"));
    aSingleStockDailyRecord.setPriceChange(new Float("10.0"));
    aSingleStockDailyRecord.setVolume(3000000L);
    aSingleStockDailyRecord.setDate(new Date());

    // Set reference on the many side
    aSingleStockDailyRecord.setStock(stock);
    // Set reference on the one side
    stock.getStockDailyRecords().add(aSingleStockDailyRecord);
    
    // When inverse is false, it is parent's responsibility to
    // save-update child and its relationship. So in this example,
    // to save the child in the database, there will be two SQL queries: 
    // 1) Insert child. 2) Update child with foreign key of parent id.
    // The insert in the child will put a null value for the parent reference(stock_id).
    // The update in the child following the insert will then update the foreign key reference (stock_id).
    // inverse is false => insert in parent, insert in child, update child
    
    // When inverse is true, it is the child's responsibility to
    // save-update itself. The insert in parent followed by single insert in child
    // The child will have the reference to the parent's id.
    // inverse is true => insert in parent followed by single insert in child
    
    session.save(aSingleStockDailyRecord);
    session.update(aSingleStockDailyRecord);
    
    session.getTransaction().commit();
    System.out.println("Done");
  }
}