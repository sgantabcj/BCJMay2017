package com.farmfresh.foodproductsinventory.dao;

import java.util.Map;

import com.farmfresh.foodproductsinventory.data.InventoryData;
import com.farmfresh.foodproductsinventory.model.FoodItem;
import com.farmfresh.foodproductsinventory.model.Inventory;

public class InventoryDao {
	InventoryData inventoryData = new InventoryData();
	
	public void saveInventoryData(Map<String,FoodItem> foodItemMap,Map<String,Inventory> inventoryMap){
		inventoryData.setFoodItemMap(foodItemMap);
		inventoryData.setInventoryMap(inventoryMap);
	}
	
	public Map<String,FoodItem> fetchFoodItemMap(){
		return inventoryData.getFoodItemMap();
	}
	
	public Map<String,Inventory> fetchInventoryMap(){
		return inventoryData.getInventoryMap();
	}
}
