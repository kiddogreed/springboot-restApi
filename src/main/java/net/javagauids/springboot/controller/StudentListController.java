package net.javagauids.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javagauids.springboot.bean.Student;

/**
 * StudentListController
 */

 @RestController
public class StudentListController {

    @GetMapping("students")
  public List<Student> geStudents(){
    List<Student> students = new ArrayList<>();
    students.add(new Student(1, "john russelle", "domingo", "hello"));
    students.add(new Student(2, "jack", "domingo", "yow yow"));
    students.add(new Student(3, "joe", "domingo", "wassup"));
    students.add(new Student(4, "jet", "domingo", "welcome"));
    return students;
  }

  
}