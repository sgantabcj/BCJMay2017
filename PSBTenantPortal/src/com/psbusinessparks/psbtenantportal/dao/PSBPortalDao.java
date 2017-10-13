package com.psbusinessparks.psbtenantportal.dao;

import java.util.List;
import java.util.Map;

import com.psbusinessparks.psbtenantportal.mock.PSBTenantMockData;
import com.psbusinessparks.psbtenantportal.model.Tenant;

public class PSBPortalDao {
	PSBTenantMockData psbMockData = new PSBTenantMockData();
	
	public void saveMockData(Map<String, List<Tenant>> mockDataMap){
		psbMockData.setMockBuildingMap(mockDataMap);
	}
	
	public Map<String, List<Tenant>> fetchMockData(){
		return psbMockData.getMockBuildingMap();
	}
}
