package com.swe645.assignment3Rest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity(name = "StudenForm")
public class Test {
  
  @Id
  private int  aid;
  @Column(name = "my_name")
  private String aname;
  @Transient
  private String color;
  
  private int marks;
  
  public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public int getAid() {
    return aid;
  }
  public void setAid(int aid) {
    this.aid = aid;
  }
  
  public String getAname() {
    return aname;
  }
  public void setAname(String aname) {
    this.aname = aname;
  }
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  
  @Override
  public String toString() {
    return "Test [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
  }
  
  
  
  
}
