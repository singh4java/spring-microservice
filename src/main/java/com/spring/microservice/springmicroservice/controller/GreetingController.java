package com.spring.microservice.springmicroservice.controller;

import com.spring.microservice.springmicroservice.model.Greeting;
import com.spring.microservice.springmicroservice.service.GreetingService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  @Autowired
  private GreetingService greetingService;

  @GetMapping("/greetings")
  public List<Greeting> allGreetings(){
    return greetingService.findAll();
  }
  @GetMapping("/greetings/{greetingid}")
  public Greeting findGreetingById(@PathVariable Integer greetingid){
    return greetingService.findBygreetingId(greetingid);
  }

  @PostMapping("/greetings")
  public Greeting createGreeting(@RequestBody Greeting greeting){
    return greetingService.createGreeting(greeting);
  }
}
