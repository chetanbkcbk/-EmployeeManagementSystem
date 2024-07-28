package com.tek.ems.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
//@AllArgsConstructor 	
//@NoArgsConstructor		 not needed coz default constructor gets used implicitly
public class Employee {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int employeeId;
	private String employeeName;
	private String employeeEmail;
	private String employeePassword;
	private double salary;
}
