package com.nivtek.training.spring.collections.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 

public class InjectCollectionsExample1 {
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Collections1-SpringContext.xml");
 
        Customer cust = (Customer)context.getBean("CustomerBean");
        System.out.println(cust);
        
        /*
        Customer cust1 = new Customer();
        List<Object> lists = new ArrayList<Object>();
        Person personBean = new Person();
        personBean.setName("Inyang");
        personBean.setAddress("100 Main Street");
        personBean.setAge(24);
        
        lists.add(new Integer(1));
        lists.add(personBean);
        lists.add(new Person("Sola", "100 Walnult Hill", 28));
        cust1.setLists(lists);
         */
 
    }
}