package net.javagauids.springboot.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javagauids.springboot.bean.TestStudent;

/**
 * StudentTestController
 */

 @RestController
public class StudentTestController {



 
  @GetMapping("/test-student")
  public TestStudent getTestStudent(){
   
    TestStudent testStudent = new TestStudent(
      1,
      "this is a details",
      "10/18/1996",
      "11/11/1999"
      );

      return testStudent;
  }

  
}