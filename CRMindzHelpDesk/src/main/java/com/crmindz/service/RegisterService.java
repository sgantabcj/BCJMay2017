package com.crmindz.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmindz.dao.RegisterDao;
import com.crmindz.model.User;

/**
 * Acts as service class for the ticket registration functionality.
 * 
 * @author Sravan Ganta
 */
@Service
public class RegisterService {
	@Autowired
	RegisterDao registerDao;
	
	/**
	 * Registers new user.
	 * 
	 * @param user	Object with properties mapped with respective value entered by the user.
	 */
	public void register(User user){
		registerDao.register(user);
	}
	
	
	/**
	 * Fetches the list of states from the database for the registration page.
	 * 
	 * @return	returns the list of states.
	 */
	public  List<Map<String,String>> getStates(){;
    	return registerDao.getStates();
	}
	
	
	/**
	 * Fetches the list of user types from the database for the registration page.
	 * 
	 * @return	returns all the user types.
	 */
	public List<Map<String,Object>> getUserTypes(){
		return registerDao.getUserTypes();
	}
	
	/**
	 * Validates the username by passing it to dao.
	 * 
	 * @param userName	the username entered by the user.
	 * @return			returns true if username is unique, false otherwise.
	 */
	public boolean validateUserName(String userName){
		return registerDao.validateUserName(userName);
	}
}
