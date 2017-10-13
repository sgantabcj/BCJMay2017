package com.crmindz.bcjmay2017.operators.lab5;

import java.util.Scanner;

public class CirclePropertiesCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the radius of the circle to print it's area, circumference and perimeter:");
		int radius = sc.nextInt();
		sc.close();
		
		System.out.printf("Given radius of circle: %d\ndiameter: %d\ncircumference: %.2f\narea: %.2f"
							,radius,2*radius,2*Math.PI*radius,Math.PI*radius*radius);
	}
}
