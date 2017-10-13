package com.nivtek.training.spring.jdbctemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<Customer>
{
    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
        Customer customer = new Customer();
        customer.setCustomerID(rs.getString("CUSTOMERID"));
        customer.setCompanyName(rs.getString("COMPANYNAME"));
        customer.setCity(rs.getString("CITY"));
        customer.setRegion(rs.getString("REGION"));
        return customer;
    }
}