package com.psbusinessparks.psbtenantportal.model;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private String buildingName;
	private List<Tenant> tenantList = new ArrayList<Tenant>();
	/**
	 * @return the buildingName
	 */
	public String getBuildingName() {
		return buildingName;
	}
	/**
	 * @param buildingName the buildingName to set
	 */
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	/**
	 * @return the tenantList
	 */
	public List<Tenant> getTenantList() {
		return tenantList;
	}
	/**
	 * @param tenantList the tenantList to set
	 */
	public void setTenantList(List<Tenant> tenantList) {
		this.tenantList = tenantList;
	}
	public void addTenant(Tenant tenant){
		tenantList.add(tenant);
	}
}
