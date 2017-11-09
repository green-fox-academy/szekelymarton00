package com.greenfox.reddit;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  String text;
  int voteScore;
  int rank;

  public Post(String text) {
    this.text = text;
  }

  public Post() {
  }

  public int getPostRank() {
    return rank;
  }

  public void setPostRank(int rank) {
    this.rank = rank;
  }

  public int getVoteScore() {
    return voteScore;
  }

  public void setVoteScore(int voteScore) {
    this.voteScore = voteScore;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
