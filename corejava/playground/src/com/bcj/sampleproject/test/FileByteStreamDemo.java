package com.bcj.sampleproject.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteStreamDemo {
	public static void main(String[] args) throws IOException {
		FileByteStreamDemo fileDemo = new FileByteStreamDemo();
		fileDemo.createFile("src/files/InputFile.txt");
		fileDemo.writeToFile("This is a test copy file.\nThis is being copied to other file.","src/files/InputFile.txt");
		fileDemo.copyFile("src/files/InputFile.txt" , "src/files/OutputFile.txt");
	}
	
	public void createFile(String path) throws IOException{
		File file = new File(path);
		if(!file.exists()){
			file.createNewFile();
		}
	}
	
	public void writeToFile(String contents, String filePath) throws IOException{
		try {
			FileOutputStream outStream = new FileOutputStream(filePath);
			outStream.write(contents.getBytes());
			outStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void copyFile(String originPath, String destPath) throws IOException{
		FileInputStream inStream = null;
		FileOutputStream outStream = null;
		try{
			inStream = new FileInputStream(originPath);
			File destFile = new File(destPath);
			outStream = new FileOutputStream(destPath);
			
			if(!destFile.exists()){
				destFile.createNewFile();
			}
			
			int c;
			while((c = inStream.read()) != -1){
				outStream.write(c);
			}
		}finally{
			if(inStream != null){
				inStream.close();
			}
			if(outStream != null){
				outStream.close();
			}
		}
	}
}
