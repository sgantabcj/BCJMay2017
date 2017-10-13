package com.nivtek.training.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class DemoCallStoredProc {

  public static void main(String[] args) {
    // Line below needs to be uncommented for JDK 1.5
    System.setProperty("jdbc.drivers", "com.mysql.jdbc.Driver");
    String url = "jdbc:mysql://localhost:3306/northwind?user=root&password=welcome";
    
    Connection con = null;
    try {
      con = DriverManager.getConnection(url);
    } catch (SQLException e) {
      e.printStackTrace();
      System.exit(1);
    }
    
    CallableStatement cStmt = null;
    try {
      int supplierId = 8;
      // Call a stored procedure
      cStmt = con.prepareCall("{call countProductsBySupplier(?, ?)}");
      cStmt.setInt(1, supplierId);
      cStmt.registerOutParameter(2, Types.INTEGER);
      cStmt.executeQuery();
      int productCount = cStmt.getInt(2);
      System.out.println("Product count for supplier id: " + supplierId + " = " + productCount);
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if (cStmt != null)
          cStmt.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }

}
