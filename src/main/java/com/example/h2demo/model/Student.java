package com.example.h2demo.model;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;

public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String passportNumber;
}
