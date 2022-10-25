package net.javagauids.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

  //http://localhost:8080/hello-world
  @GetMapping("/hello-world")
  public String HelloWorld(){
    return "Hello world";
  }
}
