package com.nivtek.training.spring.transactions.declarative.annotation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nivtek.training.spring.jdbctemplate.Customer;
import com.nivtek.training.spring.jdbctemplate.CustomerDAO;
import com.nivtek.training.spring.transactions.ExpectedException;
import com.nivtek.training.spring.transactions.TransactionTestService;
import com.nivtek.training.spring.transactions.UnexpectedException;

/** 
 * @author Ross
 */
@Transactional(propagation=Propagation.REQUIRES_NEW)
public class AnnotationsTransactionTestService implements TransactionTestService {
  private final static Log log = LogFactory.getLog(AnnotationsTransactionTestService.class);

  private CustomerDAO customerDao;

  public void addCustomerWithoutAnyException(Customer newCustomer) {
    customerDao.insert(newCustomer);
  }

  @Transactional(noRollbackFor=ExpectedException.class)
  public void addCustomerThatThrowsExpectedException(Customer newCustomer) {
    customerDao.insert(newCustomer);
    // Simulate an ExpectedException which will usually be thrown by some business logic
    throw new ExpectedException("Should commit even if this is thrown!");
  }

  public void addCustomerThatThrowsUnexpectedException(Customer newCustomer) {
    customerDao.insert(newCustomer);
    // Simulate an UnexpectedException which will usually be thrown by some business logic
    throw new UnexpectedException("Should NOT commit if this is thrown!");
  }

  @Transactional(readOnly = true)
  public Customer findCustomerById(String custId) {
    log.info("Executing business logic for XmlTransactionTestService.findCustomerById");
    Customer foundCustomer = null;
    try {
      foundCustomer = customerDao.findByCustomerId(custId);
    } catch (EmptyResultDataAccessException erDAE) {
      // do nothing
    }
    return foundCustomer;
  }

  public CustomerDAO getCustomerDao() {
    return customerDao;
  }

  public void setCustomerDao(CustomerDAO customerDao) {
    this.customerDao = customerDao;
  }
}
