package com.nivtek.training.spring.transactions.declarative.xml.proxy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nivtek.training.spring.jdbctemplate.Customer;
import com.nivtek.training.spring.transactions.ExpectedException;
import com.nivtek.training.spring.transactions.TransactionTestService;

/**
 * @author Ross
 */
public class ProxyXmlTransactionDemo {
	private final static Log log = LogFactory.getLog(ProxyXmlTransactionDemo.class);

	public static void main(String[] args) {
		log.info("-- Starting Spring Declarative XML Example --");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml-proxy-test.xml");
		TransactionTestService transactionTestService = (TransactionTestService)ctx.getBean("transactionProxyTestService");
		
		System.out.println();
		System.out.println("Inserting first customer KACHI via happy path ...");
		Customer KACHICustomer = new Customer("KACHI", "Pioneer", "Irving", "Texas");
		transactionTestService.addCustomerWithoutAnyException(KACHICustomer);
		System.out.println("Found customer KACHI: " + transactionTestService.findCustomerById("KACHI"));
		
		System.out.println();
        System.out.println("Inserting 2nd customer INYAN via expected exception path, should COMMIT ...");
		Customer INYANCustomer = new Customer("INYAN", "Pioneer", "Irving", "Texas");
		try {
			transactionTestService.addCustomerThatThrowsExpectedException(INYANCustomer);
		} catch (ExpectedException re) {
			log.info("-- Expected exception: " + re.getMessage());
		}	
		System.out.println("Found customer: " + transactionTestService.findCustomerById("INYAN"));
		
		System.out.println();
        System.out.println("Inserting 3rd customer SILVA via unexpected exception path - SHOULD ROLLBACK ...");
		Customer SILVACustomer = new Customer("SILVA", "Pioneer", "Irving", "Texas");
		try {
			transactionTestService.addCustomerThatThrowsUnexpectedException(SILVACustomer);
		} catch (RuntimeException re) {
			log.info("-- Unexpected exception: " + re.getMessage());
		}
		System.out.println("Found customer: " + transactionTestService.findCustomerById("SILVA"));
	}
}
