package com.tek.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tek.ems.util.ResponseStructure;

import jakarta.validation.Valid;

import com.tek.ems.entity.Employee;
import com.tek.ems.requestdto.EmployeeRequest;
import com.tek.ems.service.EmployeeService;


@RestController				// tells Spring that this class will handle HTTP requests and responses in a RESTful manner and spring automatically converting the response into JSON or XML format based on the request's content type.
@RequestMapping("/api/v1")  //maps the base URL path for all the methods in the controller. In this case, all endpoints will start with /api/v1.
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employees")
	public ResponseEntity<ResponseStructure>addEmployee(@RequestBody  EmployeeRequest employeeRequest)
	{
		return employeeService.addEmployee(employeeRequest);
	}
	
	@GetMapping("/employees/{employeeId}")
	public ResponseEntity<ResponseStructure>findByEmployeeId(@PathVariable int employeeId)
	{
	return employeeService.findByEmployeeId(employeeId);
	}
	
	@PutMapping("/employees/{employeeId}")
	public ResponseEntity<ResponseStructure>updateByEmployeeId(@PathVariable int employeeId,@RequestBody Employee employee)

	{
	return employeeService.updateByEmployeeId(employeeId,employee);
	}
	
	@DeleteMapping("/employees/{employeeId}")
	public ResponseEntity<ResponseStructure>deleteByEmployeeId(@PathVariable int employeeId)

	{
	return employeeService.deleteByEmployeeId(employeeId);
	}
}

