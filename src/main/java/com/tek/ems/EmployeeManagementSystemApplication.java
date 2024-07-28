package com.tek.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //@Configuration +@ComponentScan+@EnableAutoConfiguration
public class EmployeeManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args); //run() invokes the spring bean container
	}

}
