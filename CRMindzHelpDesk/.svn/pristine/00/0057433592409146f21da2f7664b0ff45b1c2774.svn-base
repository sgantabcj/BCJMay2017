package com.crmindz.service;

import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.crmindz.dao.LoginDao;
import com.crmindz.model.LoginDetails;

import junit.framework.Assert;

/**
 * @author Sravan Ganta
 * @param <LoginDetails>
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginServiceTest{

	@InjectMocks
	LoginService loginService;
	
	@Mock
	LoginDao loginDao;

	
	@Test
	public void testValidateUser(){
		
		LoginDetails loginDetails = new LoginDetails("sravan","s");
		Map<String,Object> user = new HashMap<String,Object>();
		
		when(loginDao.validateUserLogin(loginDetails)).thenReturn(user);
		
		Assert.assertEquals(loginService.validateUserLogin(loginDetails), user);
	}
}
