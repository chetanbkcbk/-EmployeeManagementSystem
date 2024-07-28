package com.tek.ems.responsedto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
//@AllArgsConstructor  not needed coz default constructor gets used 
//@NoArgsConstructor  not needed coz builder is not used

public class EmployeeResponse {

	private int employeeId;
	private String employeeName;
	private String employeeEmail;
	private double salary;

}
