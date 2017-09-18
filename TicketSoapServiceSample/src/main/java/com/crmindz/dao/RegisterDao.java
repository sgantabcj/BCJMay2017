package com.crmindz.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.crmindz.model.User;

/**
 * This class acts as DAO for registration functionality.
 * 
 * @author Sravan Ganta
 */
@Repository
public class RegisterDao {

	@Autowired
	DataSource datasource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	/**
	 * Registers new user based on the ticket data passed.
	 * 
	 * @param user 	User object with properties mapped with 
	 * 				all the parameters values entered by the user.
	 */
	public void register(User user){
		String usersSql = "INSERT INTO users(username, password, firstname, lastname, email, phone, usertype) values(?,?,?,?,?,?,?)";

	    jdbcTemplate.update(usersSql, new Object[] { user.getLogin().getUsername(), user.getLogin().getPassword(), user.getFirstName(),
	        user.getLastName(), user.getEmail(), user.getPhone(), user.getUserType() });
	    
	    
	    String sql = "SELECT userId FROM users where username ='"+user.getLogin().getUsername()+"'";
	    
	    int userId = (int)jdbcTemplate.queryForObject(sql, Integer.class);
	    
	    String addressSql = "INSERT INTO address(userId, addressLine1, addressLine2, city, state, zip) values(?,?,?,?,?,?)";
	    
	    jdbcTemplate.update(addressSql, new Object[] { userId, user.getAddress().getAddressLine1(), user.getAddress().getAddressLine2(), user.getAddress().getCity(),
	        user.getAddress().getState(), user.getAddress().getZip()});
	}
	
	
	/**
	 * Fetches the list of states present in the Database.
	 * 
	 * @return the list of states as maps with key value pairs of state code and names.
	 */
	public List<Map<String,String>> getStates(){
	      String sql = "SELECT * FROM states";
	      
	      List<Map<String,Object>> resultSet = jdbcTemplate.queryForList(sql);
	      List<Map<String,String>> states = new ArrayList<Map<String,String>>();
	      
	      for(Map<String,Object> row:resultSet){
	        Map<String,String> state = new HashMap<String, String>();
	        state.put("code", (String)row.get("stateCode"));
	        state.put("name", (String)row.get("stateName"));
	        states.add(state);
	      }
	      
	      return states;
    }
	
	
	/**
	 * Fetches the list of user types.
	 * 
	 * @return the list of user types.
	 */
	public List<Map<String,Object>> getUserTypes(){
		
		String sql = "SELECT * FROM usertypes";
		List<Map<String,Object>> userTypes = jdbcTemplate.queryForList(sql);
		
		return userTypes;
	}
	
	
	/**
	 * Validates username by querying for the username in the database.
	 * 
	 * @param userName	the username entered by the user.
	 * @return			returns true if username is unique, false otherwise.
	 */
	public boolean validateUserName(String userName){
		
		String sql = "SELECT userId FROM users WHERE username='"+userName+"'";
		List<String> userIds = jdbcTemplate.queryForList(sql,String.class);
		
		if(userIds.isEmpty()){
			return true;
		}
		
		return false;
		
	}
	
}
