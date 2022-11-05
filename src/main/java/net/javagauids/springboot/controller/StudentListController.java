package net.javagauids.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
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

  @GetMapping("student/{id}/{first-name}/{last-name}")
  public Student studentPathVariable(
    @PathVariable("id") int studentId,
    @PathVariable("first-name") String fname,
    @PathVariable("last-name") String lname
    ){
    return new Student(studentId, fname, lname, "yow yow");
  }


  @GetMapping("students/query")//you can pass multiple request params
  public Student studentRequest(
    @RequestParam int id,
    @RequestParam String fname,
    @RequestParam String lname
    ){
    return new Student(id, fname, lname,null);
  }


  @PostMapping("students/create")
  @ResponseStatus(HttpStatus.CREATED)
  public  Student createStudent(@RequestBody Student student){
    System.out.println(student.getId());
    System.out.println(student.getFirstName());
    System.out.println(student.getLastName());
    System.out.println(student.getMessage());
    return student;
  }
  
}