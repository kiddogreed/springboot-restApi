package net.javagauids.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javagauids.springboot.bean.Student;

//always import the class needed
@RestController
public class StudentController {
  
  @GetMapping("student")
  public Student getStudent(){
    Student stud = new Student(
      1,
      " John Russelle",
      "Domingo",
      "MY message is awesome"
);

      return stud;
  }

}
