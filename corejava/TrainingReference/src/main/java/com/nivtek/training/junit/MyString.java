package com.nivtek.training.junit;

public class MyString {

  private String value;
  
  public MyString(String value) {
    super();
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String substring(int beginIndex) throws IndexOutOfBoundsException {
    if (beginIndex >= value.length()) {
      return value.substring(0);
    }
    return value.substring(beginIndex);
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    MyString abc = new MyString("hello");
    System.out.println("Substring with begin index 10 ==> " + abc.substring(10));
    System.out.println("Substring with begin index between 1 ==> " + abc.substring(1));
    System.out.println("Substring with begin index < 0 ==> " + abc.substring(-1));
  }
}
