package com.crmindz.bcjmay2017.classes.simple.lab8;

public class Demo {
	public static void main(String[] args) {
		Cuboid cubeOne = new Cuboid();
		cubeOne.setLength(3);
		cubeOne.setWidth(3);
		cubeOne.setHeight(3);
		
		System.out.printf("The dimensions of cube one is: %dx%dx%d"
							,cubeOne.getLength(),cubeOne.getWidth(),cubeOne.getHeight());
	}
}