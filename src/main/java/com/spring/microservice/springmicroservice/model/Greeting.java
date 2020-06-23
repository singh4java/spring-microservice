package com.spring.microservice.springmicroservice.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.DateFormatter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Greeting {

  private Integer greetingId;
  private String greetingType;
  private String greetingMessage;


  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate greetingDate;
}
