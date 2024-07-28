package com.tek.ems.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

import com.tek.ems.repository.EmployeeRepository;

@org.springframework.context.annotation.Configuration
public class EmployeeConfiguration {

	@Bean
	public ModelMapper modelMapper() { 
		return new ModelMapper();
	}
	
//	@Bean
//	public EmployeeRepository employeeRepository() {
//		return new EmployeeRepository();
//	}
}
//why? to avoid manual logic being written in mapper class which i used to create earlier