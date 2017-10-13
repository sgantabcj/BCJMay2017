package com.nivtek.training.hibernate.mapping;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
 
public class HibernateHelloWorldDemo 
{
    @SuppressWarnings("unchecked")
    public static void main( String[] args )
    {
        System.out.println("Using Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        
        // Insert a new stock 
        // Remember, HQL has no insert, it has only insert into ... select ...
        Stock stock = new Stock();
        stock.setStockCode("7523");
        stock.setStockName("AA");
        session.save(stock);
        
        // Query
        Query query = session.createQuery("from Stock where stockCode like :mycode");
        query.setParameter("mycode", "7%");
        List<Stock> listOfStockObjects = query.list();
        for (Stock eachStockObject : listOfStockObjects) {
          System.out.println("found : " + eachStockObject);
        }
        
        // Update
        Query updateQuery = session.createQuery("update Stock set stockName = :myStockName" +
                                                " where stockCode = :myStockCode");
        updateQuery.setParameter("myStockName", "FRONTIER AIRLINES");
        updateQuery.setParameter("myStockCode", "7523");
        int resultOfUpdate = updateQuery.executeUpdate();
        session.getTransaction().commit();
        session.close();
        
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        System.out.println("number of rows that got updated: " + resultOfUpdate);
        Query anotherQuery = session.createQuery("from Stock where stockCode like :mycode");
        anotherQuery.setParameter("mycode", "7%");
        List<Stock> listOfUpdatedStockObjects = anotherQuery.list();
        for (Stock eachStockObject : listOfUpdatedStockObjects) {
          System.out.println("found : " + eachStockObject);
        }
        
        // Delete
        Query deleteQuery = session.createQuery("delete Stock where stockCode = :stockCode");
        deleteQuery.setParameter("stockCode", "7523");
        int resultOfDelete = deleteQuery.executeUpdate();
        System.out.println("number of rows that got deleted: " + resultOfDelete);
        session.getTransaction().commit();
        
        Query yetAnotherQuery = session.createQuery("from Stock where stockCode like :mycode");
        yetAnotherQuery.setParameter("mycode", "7%");
        List<Stock> listOfStockObjectsAfterDelete = yetAnotherQuery.list();
        for (Stock eachStockObject : listOfStockObjectsAfterDelete) {
          System.out.println("found : " + eachStockObject);
        }
    }
}