package com.serienator.api.infrastructure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

  @RequestMapping( method = RequestMethod.GET)
  public String helloWorld() {
    return "Hello World";
  }
}
