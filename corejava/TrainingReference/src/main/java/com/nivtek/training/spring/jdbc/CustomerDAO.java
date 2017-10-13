package com.nivtek.training.spring.jdbc;

public interface CustomerDAO {
      public void insert(Customer customer);
      public Customer findByCustomerId(String custId);
}
