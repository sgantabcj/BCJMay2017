package com.crmindz.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	public static Connection getConnection(){
		Connection connection = null;
		String dbURL = "jdbc:mysql://127.0.0.1:3306/flight_ticket_reservation_db";
		String username = "root";
		String password = "root";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(dbURL,username,password);
			
			if(connection!=null){
				System.out.println("connected to db");
			}else{
				System.out.println("problem connecting to db");
			}
			
			return connection;
		}catch(SQLException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
