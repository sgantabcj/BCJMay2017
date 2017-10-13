package com.nivtek.training.equivalence;

public class Person {

  public Person(String name, int yearOfBirth) {
    super();
    this.name = name;
    this.yearOfBirth = yearOfBirth;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getYearOfBirth() {
    return yearOfBirth;
  }
  public void setYearOfBirth(int yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + yearOfBirth;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (!(obj instanceof Person))
      return false;
    final Person other = (Person) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (yearOfBirth != other.yearOfBirth)
      return false;
    
    return true;
  }
  
  private String name;
  private int yearOfBirth;
  private String emailAddress;
}
