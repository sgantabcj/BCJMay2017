package com.nivtek.training.hibernate.annotation;

import org.hibernate.Session;
 
public class HibernateHelloWorldDemo 
{
    public static void main( String[] args )
    {
        System.out.println("Using Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
 
        session.beginTransaction();
        Stock stock = new Stock();
 
        stock.setStockCode("5689");
        stock.setStockName("GOOG");
 
        session.save(stock);
        session.getTransaction().commit();
    }
}