package com.farmfresh.foodproductsinventory.test;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.Test;

import com.farmfresh.foodproductsinventory.controller.ClientInventoryDemo;

public class ClientInventoryDemoTest {

	@Test
	public void testParseInventoryDataFile() {
		ClientInventoryDemo clientDemo = new ClientInventoryDemo();
		File testFile = new File("C:/bootcampmay17/docs/TestInventoryFile");
		try {
			clientDemo.parseInventoryDataFile(testFile);
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
	}


}
