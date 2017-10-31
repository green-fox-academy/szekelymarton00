package com.greenfox.todo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;

  String title;
  boolean isUrgent;
  boolean isDone;

  public long getId() {
    return id;
  }

  public Todo(String title) {
    this.title = title;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return isUrgent;
  }

  public void setUrgent(boolean urgent) {
    isUrgent = urgent;
  }

  public boolean isDone() {
    return isDone;
  }

  public void setDone(boolean done) {
    isDone = done;
  }

  public Todo() {
    this.isUrgent = false;
    this.isDone = false;
  }
}
