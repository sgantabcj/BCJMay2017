package com.nivtek.training.java.coordinatesystem.twodim;

public class DummyPoint {

  private int x;
  private int y;

  public DummyPoint(int i, int j) {
    this.x = i;
    this.y = j;
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

  public DummyPoint midPoint(DummyPoint point2) {
    return new DummyPoint((this.x + point2.x) / 2, (this.y + point2.y) / 2);
  }

  public int getX() {
    return x;
  }

  public DummyPoint scale(int factor) {
    // TODO Auto-generated method stub
    return new DummyPoint(this.x * factor, this.y * factor);
  }

}
