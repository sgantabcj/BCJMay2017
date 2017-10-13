package com.crmindz.bcjmay2017.flowcontrol.lab5;

public class SalesPersonEarningsCalculator {
	private static float ITEM_ONE_PRICE = 239.99f;
	private static float ITEM_TWO_PRICE = 129.75f;
	private static float ITEM_THREE_PRICE = 99.95f;
	private static float ITEM_FOUR_PRICE = 350.89f;
	
	public static void main(String[] args) {
		int itemOneSold = 2;
		int itemTwoSold = 2;
		int itemThreeSold = 2;
		int itemFourSold = 2;
		
		double earnings = getEarnings(itemOneSold, itemTwoSold, itemThreeSold, itemFourSold);
		System.out.printf("Total earnings: %.2f for selling %d item one %d item two %d item three %d item four",earnings,itemOneSold,itemTwoSold,itemThreeSold,itemFourSold);
	}
	public static double getEarnings(int itemOne, int itemTwo, int itemThree, int itemFour){
		float valueOfItemsSold = (itemOne*ITEM_ONE_PRICE)+(itemTwo*ITEM_TWO_PRICE)+(itemThree*ITEM_THREE_PRICE)+(itemFour*ITEM_FOUR_PRICE);
		return 200+(valueOfItemsSold*0.9);
	}
	
	
}
