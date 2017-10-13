package com.nivtek.training.spring.jdbctemplate;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcTemplateCustomerDAO extends JdbcDaoSupport implements CustomerDAO {
     
    //no need to set datasource here, it will be set in the super class which is JdbcDaoSupport
  
     public void insert(Customer customer) {
       String sql = "INSERT INTO CUSTOMERS " + "(CUSTOMERID, COMPANYNAME, CITY, REGION) VALUES (?, ?, ?, ?)";
       
       getJdbcTemplate().update(sql, new Object[] { 
           customer.getCustomerID(),
           customer.getCompanyName(),
           customer.getCity(),
           customer.getRegion()
       });
  }
     
  public Customer findByCustomerId(String custId) {
    String sql = "SELECT * FROM CUSTOMERS WHERE CUSTOMERID = ?";

    Customer customer = (Customer) getJdbcTemplate().queryForObject(sql, new Object[] { custId },
        new CustomerRowMapper());

    return customer;
  }
}