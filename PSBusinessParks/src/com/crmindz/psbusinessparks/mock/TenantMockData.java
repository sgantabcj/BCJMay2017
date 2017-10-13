package com.crmindz.psbusinessparks.mock;

import java.util.HashMap;
import java.util.Map;

import com.crmindz.psbusinessparks.model.Tenant;
/**
 * 
 *TenantMockData class holds Map with tenant data and functions to manipulate it.
 * 
 * @author Sravan
 *
 */
public class TenantMockData {
	Map<String,Tenant> tenantMap = new HashMap<String, Tenant>();
	/**
	 * saves Tenant object in Map.
	 * 
	 * @param tenant - Tenant object to be added to Map
	 */
	public void saveTenant(Tenant tenant){
		tenantMap.put(tenant.getTenantName(), tenant);
	}
	/**
	 * returns Map with tenant data.
	 * 
	 * @return Map<String, Tenant> - the Map to be returned
	 */
	public Map<String, Tenant> getTenantMockData(){
		return tenantMap;
	}
}
