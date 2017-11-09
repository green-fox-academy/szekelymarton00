package com.greenfox.frontend;

public class AppendaResponse {

  String appendable;

  public AppendaResponse(String input) {
    this.appendable = input + "a";
  }

  public String getAppendable() {
    return appendable;
  }

  public void setAppendable(String appendable) {
    this.appendable = appendable;
  }
}
