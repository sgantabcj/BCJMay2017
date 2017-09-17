package com.crmindz.service;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.crmindz.dao.RegisterDao;
import com.crmindz.service.RegisterService;

@RunWith(MockitoJUnitRunner.class)
public class RegisterServiceTest {

	@InjectMocks
	RegisterService registerService;
	
	@Mock
	RegisterDao registerDao;
	
	@Test
	public void testGetStates() {
		
		List<Map<String,String>> statesList = new ArrayList<Map<String,String>>();
		Map<String,String> state = new HashMap<String,String>();
		state.put("TX", "Texas");
		statesList.add(state);
		
		if(registerDao !=null){
			when(registerDao.getStates()).thenReturn(statesList);
		}else{
			System.out.println("No dao obj");
		}
		
		Assert.assertEquals(registerService.getStates(), statesList);
	}
	
	@Test
	public void testGetUserTypes() {
		
		List<Map<String,Object>> userTypesList = new ArrayList<Map<String,Object>>();
		Map<String,Object> userType = new HashMap<String,Object>();
		userType.put("1", "Employee");
		userTypesList.add(userType);
		
		if(registerDao !=null){
			when(registerDao.getUserTypes()).thenReturn(userTypesList);
		}else{
			System.out.println("No dao obj");
		}
		
		Assert.assertEquals(registerService.getUserTypes(), userTypesList);
	}

}
