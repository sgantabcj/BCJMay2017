package com.nivtek.training.classesandobjects;

public class Car {

  private String make;
  private String model;
  private int year;
  private String licensePlateNumber;
  private String vinNumber;
  private String color;
  private int speed;
  
  
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
  
  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Car myCamry = new Car("Toyota",
                          "Camry",
                          2005,
                          "ANI 202",
                          "2345912693730477509",
                          "black");
    
    // toString will get invoked implicitly
    System.out.println("my camry: " + myCamry);
    System.out.println();
    
    myCamry.accelerate(60);
    // My son says dad go faster
    myCamry.accelerate(20);
    // Then I see a cop in front and I decide to slow down
    myCamry.decelerate(15);
    
 // toString will get invoked implicitly
    System.out.println("my camry: " + myCamry);
  }

}
