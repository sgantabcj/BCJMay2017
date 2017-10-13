package com.nivtek.training.io.serial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoSerializable {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Car myCamry = new Car("Toyota",
        "Camry",
        2005,
        "ANI 202",
        "2345912693730477509",
        "black");
    System.out.println("Car created: " + myCamry);
    
    File myCarFile = new File("c:\\temp\\mycar.ser");
    
    // Save the car object
    
    ObjectOutputStream oos = null;
    try {
      oos = new ObjectOutputStream(
          new FileOutputStream(myCarFile));
        oos.writeObject(myCamry);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
        try {
          oos.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
    }

    // Read the car object
    ObjectInputStream ois = null;
    Car carReadFromFile = null;
    try {
      ois = new ObjectInputStream(
        new FileInputStream(myCarFile));
        carReadFromFile = (Car) ois.readObject();
        System.out.println("Car read from disk: " + carReadFromFile);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } finally {
        try {
          ois.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
    }
    System.out.println();
    
    myCamry.setYear(2012);
    System.out.println("Are myCamry and object read from disk equal? " + myCamry.equals(carReadFromFile));
  }

}
