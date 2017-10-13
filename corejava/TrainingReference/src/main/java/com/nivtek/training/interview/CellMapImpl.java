package com.nivtek.training.interview;

public class CellMapImpl implements CellMap {

  CellBucketNode headBucket;
  
  public CellMapImpl() {
    headBucket = new CellBucketNode();
  }
  
  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

  @Override
  public Object get(Object key) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void put(Object key, Object value) {
    // TODO Auto-generated method stub
    CellBucketNode curr = headBucket;
    if (curr.hashCode == -1) {
      headBucket.hashCode = key.hashCode();
      headBucket.head = new CellNode();
      headBucket.head.key = key;
      headBucket.head.value = value;
    } else {
      if (key.hashCode() == curr.hashCode) {
        // found bucket containing key, iterate over all cell nodes to find matching
        CellNode currCellNode = curr.head;
        while (!currCellNode.key.equals(key)) {
          currCellNode = currCellNode.next;
        }
      }
      curr = curr.nextBucket;
    }
  }

}
