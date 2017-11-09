package com.greenfox.frontend;

import java.util.stream.IntStream;

public class ArraysResponse {

  private int result;

  public ArraysResponse(int[] result, String method) {
    if (method.equals("sum")) {
      this.result = sum(result);
    }
    if (method.equals("multiply")) {
      this.result = multiply(result);
    }
    if (method.equals("double")) {
      result = doubleNum(result);
    }
  }


  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public int sum(int[] sumOfNum) {
    int sum = IntStream.of(sumOfNum).sum();
    return sum;
  }

  public int multiply(int[] multiOfNum) {
    int result = 1;
    for (int value : multiOfNum) {
      result *= value;
    }
    return result;
  }

  public int[] doubleNum(int[] a) {

    int[] array = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      array[i] = a[i] * 2;
    }
    return array;
  }
}

