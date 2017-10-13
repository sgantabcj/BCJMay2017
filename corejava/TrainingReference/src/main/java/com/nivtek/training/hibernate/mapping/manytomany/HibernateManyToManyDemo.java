package com.nivtek.training.hibernate.mapping.manytomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

public class HibernateManyToManyDemo {
  
  public static void main(String[] args) {
    System.out.println("Hibernate many to many (XML Mapping)");
    Session session = HibernateUtil.getSessionFactory().openSession();

    session.beginTransaction();

    // Set up all the stock categories
    Category category1 = new Category("HIGH TECH", "HIGH TECH COMPANY");
    Category category2 = new Category("RETAIL", "RETAIL COMPANY");
    Category category3 = new Category("NETWORKING", "NETWORKING COMPANY");
    
    // Set up AMAZON stock and it's categories
    Stock amazonStock = new Stock();
    amazonStock.setStockCode("3798");
    amazonStock.setStockName("AMZN");
    
    Set<Category> amazonCategories = new HashSet<Category>();
    amazonCategories.add(category1);
    amazonCategories.add(category2);
    
    amazonStock.setCategories(amazonCategories);
    
    // Set up CISCO stock and it's categories
    Stock ciscoStock = new Stock();
    ciscoStock.setStockCode("4237");
    ciscoStock.setStockName("CISCO");
    
    Set<Category> ciscoCategories = new HashSet<Category>();
    ciscoCategories.add(category1);
    ciscoCategories.add(category3);

    ciscoStock.setCategories(ciscoCategories);

    session.save(amazonStock);
    session.save(ciscoStock);

    session.getTransaction().commit();
    System.out.println("Done");
  }
}