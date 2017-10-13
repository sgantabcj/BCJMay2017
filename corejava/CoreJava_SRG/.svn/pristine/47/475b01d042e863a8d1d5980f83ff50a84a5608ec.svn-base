package com.crmindz.bcjmay2017.javalang.lab1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class SerializeDemo {
	
	public static void main(String[] args) throws ClassNotFoundException {
		A aObj = new A();
		SerializeDemo serializeDemoObj = new SerializeDemo();
		serializeDemoObj.serialize(aObj);
		serializeDemoObj.deSerialize("src/com/crmindz/bcjmay2017/javalang/lab1/A.ser");
		
	}
	
	public void serialize(A aObj){
		
		try{
			
			FileOutputStream fileOut = new FileOutputStream("src/com/crmindz/bcjmay2017/javalang/lab1/A.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(aObj);
			out.close();
			fileOut.close();
			System.out.println("Serialization is done");
			
		}catch(IOException e){
			
			System.out.println("Unable to serialize due to IO Exception");
			e.printStackTrace();
			
		}
	}
	
	public void deSerialize(String path) throws ClassNotFoundException{
		A a = null;
		try{
			
			FileInputStream fileIn = new FileInputStream("src/com/crmindz/bcjmay2017/javalang/lab1/A.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			a = (A) in.readObject();
			in.close();
			fileIn.close();
			
		}catch(IOException i){
			
			i.printStackTrace();
			return;
			
		}
		
		System.out.println("Deserialize class A");
		System.out.println("i : " + a.i);
		System.out.println("j : " + a.j);
		System.out.println("l of class B : " + a.bObj.l);
	}
}
