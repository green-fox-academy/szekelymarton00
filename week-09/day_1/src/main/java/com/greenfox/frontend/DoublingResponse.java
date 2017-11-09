package com.greenfox.frontend;

public class DoublingResponse {

  private int result;
  private int received;

  public DoublingResponse(int received,int result) {
    this.received = received;
    this.result = result;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

}
