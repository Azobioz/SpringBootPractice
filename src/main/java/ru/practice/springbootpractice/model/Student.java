package ru.practice.springbootpractice.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Student {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String email;
    private int age;



}
