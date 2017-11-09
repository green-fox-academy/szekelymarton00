package com.greenfox.connectionwithmysql;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "assignee")
public class Assignee {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String name;
  private String email;

  @OneToMany
  List<Todo> todos = new ArrayList<>();


  public Assignee() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Assignee(String name,String email) {
    this.name = name;
    this.email = email;


  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
