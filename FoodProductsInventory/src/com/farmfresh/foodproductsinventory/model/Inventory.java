package com.farmfresh.foodproductsinventory.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
	private String warehouseName;
	private Map<String,ArrayList<FoodItem>> inventoryItemMap= new HashMap<String,ArrayList<FoodItem>>();
	/**
	 * @return the warehouseName
	 */
	public String getWarehouseName() {
		return warehouseName;
	}
	/**
	 * @param warehouseName the warehouseName to set
	 */
	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}
	/**
	 * @return the inventoryItemMap
	 */
	public Map<String, ArrayList<FoodItem>> getInventoryItemMap() {
		return inventoryItemMap;
	}
	/**
	 * @param inventoryItemMap the inventoryItemMap to set
	 */
	public void setInventoryItemMap(Map<String, ArrayList<FoodItem>> inventoryItemMap) {
		this.inventoryItemMap = inventoryItemMap;
	}
	
	public void removeExpiredItems(){
		for(List<FoodItem> list:inventoryItemMap.values()){
			for(int i=0;i<list.size();i++){
				if(list.get(i).getShelfLife()<=0){
					list.remove(i);
					i=0;
				}
			}
		}
	}
}
