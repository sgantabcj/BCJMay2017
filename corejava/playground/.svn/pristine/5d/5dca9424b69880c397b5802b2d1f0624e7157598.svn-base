package com.bcj.sampleproject.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileIODemo {
	public static void main(String[] args) throws IOException {
		File path = new File("C:/bootcampmay17/docs/TestInventoryFile.txt");
		System.out.println("we got a file path: "+ path);
		
		System.out.println("does it exist? " + path.exists());
		System.out.println("wat? " + path.isDirectory());
		
		String contentsToWrite = "This is a sample file.";
		FileOutputStream outStream = new FileOutputStream(path);
		outStream.write(contentsToWrite.getBytes());
		outStream.close();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
		String firstLine = reader.readLine();
		reader.close();
		System.out.println("Read a line: " + firstLine);
	}
}
