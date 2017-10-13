package com.farmfresh.foodproductsinventory.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.farmfresh.foodproductsinventory.dao.InventoryDao;
import com.farmfresh.foodproductsinventory.model.FoodItem;
import com.farmfresh.foodproductsinventory.model.Inventory;

public class InventoryService {
	private InventoryDao inventoryDao = new InventoryDao();
	
	public void parseInventoryDataFile(File file) throws FileNotFoundException {
		
		Scanner invFileScanner = new Scanner(file);
		Date effectiveDate = null;
		Map<String, FoodItem> foodItemMap = new HashMap<String, FoodItem>();
		Map<String, Inventory> inventoryMap = new HashMap<String, Inventory>();
		
		while (invFileScanner.hasNextLine()) {

			String line = invFileScanner.nextLine().trim();

			if (line.matches("^FoodItem.*")) {
				FoodItem foodItem = new FoodItem();
				Pattern pattern = Pattern.compile("^.*- (UPC Code): ([0-9]+)\\s{2}(Shelf life): ([0-9]+)\\s{2}(Name): (.*)$");
				Matcher matcher = pattern.matcher(line);
				
				while (matcher.find()) {
					foodItem.setUpcCode(matcher.group(2));
					foodItem.setShelfLife(Integer.parseInt(matcher.group(4)));
					foodItem.setName(matcher.group(6));
				}
				
				foodItemMap.put(foodItem.getUpcCode(), foodItem);
				System.out.println("Food item line with item: " + foodItem.toString());
			}

			if (line.matches("^Warehouse.*")) {
				Inventory inventory = new Inventory();

				Pattern pattern = Pattern.compile("^(Warehouse) - (.*)$");
				Matcher matcher = pattern.matcher(line);
				while (matcher.find()) {
					inventory.setWarehouseName(matcher.group(2));
				}

				inventoryMap.put(inventory.getWarehouseName(), inventory);
				System.out.println("Warehouse details line with warehouse :"+inventory.getWarehouseName());
			}

			if (line.matches("^Start date.*")) {
				DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

				Pattern pattern = Pattern.compile("^(Start date): (.*)$");
				Matcher matcher = pattern.matcher(line);
				
				while (matcher.find()) {
					try {
						effectiveDate = dateFormat.parse(matcher.group(2));
					} catch (ParseException e) {
						System.out.println("exception while parsing");
						e.printStackTrace();
					}
				}
				
				System.out.println("Start date line: " + dateFormat.format(effectiveDate));
			}

			if (line.matches("^Receive.*$")) {
				String upcCode = "";
				String itemQty = "";
				String warehouseName = "";

				Pattern pattern = Pattern.compile("^(Receive): ([0-9]+)\\s([0-9]+)\\s([a-zA-Z]+)$");
				Matcher matcher = pattern.matcher(line);
				while (matcher.find()) {
					upcCode = matcher.group(2);
					itemQty = matcher.group(3);
					warehouseName = matcher.group(4);
				}

				for (int i = 0; i < Integer.parseInt(itemQty); i++) {
					
					FoodItem foodItem = new FoodItem();
					foodItem.setUpcCode(upcCode);
					foodItem.setName(foodItemMap.get(upcCode).getName());
					foodItem.setShelfLife(foodItemMap.get(upcCode).getShelfLife());
					
					if(inventoryMap.get(warehouseName).getInventoryItemMap().containsKey(upcCode)){
						inventoryMap.get(warehouseName).getInventoryItemMap().get(upcCode).add(foodItem);
					}else{
						ArrayList<FoodItem> foodItemList = new ArrayList<FoodItem>();
						foodItemList.add(foodItem);
						inventoryMap.get(warehouseName).getInventoryItemMap().put(upcCode, foodItemList);
					}
					
				}
				
				/*System.out.println("Recieved line with item: " + foodItemMap.get(upcCode) +"; qty: " + itemQty + "; for warehouse: " + warehouseName);
				System.out.println(inventoryMap.toString());
				System.out.println(inventoryMap.get(upcCode).toString());
				System.out.println();*/
			}

			if (line.matches("^Request.*$")) {
				String upcCode = "";
				int itemQty = 0;
				String warehouseName = "";

				Pattern pattern = Pattern.compile("^(Request): ([0-9]+)\\s([0-9]+)\\s([a-zA-Z]+)$");
				Matcher matcher = pattern.matcher(line);
				
				while (matcher.find()) {
					upcCode = matcher.group(2);
					itemQty = Integer.parseInt(matcher.group(3));
					warehouseName = matcher.group(4);
				}
				
				if(inventoryMap.get(warehouseName).getInventoryItemMap().containsKey(upcCode)){
					
					List<FoodItem> currentFoodItemList = inventoryMap.get(warehouseName).getInventoryItemMap().get(upcCode);
					
					if (!currentFoodItemList.isEmpty() && itemQty <= currentFoodItemList.size()) {
						for (int i = 0; i < itemQty; i++) {
							currentFoodItemList.remove(0);
						}
					} else {
						System.out.println("Sorry, not enough stock for the item: " + foodItemMap.get(upcCode));
					}
					
				}else{
					System.out.println("The item is not present in the inventory");
				}
				
				/*System.out.println("Requested line with item: " + foodItemMap.get(upcCode) +"; qty: " + itemQty + "; for warehouse: " + warehouseName);
				System.out.println(inventoryMap.toString());
				System.out.println(inventoryMap.get(upcCode).toString());
				System.out.println();*/
			}

			if (line.matches("Next day.*")) {

				Calendar c = Calendar.getInstance();
				c.setTime(effectiveDate);
				c.add(Calendar.DATE, 1);
				effectiveDate.setTime(c.getTimeInMillis());

				for (Map.Entry<String, Inventory> entry : inventoryMap.entrySet()) {
					for (Map.Entry<String, ArrayList<FoodItem>> foodItemEntry : entry.getValue().getInventoryItemMap().entrySet()) {
						for (FoodItem item : foodItemEntry.getValue()) {
							item.setShelfLife(item.getShelfLife() - 1);
						}
					}
					entry.getValue().removeExpiredItems();
				}
				
			/*	System.out.println("NextDayLine with date: " + new SimpleDateFormat("MM/dd/yyyy").format(effectiveDate));
				System.out.println(inventoryMap.toString());
				System.out.println();*/
			}

			if (line.matches("^End.*")) {
				inventoryDao.saveInventoryData(foodItemMap,inventoryMap);
				System.out.println("End line");
			}
		}
		invFileScanner.close();
	}
	
	public void saveInventoryData(Map<String,FoodItem> foodMap,Map<String,Inventory> inventoryMap){
		inventoryDao.saveInventoryData(foodMap,inventoryMap);
	}
	
	public String getReport(){
		String report = "";
		Map<String,FoodItem> foodItemMap = inventoryDao.fetchFoodItemMap();
		Map<String,Inventory> inventoryMap = inventoryDao.fetchInventoryMap();
		
		report+="Unstocked products:\n";
		String unstockedItems = "";
		currentItem:
		for(String upcCode : foodItemMap.keySet()){
			
			for(Inventory inventory : inventoryMap.values()){
				if(!inventory.getInventoryItemMap().get(upcCode).isEmpty()){
					continue currentItem;
				}
			}
			unstockedItems+=foodItemMap.get(upcCode).toString()+"\n";
			
		}
		
		if(unstockedItems.equals("")){
			report+="No item is unstocked completely\n\n";
		}else{
			report+=unstockedItems+"\n";
		}
		
		report+="Fully stocked products:\n";
		String fullyStockedItems = "";
		currentItem:
		for(String upcCode : foodItemMap.keySet()){
			
			for(Inventory inventory : inventoryMap.values()){
				if(inventory.getInventoryItemMap().get(upcCode).isEmpty()){
					continue currentItem;
				}
			}
			fullyStockedItems+=foodItemMap.get(upcCode).toString()+"\n";
			
		}
		
		if(unstockedItems.equals("")){
			report+="No item is fully stocked\n\n";
		}else{
			report+=fullyStockedItems+"\n";
		}
		
		report+="Items remaining: ";
		int count = 0;
		for(Inventory inventory : inventoryMap.values()){
			for(ArrayList<FoodItem> itemList : inventory.getInventoryItemMap().values()){
				count += itemList.size();
			}
		}
		report+=count;
		
		for(Inventory inv : inventoryMap.values()){
			for(ArrayList<FoodItem> list : inv.getInventoryItemMap().values()){
				System.out.println(inv.getWarehouseName()+ " size: " + list.size() + " " + list.toString());
			}
		}
		
		return report;
	}
}
