package com.crmindz.psbusinessparks.dao;

import java.util.Map;

import com.crmindz.psbusinessparks.mock.TenantMockData;
import com.crmindz.psbusinessparks.model.Tenant;
/**
 * TenantDataDao class holds the functions to save and fetch tenant data.
 * 
 * @author Sravan
 *
 */
public class TenantDataDao {
	
	TenantMockData tenantData = new TenantMockData();
	/**
	 * saves Tenant object passed to it.
	 * 
	 * @param tenant - the Tenant object to be saved
	 */
	public void saveTenant(Tenant tenant){
		tenantData.saveTenant(tenant);
	}
	/**
	 * fetches map with tenant data.
	 * 
	 * @return	Map<String,Tenant> - the map with tenant data to be fetched
	 */
	public Map<String,Tenant> fetchTenantData(){
		return tenantData.getTenantMockData();
	}
}
