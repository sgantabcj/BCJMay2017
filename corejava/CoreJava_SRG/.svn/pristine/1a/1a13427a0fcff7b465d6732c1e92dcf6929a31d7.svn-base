package com.crmindz.bcjmay2017.exceptions.lab1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileManipulationDemo {
	public static void main(String[] args) {
		FileManipulationDemo fileDemo = new FileManipulationDemo();
		fileDemo.createAndWriteToFile("src/com/crmindz/bcjmay2017/exceptions/lab1/sourcefolder/SourceFile.txt");
		fileDemo.transformAndCopyFile("src/com/crmindz/bcjmay2017/exceptions/lab1/sourcefolder/SourceFile.txt"
										,"src/com/crmindz/bcjmay2017/exceptions/lab1/destinationfolder" );
	}

	public void createAndWriteToFile(String filePath) {
		try {
			
			File file = new File(filePath);

			if (!file.exists()) {
				file.createNewFile();
			}
			
			PrintWriter writer = new PrintWriter(file);
			writer.println("This is the test file created to do manipulations");
			writer.println();
			writer.println("//This is a line comment");
			writer.println("This is a new line");
			writer.println("This is a new line");
			writer.println("");
			writer.println("//This is a line comment");
			writer.close();
		} catch (IOException e) {
			
			System.out.println("IOException occured.");
			e.printStackTrace();
			
		}
	}

	public void transformAndCopyFile(String fileName, String directoryName) {
try {
			
			File file = new File(directoryName+"/OutputFile.txt");

			if (!file.exists()) {
				file.createNewFile();
			}
			
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			PrintWriter writer = new PrintWriter(file);
			String line;
			
			while((line = br.readLine()) != null){
				
				line.trim();
				if(!line.equals("") && !line.matches("^//.*$")){
					writer.println(line);
				}
				
			}
			
			writer.close();
			br.close();
			
		} catch (IOException e) {
			
			System.out.println("IOException occured.");
			e.printStackTrace();
			
		}
	}
}
