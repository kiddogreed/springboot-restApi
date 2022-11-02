package net.javagauids.springboot.bean;

import java.sql.Date;

public class TestStudent {

  private int id;
  private String details;
  private String createdDate;
  private String updatedDate;

  public TestStudent(int id, String details, String string, String string2) {
    this.id = id;
    this.details = details;
    this.createdDate = string;
    this.updatedDate = string2;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public String getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(String updatedDate) {
    this.updatedDate = updatedDate;
  }

  

  
  
}
