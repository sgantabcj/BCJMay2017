package com.psbusinessparks.psbtenantportal.service;

import java.util.List;
import java.util.Map;

import com.psbusinessparks.psbtenantportal.dao.PSBPortalDao;
import com.psbusinessparks.psbtenantportal.model.Building;
import com.psbusinessparks.psbtenantportal.model.Tenant;
/**
 * this class holds 
 * 
 * @author Sravan
 *
 */
public class PSBPortalService {
	PSBPortalDao psbPortalDao = new PSBPortalDao();
	/**
	 * saves the building object passed.
	 * 
	 * @param building - the object to be saved.
	 */
	public void saveBuilding(Building building){
		Map<String, List<Tenant>> mockDataMap = psbPortalDao.fetchMockData();
		String key = building.getBuildingName();
		if(mockDataMap.containsKey(key)){
			for(Tenant tenant: building.getTenantList()){
				mockDataMap.get(key).add(tenant);
			}
		}else{
			mockDataMap.put(building.getBuildingName(), building.getTenantList());
		}
		psbPortalDao.saveMockData(mockDataMap);
	}
	
	public List<Tenant> fetchMatchedTenants(String searchString){
		Map<String, List<Tenant>> mockBuildingMap = psbPortalDao.fetchMockData();
		return mockBuildingMap.get(searchString);
	}
}
