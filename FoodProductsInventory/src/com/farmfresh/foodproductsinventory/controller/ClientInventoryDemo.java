package com.farmfresh.foodproductsinventory.controller;

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
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.farmfresh.foodproductsinventory.model.FoodItem;
import com.farmfresh.foodproductsinventory.model.Inventory;
import com.farmfresh.foodproductsinventory.service.InventoryService;

public class ClientInventoryDemo {
	private InventoryService invService = new InventoryService();
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ClientInventoryDemo clientDemo = new ClientInventoryDemo();
		
		System.out.println("Please enter the path to the inventory data file:");
		String filePath = clientDemo.sc.nextLine();
		File invDataFile = new File(filePath);
		
		while(!invDataFile.exists()){
			System.out.println("No file found for the path you have entered, please enter a valid path again:");
			filePath = clientDemo.sc.nextLine();
			invDataFile = new File(filePath);
		}
		
		try {
			clientDemo.parseInventoryDataFile(invDataFile);
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
		
		clientDemo.printReport();
	}
	
	public void parseInventoryDataFile(File file) throws FileNotFoundException{
		invService.parseInventoryDataFile(file);
	}
	
	public void printReport(){
		String report = invService.getReport();
		System.out.println(report);
	}
	
}
