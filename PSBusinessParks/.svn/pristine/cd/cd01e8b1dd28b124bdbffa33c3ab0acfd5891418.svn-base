package com.crmindz.psbusinessparks.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.crmindz.psbusinessparks.dao.TenantDataDao;
import com.crmindz.psbusinessparks.model.Tenant;
/**
 * TenantDataService class holds functions to manipulate tenant data.
 * 
 * @author Sravan
 */
public class TenantDataService {

	TenantDataDao tenantDao = new TenantDataDao();
	/**
	 * fetches tenant data and matches with passed query string.
	 * 
	 * @param	tenantQueryString - a query string to compare with tenant data
	 * @return	List<Tenant> - List of matched Tenants
	 */
	public List<Tenant> fetchTenantData(String tenantQueryString) {
		List<Tenant> matchedTenantList = new ArrayList<Tenant>();
		Map<String, Tenant> tenantDataMap = tenantDao.fetchTenantData();
		for (Map.Entry<String, Tenant> entry : tenantDataMap.entrySet()) {
			try {
				if (entry.getKey().contains(tenantQueryString)
						|| entry.getValue().getAddress().getAddressLine1().contains(tenantQueryString)) {
					matchedTenantList.add(entry.getValue());
				}
			} catch (Exception e) {
				System.out.println("Incorrect details, please enter valid name/address");
			}
		}
		return matchedTenantList;
	}

	/**
	 * saves tenant data.
	 * 
	 * @param tenant - the Tenant to be saved
	 */
	public void saveTenant(Tenant tenant) {
		tenantDao.saveTenant(tenant);
	}
}
