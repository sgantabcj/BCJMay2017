package com.nivtek.training.spring.jdbc;

import java.sql.*;
import javax.sql.DataSource;

public class JdbcCustomerDAO implements CustomerDAO {

  private DataSource dataSource;

  public void setDataSource(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  public void insert(Customer customer) {

    String sql = "INSERT INTO Customers " + "(CustomerID, CompanyName, City, Region) VALUES (?, ?, ?, ?)";
    Connection conn = null;

    try {
      conn = dataSource.getConnection();
      PreparedStatement ps = conn.prepareStatement(sql);
      ps.setString(1, customer.getCustomerID());
      ps.setString(2, customer.getCompanyName());
      ps.setString(3, customer.getCity());
      ps.setString(4, customer.getRegion());
      ps.executeUpdate();
      ps.close();

    } catch (SQLException e) {
      throw new RuntimeException(e);

    } finally {
      if (conn != null) {
        try {
          conn.close();
        } catch (SQLException e) {
        }
      }
    }
  }

  public Customer findByCustomerId(String custId) {

    String sql = "SELECT * FROM Customers WHERE CustomerID = ?";

    Connection conn = null;

    try {
      conn = dataSource.getConnection();
      PreparedStatement ps = conn.prepareStatement(sql);
      ps.setString(1, custId);
      Customer customer = null;
      ResultSet rs = ps.executeQuery();
      if (rs.next()) {
        customer = new Customer(rs.getString("CustomerID"), rs.getString("CompanyName"), rs.getString("City"), rs
            .getString("Region"));
      }
      rs.close();
      ps.close();
      return customer;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      if (conn != null) {
        try {
          conn.close();
        } catch (SQLException e) {
        }
      }
    }
  }
}
