package com.nivtek.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleJdbc {

  /**
   * @param args
   * @throws SQLException 
   */
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
    try {
      Statement stmt = con.createStatement();
      PreparedStatement pStmt = con.prepareStatement("insert into categories " +
      		"(CategoryName, Description)" +
      		"values (?, ?)");
      pStmt.setString(1, "Junk Food");
      pStmt.setString(2, "Food that makes you fat");
      pStmt.executeUpdate();
      try {
        ResultSet resultSet = stmt.executeQuery("SELECT CategoryID, CategoryName, Description FROM categories");
        try {
          // for all rows
          while (resultSet.next()) {
            // print the columns of the current row (indexed by name)
            System.out.print(resultSet.getString("CategoryID"));
            System.out.print(", ");
            System.out.print(resultSet.getString("CategoryName"));
            System.out.print(", ");
            System.out.print(resultSet.getString("Description"));
            System.out.println();
          }
        } catch (SQLException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        } finally {
          resultSet.close();
        }
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } finally {
        stmt.close();
        pStmt.close();
      }
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      try {
        if (con != null) {
          con.close();
        }
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }

}
