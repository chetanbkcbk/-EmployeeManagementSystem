package com.tek.ems.requestdto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
//@NoArgsConstructor  not needed coz default constructor gets used implicitly
//@AllArgsConstructor //not needed coz builder is not used
public class EmployeeRequest {

	private String employeeName;
	private String employeeEmail;

	private String employeePassword;
	private double salary;
}
