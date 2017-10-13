package com.nivtek.training.java.coordinatesystem.twodim;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PointTest {

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }
  
  @Test
  public void testMidPoint() {
    Point p1 = new Point(3, 5);
    Point p2 = new Point(9, 3);
    Point p3 = p1.midPoint(p2);
    
    int expectedX = (3 + 9) / 2;
    int actualX = p3.getX();
    assertEquals("Expected X not correct", expectedX, actualX);
    int expectedY = (5 + 3) / 2;
    int actualY = p3.getY();
    assertEquals("Expected Y not correct", expectedY, actualY);
  }

  @Test
  public void testScale() {
    Point p1 = new Point(3, 5);
    int scale = 3;
    Point p2 = p1.scale(scale);
    
    int expectedX = p1.getX() * scale;
    int actualX = p2.getX();
    assertEquals("Expected X not correct", expectedX, actualX);
    int expectedY = p1.getY() * scale;
    int actualY = p2.getY();
    assertEquals("Expected Y not correct", expectedY, actualY);
  }
}
