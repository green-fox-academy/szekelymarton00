package com.greenfox.greenfoxclub;

import java.util.List;

public class Fox {

  private String name;
  private List<String> tricks;
  private String drink;
  private String food;


  public Fox() {

  }

  public Fox(String name,String drink,String food,List<String> tricks) {
    this.name = name;
    this.drink = drink;
    this.food = food;
    this.tricks = tricks;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setTricks(List<String> tricks) {
    this.tricks = tricks;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getName() {
    return name;
  }
  public List<String> getTricks() {
    return tricks;
  }
  public String getDrink() {
    return drink;
  }
  public String getFood() {
    return food;
  }
}
