package com.example.demo.student;

import lombok.Data;

@Data
public class Student {
  private Long id;
  private String name;
  private String email;
  private Gender gender;
}
