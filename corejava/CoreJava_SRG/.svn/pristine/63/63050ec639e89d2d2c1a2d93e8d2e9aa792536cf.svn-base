package com.crmindz.bcjmay2017.oop.classes.medium.lab1;

public class Invoice {
	private String partNumber;
	private String partDescription;
	private int itemQty;
	private double itemPrice;
	
	public Invoice(String partNum, String partDesc, int itemQty, double itemPrice){
		this.partNumber = partNum;
		this.partDescription = partDesc;
		this.itemQty = itemQty;
		this.itemPrice = itemPrice;
	}
	
	/**
	 * @return the partNumber
	 */
	public String getPartNumber() {
		return partNumber;
	}
	/**
	 * @param partNumber the partNumber to set
	 */
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	/**
	 * @return the partDescription
	 */
	public String getPartDescription() {
		return partDescription;
	}
	/**
	 * @param partDescription the partDescription to set
	 */
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	/**
	 * @return the itemQty
	 */
	public int getItemQty() {
		return itemQty;
	}
	/**
	 * @param itemQty the itemQty to set
	 */
	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}
	/**
	 * @return the itemPrice
	 */
	public double getItemPrice() {
		return itemPrice;
	}
	/**
	 * @param itemPrice the itemPrice to set
	 */
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public double getInvoiceAmount(){
		if(getItemQty()<0){
			setItemQty(0);
		}
		if(getItemPrice()<0){
			setItemPrice(0.0);
		}
		return getItemPrice()*getItemQty();
	}
}
