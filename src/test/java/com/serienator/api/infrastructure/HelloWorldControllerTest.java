package com.serienator.api.infrastructure;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldControllerTest {

  @Test
  public void shouldReturnAHelloWorld() {
    HelloWorldController helloWorldController = new HelloWorldController();

    String response = helloWorldController.helloWorld();

    String correctResponse = "Hello World";
    assertEquals(correctResponse, response);
  }
}