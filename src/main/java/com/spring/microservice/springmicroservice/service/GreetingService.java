package com.spring.microservice.springmicroservice.service;

import com.spring.microservice.springmicroservice.model.Greeting;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

  private static List<Greeting> list = new ArrayList<>();

  static {
    Greeting g1 = new Greeting(1, "FriendShip", "How are you , not seen you from many days",
        LocalDate.of(2015, 3, 5));
    Greeting g2 = new Greeting(2, "Father", "How are you , son",
        LocalDate.of(2003, 7, 23));
    Greeting g3 = new Greeting(3, "Teammate", "How are you , when you will join team",
        LocalDate.of(2019, 11, 12));
    Greeting g4 = new Greeting(4, "Teacher",
        "How are you , your exam schedule next months , best of luck",
        LocalDate.of(2015, 1, 5));
    Greeting g5 = new Greeting(5, "Mother", "How are you , come home son",
        LocalDate.of(2012, 2, 12));
    list.add(g1);
    list.add(g2);
    list.add(g3);
    list.add(g4);
    list.add(g5);

  }

  public List<Greeting> findAll() {
    return list;
  }

  public Greeting findBygreetingId(Integer id) {
    return list.get(id);
  }

  public Greeting createGreeting(Greeting greeting) {
    list.add(greeting);
    return greeting;
  }

  private void additem(Greeting greeting) {
    list.add(greeting.getGreetingId(), greeting);
  }


}
