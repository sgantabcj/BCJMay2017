package com.nivtek.training.polymorphism.runtime.employee;

public class Person {
  
    private String name;
    private final int yearOfBirth;
    private String emailAddress;
    
    public Person(String name, int yearOfBirth, String emailAddress) {
      super();
      this.name = name;
      this.yearOfBirth = yearOfBirth;
      this.emailAddress = emailAddress;
    }

    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((emailAddress == null) ? 0 : emailAddress.hashCode());
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
      if (emailAddress == null) {
        if (other.emailAddress != null)
          return false;
      } else if (!emailAddress.equals(other.emailAddress))
        return false;
      if (name == null) {
        if (other.name != null)
          return false;
      } else if (!name.equals(other.name))
        return false;
      if (yearOfBirth != other.yearOfBirth)
        return false;
      return true;
    }
    
    
    
}