package com.nivtek.training.hibernate.mapping.onetomany.fetch;

import java.util.Set;
import org.hibernate.Session;

public class HibernateOneToManyFetchDemo {
  public static void main(String[] args) {
    System.out.println("Hibernate one to many Fetch (XML Mapping)");
    Session session = HibernateUtil.getSessionFactory().openSession();

    Stock stock = (Stock)session.get(Stock.class, 17); 
    // If fetch is using default of select, it will lazy load stock daily records.
    // If fetch is using join, it will eager load stock daily records.
    Set<StockDailyRecord> sets = stock.getStockDailyRecords();
     
    //call select from stock_daily_record
    for(StockDailyRecord eachStockDailyRecord : sets){
          System.out.println("Stock ID: " + eachStockDailyRecord.getStock().getStockId() + ", " +
                             "Stock Daily Record ID: " + eachStockDailyRecord.getRecordId() + ", " +
                             "record date: " + eachStockDailyRecord.getDate());
    }
    System.out.println("Done");
  }
}