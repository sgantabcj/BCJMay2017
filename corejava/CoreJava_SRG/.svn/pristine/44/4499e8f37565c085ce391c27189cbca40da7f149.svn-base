package com.crmindz.bcjmay2017.flowcontrol.lab9;

public class RightAngleTriangle {
	public static void main(String[] args) {
		int sideOne = 4;
		int sideTwo = 3;
		int sideThree = 8;
		if(isRightAngeledTriangle(sideOne,sideTwo,sideThree)){
			System.out.printf("%d, %d, %d can represet sides of a right angled triangle",sideOne,sideTwo,sideThree);
		}else{
			System.out.printf("%d, %d, %d does not represet sides of a right angled triangle",sideOne,sideTwo,sideThree);
		}
	}
	public static boolean isRightAngeledTriangle(int sideOne, int sideTwo, int sideThree){
		int sideOneSquare = sideOne * sideOne;
		int sideTwoSquare = sideTwo * sideTwo;
		int sideThreeSquare = sideThree * sideThree;
		if(sideOneSquare+sideTwoSquare == sideThreeSquare || sideOneSquare+sideThreeSquare == sideTwoSquare
					|| sideTwoSquare+sideThreeSquare == sideThreeSquare){
			return true;
		}else{
			return false;
		}
	}
}
