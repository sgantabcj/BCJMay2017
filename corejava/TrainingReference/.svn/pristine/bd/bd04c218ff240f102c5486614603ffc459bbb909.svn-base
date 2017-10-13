package com.nivtek.training.equality;

public class Table {
  
  private int length;
  private int width;
  private int height;
  
  public Table(int l, int w, int h) {
    this.length = l;
    this.width = w;
    this.height = h;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + height;
    result = prime * result + length;
    result = prime * result + width;
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
    final Table other = (Table) obj;
    if (height != other.height)
      return false;
    if (length != other.length)
      return false;
    if (width != other.width)
      return false;
    return true;
  }

  public static void main(String[] args) {
    Table johnTable = new Table(3, 2, 5);
    Table chrisTable = johnTable;
    System.out.println("Is John's table same as Chris's table?");
    System.out.println(johnTable == chrisTable);
    Table maryTable = new Table(4, 7, 6);
    System.out.println("Is John's table same as Mary's table?");
    System.out.println(johnTable == maryTable);
  }
}
