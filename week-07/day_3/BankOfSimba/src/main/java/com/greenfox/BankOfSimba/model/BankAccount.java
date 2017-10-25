package com.greenfox.BankOfSimba.model;

import java.text.DecimalFormat;

public class BankAccount {

  String name;
  float balance;
  String animalType;
  String currency;
  boolean isKing;
  boolean isGood;

  public BankAccount(String name, float balance, String animalType, boolean isGood) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.currency = " Horse";
    if (this.name.equals("King")) {
      this.isKing = true;
    } else {
      this.isKing = false;
    }

  }

  public String getName() {
    return name;
  }

  public String getisGood() {
    if (this.isGood = false) {
      return "This is a bad Guy";
    } else {
      return "This is a good Guy";
    }
  }

  public boolean getisKing() {
    return isKing;
  }

  public String getBalance() {
    DecimalFormat df = new DecimalFormat("#.00");
    return df.format(balance) + currency;
  }

  public String getAnimalType() {
    return animalType;
  }


}
