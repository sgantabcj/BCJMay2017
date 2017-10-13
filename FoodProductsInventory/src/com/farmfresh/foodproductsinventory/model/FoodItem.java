package com.farmfresh.foodproductsinventory.model;

public class FoodItem {
	private String upcCode;
	private String foodItemName;
	private int shelfLife;
	/**
	 * @return the upcCode
	 */
	public String getUpcCode() {
		return upcCode;
	}
	/**
	 * @param upcCode the upcCode to set
	 */
	public void setUpcCode(String upcCode) {
		this.upcCode = upcCode;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return foodItemName;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.foodItemName = name;
	}
	/**
	 * @return the foodItemName
	 */
	public String getFoodItemName() {
		return foodItemName;
	}
	/**
	 * @param foodItemName the foodItemName to set
	 */
	public void setFoodItemName(String foodItemName) {
		this.foodItemName = foodItemName;
	}
	/**
	 * @return the shelfLife
	 */
	public int getShelfLife() {
		return shelfLife;
	}
	/**
	 * @param shelfLife the shelfLife to set
	 */
	public void setShelfLife(int shelfLife) {
		this.shelfLife = shelfLife;
	}
	
	public String toString(){
		return "UPC Code: "+upcCode+"  Name: "+foodItemName;
	}
	
}
