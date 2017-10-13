package com.nivtek.training.io.serial;

import java.io.Serializable;

public class Car implements Serializable {

  private String make;
  private String model;
  private int year;
  private String licensePlateNumber;
  private String vinNumber;
  private String color;
  private transient int speed;
  
  
  public Car() {
    super();
    this.speed = 0;
  }
  
  public Car(String make, String model, int year, String licensePlateNumber,
             String vinNumber, String color) {
    super();
    this.make = make;
    this.model = model;
    this.year = year;
    this.licensePlateNumber = licensePlateNumber;
    this.vinNumber = vinNumber;
    this.color = color;
    this.speed = 0;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getLicensePlateNumber() {
    return licensePlateNumber;
  }

  public void setLicensePlateNumber(String licensePlateNumber) {
    this.licensePlateNumber = licensePlateNumber;
  }

  public String getVinNumber() {
    return vinNumber;
  }

  public void setVinNumber(String vinNumber) {
    this.vinNumber = vinNumber;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }
  
  @Override
  public String toString() {
    return "make: " + make +
           "\nmodel: " + model +
           "\nyear: " + year +
           "\ncolor: " + color +
           "\nlicense plate: " + licensePlateNumber +
           "\nvin #: " + vinNumber +
           "\nspeed: " + speed;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((color == null) ? 0 : color.hashCode());
    result = prime * result + ((licensePlateNumber == null) ? 0 : licensePlateNumber.hashCode());
    result = prime * result + ((make == null) ? 0 : make.hashCode());
    result = prime * result + ((model == null) ? 0 : model.hashCode());
    result = prime * result + ((vinNumber == null) ? 0 : vinNumber.hashCode());
    result = prime * result + year;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    final Car other = (Car) obj;
    if (color == null) {
      if (other.color != null)
        return false;
    } else if (!color.equals(other.color))
      return false;
    if (licensePlateNumber == null) {
      if (other.licensePlateNumber != null)
        return false;
    } else if (!licensePlateNumber.equals(other.licensePlateNumber))
      return false;
    if (make == null) {
      if (other.make != null)
        return false;
    } else if (!make.equals(other.make))
      return false;
    if (model == null) {
      if (other.model != null)
        return false;
    } else if (!model.equals(other.model))
      return false;
    if (vinNumber == null) {
      if (other.vinNumber != null)
        return false;
    } else if (!vinNumber.equals(other.vinNumber))
      return false;
    if (year != other.year)
      return false;
    return true;
  }

  /**
   * @param increaseSpeedByThisAmount
   * increase the current speed of the car by a specific amount
   */
  public void accelerate(int increaseSpeedByThisAmount) {
    this.speed += increaseSpeedByThisAmount;
  }
  
  /**
   * @param decreaseSpeedByThisAmount
   * decrease the current speed of the car by a specific amount
   */
  public void decelerate(int decreaseSpeedByThisAmount) {
    this.speed -= decreaseSpeedByThisAmount;
  }

}
