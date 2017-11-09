package com.greenfox.frontend;

public class ArraysRequest {

  private int[] numbers;
  private String what;

  public ArraysRequest(int[] numbers) {
    this.numbers = numbers;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }

  public ArraysRequest() {
  }
}
