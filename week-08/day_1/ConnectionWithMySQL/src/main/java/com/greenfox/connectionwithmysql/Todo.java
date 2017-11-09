package com.greenfox.connectionwithmysql;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String title;
  private boolean isUrgent;
  private boolean isDone;

  @OneToMany
  List<Assignee> assigneeList = new ArrayList<>();

  public List<Assignee> getAssigneeList() {
    return assigneeList;
  }

  public void setAssigneeList(List<Assignee> assigneeList) {
    this.assigneeList = assigneeList;
  }

  public Todo() {
    this.isUrgent = false;
    this.isDone = false;
  }
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

  public boolean getIsUrgent() {
    return isUrgent;
  }

  public void setIsUrgent(boolean urgent) {
    isUrgent = urgent;
  }

  public boolean getIsDone() {
    return isDone;
  }

  public void setIsDone(boolean done) {
    isDone = done;
  }

}
