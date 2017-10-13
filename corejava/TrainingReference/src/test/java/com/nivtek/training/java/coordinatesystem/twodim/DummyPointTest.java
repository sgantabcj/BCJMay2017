package com.nivtek.training.java.coordinatesystem.twodim;

import static org.junit.Assert.*;

import org.junit.*;

public class DummyPointTest {

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }
  
  @Test
  public void testMidPoint() {
    DummyPoint point1 = new DummyPoint(3, 5);
    DummyPoint point2 = new DummyPoint(9, 3);
    DummyPoint point3 = point1.midPoint(point2);
    int actual = point3.getX();
    int expected = (point1.getX() + point2.getX())/2;
    assertEquals("Midpoint value is incorrect!", expected, actual);
  }
  
  @Test
  public void testScale() {
    DummyPoint point1 = new DummyPoint(3, 5);
    DummyPoint p2 = point1.scale(2);
    int actualX = p2.getX();
    int expectedX = 3 * 2;
    assertEquals("Midpoint value is incorrect!", expectedX, actualX);
  }
}
