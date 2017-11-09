package com.greenfox.frontend;

public class DoUntilResponse {

  private int result;

  public DoUntilResponse(int result,String method) {
    if (method.equals("sum")) {
      this.result = sum(result);
    }
    if (method.equals("factor")) {
      this.result = factorial(result);
    }
  }

  public int sum(int doUntilNum) {
    int result = 0;
    for (int i = 0; i <= doUntilNum; i++) {
      result += i;
    }
    return result;
  }

  public int factorial(int doUntilFac) {
    if (doUntilFac == 0)
      return 1;
    else
      return(doUntilFac * factorial(doUntilFac-1));
  }


  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
