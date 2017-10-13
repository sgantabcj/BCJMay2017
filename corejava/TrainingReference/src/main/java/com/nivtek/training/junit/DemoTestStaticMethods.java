package com.nivtek.training.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DemoTestStaticMethods {

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testAdd() {
    int expected_value = 7;
    int actual_value = ArithmeticUtils.add(3, 4);
    assertEquals("add failed, ", expected_value, actual_value);
  }
  
  @Test
  public void testSubtract() {
    int expected_value = 3;
    int actual_value = ArithmeticUtils.subtract(7, 4);
    assertEquals("subtract failed, ", expected_value, actual_value);
  }

}
