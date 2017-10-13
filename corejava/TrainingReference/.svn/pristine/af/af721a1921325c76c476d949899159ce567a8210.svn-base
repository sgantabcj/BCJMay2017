package com.nivtek.training.junit;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMyString {

  private MyString myStr = new MyString("hello");
  
  @Before
  public void setUp() throws Exception {
   
  }
  
  @Test
  public void substring_beginIndexWithinRange_ExpectSameSubStringAsString() {
    String actual = myStr.substring(2);
    String expected = "llo";
    assertEquals("happy path failed for MyString!", expected, actual);
  }

  @Test(expected=IndexOutOfBoundsException.class)
  public void substring_beginIndexNegative_ExpectIndexOutOfBoundsException() {
    String actual = myStr.substring(-1);
  }
  
  @Test
  public void substring_beginIndexLongerThanLength_ExpectWholeString() {
    String actual = myStr.substring(5);
    String expected = "hello";
    assertEquals("Boundary condtition failed for MyString!", expected, actual);
  }
}
