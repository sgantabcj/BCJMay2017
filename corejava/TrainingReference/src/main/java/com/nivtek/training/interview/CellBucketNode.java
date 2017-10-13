package com.nivtek.training.interview;

public class CellBucketNode {

  int hashCode; // All cell nodes in this bucket will have the same hash code
  
  CellNode head;
  CellBucketNode nextBucket;
  
  public CellBucketNode() {
    hashCode = -1;
  }
}
