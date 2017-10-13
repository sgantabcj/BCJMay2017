package com.farmfresh.foodproductsinventory.data;

import java.util.HashMap;
import java.util.Map;

import com.farmfresh.foodproductsinventory.model.FoodItem;
import com.farmfresh.foodproductsinventory.model.Inventory;

public class InventoryData {
	private Map<String,FoodItem> foodItemMap = new HashMap<String,FoodItem>();
	private Map<String,Inventory> inventoryMap = new HashMap<String,Inventory>();
	/**
	 * @return the foodItemMap
	 */
	public Map<String, FoodItem> getFoodItemMap() {
		return foodItemMap;
	}
	/**
	 * @param foodItemMap the foodItemMap to set
	 */
	public void setFoodItemMap(Map<String, FoodItem> foodItemMap) {
		this.foodItemMap = foodItemMap;
	}
	/**
	 * @return the inventoryMap
	 */
	public Map<String, Inventory> getInventoryMap() {
		return inventoryMap;
	}
	/**
	 * @param inventoryMap the inventoryMap to set
	 */
	public void setInventoryMap(Map<String, Inventory> inventoryMap) {
		this.inventoryMap = inventoryMap;
	}
	
}
