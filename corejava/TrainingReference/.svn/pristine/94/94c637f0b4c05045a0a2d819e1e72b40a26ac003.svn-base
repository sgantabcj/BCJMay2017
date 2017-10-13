package com.nivtek.training.hibernate.mapping.onetoone;

import java.util.Date;

import org.hibernate.Session;
 
public class HibernateOneToOneDemo 
{
    public static void main( String[] args )
    {
      System.out.println("Hibernate one to one (XML mapping)");
      Session session = HibernateUtil.getSessionFactory().openSession();

      session.beginTransaction();

      Stock stock = new Stock();
      stock.setStockCode("4715");
      stock.setStockName("GENM");

      StockDetail stockDetail = new StockDetail();
      stockDetail.setCompName("GENTING Malaysia");
      stockDetail.setCompDesc("Best resort in the world");
      stockDetail.setRemark("Nothing Special");
      stockDetail.setListedDate(new Date());

      // Set references to each other
      stock.setStockDetail(stockDetail);
      stockDetail.setStock(stock);

      session.save(stockDetail); // if cascade on save is true on Stock, it will also save StockDetail
      session.getTransaction().commit();

      System.out.println("Done");
    }
}