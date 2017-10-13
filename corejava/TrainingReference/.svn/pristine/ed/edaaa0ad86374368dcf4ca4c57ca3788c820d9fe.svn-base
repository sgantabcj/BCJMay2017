package com.nivtek.training.spring.transactions;

import com.nivtek.training.spring.jdbctemplate.Customer;

public interface TransactionTestService {
  
	/**
	 * @param custId
	 * @return the customer object found, return null if no customer is found
	 */
	public Customer findCustomerById(String custId);
	
	/**
	 * @param newCustomer
	 * Add a customer, this is the happy path, implementation should 
	 * not throw any exceptions.
	 */
	public void addCustomerWithoutAnyException(Customer newCustomer);
	
	/**
	 * @param newCustomer
	 * Add a customer, implementation will throw an exception 
	 * which is an expected exception and the transaction SHOULD commit.
	 * Spring should configure this transaction to commit only when 
	 * the expected exception is thrown.
	 */
	public void addCustomerThatThrowsExpectedException(Customer newCustomer);
	
	/**
	 * @param newCustomer
	 * Add a customer, implementation will throw an exception 
     * which is an unexpected exception and the transaction SHOULD roll back.
     * Spring will automatically roll back when an unexpected exception is thrown.
	 */
	public void addCustomerThatThrowsUnexpectedException(Customer newCustomer);
}
