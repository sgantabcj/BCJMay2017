package com.nivtek.training.spring.transactions.declarative.annotation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nivtek.training.spring.jdbctemplate.Customer;
import com.nivtek.training.spring.transactions.ExpectedException;
import com.nivtek.training.spring.transactions.TransactionTestService;

/** 
 * @author Sujit Kumar
 */
public class AnnotationsTransactionDemo {
  private final static Log log = LogFactory.getLog(AnnotationsTransactionDemo.class);

  public static void main(String[] args) {
      log.info("-- Starting Spring Annotations Driven Transaction Example --");
      ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("annotations-test.xml");
      TransactionTestService transactionTestService = (TransactionTestService)ctx.getBean("transactionTestService");
      
      System.out.println();
      System.out.println("Inserting first customer KACHI via happy path ...");
      Customer sreeCustomer = new Customer("KACHI", "Pioneer", "Irving", "Texas");
      transactionTestService.addCustomerWithoutAnyException(sreeCustomer);
      System.out.println("Found customer KACHI: " + transactionTestService.findCustomerById("KACHI"));
      
      System.out.println();
      System.out.println("Inserting 2nd customer INYAN via expected exception path, should COMMIT ...");
      Customer solaCustomer = new Customer("INYAN", "Pioneer", "Irving", "Texas");
      try {
          transactionTestService.addCustomerThatThrowsExpectedException(solaCustomer);
      } catch (ExpectedException re) {
          log.info("-- Expected exception: " + re.getMessage());
      }   
      System.out.println("Found customer: " + transactionTestService.findCustomerById("INYAN"));
      
      System.out.println();
      System.out.println("Inserting 3rd customer SILVA via unexpected exception path - SHOULD ROLLBACK ...");
      Customer raviCustomer = new Customer("SILVA", "Pioneer", "Irving", "Texas");
      try {
          transactionTestService.addCustomerThatThrowsUnexpectedException(raviCustomer);
      } catch (RuntimeException re) {
          log.info("-- Unexpected exception: " + re.getMessage());
      }
      System.out.println("Found customer: " + transactionTestService.findCustomerById("SILVA"));
  }
}
