package com.example.demo.domain;

import java.time.*;

import lombok.*;

@Data
public class Employee {
	private int id;
	private String lastName;
	private String firstName;
	private String notes;
	private String photo;
	private LocalDate birth;
	
	
}