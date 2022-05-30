package com.example.demo.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Student {
  @SequenceGenerator(
      name = "student_sequence",
      sequenceName = "student_sequence",
      allocationSize = 1
  )
  @GeneratedValue(
      generator = "student_sequence",
      strategy = GenerationType.SEQUENCE
  )
  @Id
  private Long id;
  private String name;
  private String email;
  @Enumerated(EnumType.STRING)
  private Gender gender;
}
