package com.nivtek.training.hibernate.annotation;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
 
public class HibernateUtil {
 
    private static final SessionFactory sessionFactory = buildSessionFactory();
 
    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            // return new Configuration().configure().buildSessionFactory();
          return new AnnotationConfiguration().configure("hibernate/annotation/hibernate.cfg.xml").buildSessionFactory();
          
          /*
          ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().configure("hibernate.cfg.xml").buildServiceRegistry();
          MetadataSources metadataSources = new MetadataSources(serviceRegistry);
          metadataSources.addResource("Stock.hbm.xml");
          SessionFactory sessionFactory = metadataSources.buildMetadata().buildSessionFactory();
          return sessionFactory;
          */
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
 
    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }
 
}