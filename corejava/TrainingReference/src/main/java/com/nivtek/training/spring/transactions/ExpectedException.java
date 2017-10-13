package com.nivtek.training.spring.transactions;

public class ExpectedException extends RuntimeException {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  
  public ExpectedException(String exceptionMessage) {
    this.exceptionMessage = exceptionMessage;
  }

  public String getMessage() {
    return exceptionMessage;
  }
  
  private String exceptionMessage;

}
