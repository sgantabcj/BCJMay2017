package com.nivtek.training.spring.collections.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 

public class InjectCollectionsExample2 {
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Collections2-SpringContext.xml");
 
        Customer cust = (Customer)context.getBean("CustomerBean");
        System.out.println(cust);
 
    }
}