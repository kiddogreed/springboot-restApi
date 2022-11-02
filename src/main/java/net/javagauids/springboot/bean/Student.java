package net.javagauids.springboot.bean;

public class Student {
  private int id;
  private String firstName;
  private String lastName;
  private String message;

  //create constructor
  public Student(int id, String firstName, String lastName, String message) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    // Creating a constructor for the class.
    this.message = message;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  
  //create getter and setters
  

  
  
}
