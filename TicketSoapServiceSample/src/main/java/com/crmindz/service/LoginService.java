package com.crmindz.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmindz.dao.LoginDao;
import com.crmindz.model.LoginDetails;

/**
 * Acts as service class for the login functionality.
 * 
 * @author Sravan Ganta
 */
@Service
public class LoginService {

	@Autowired
	LoginDao loginDao;
	
	/**
	 * Validates the user login for the credentials entered.
	 * 
	 * @param login	object with the user credentials entered by the user.
	 * @return	returns the user details like userId, first name and userType
	 * 			based on the user credentials entered.
	 */
	public Map<String,Object> validateUserLogin(LoginDetails login){
		return loginDao.validateUserLogin(login);
	}
}
