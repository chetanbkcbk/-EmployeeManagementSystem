package com.tek.ems.service;

import org.springframework.http.ResponseEntity;

import com.tek.ems.entity.Employee;
import com.tek.ems.requestdto.EmployeeRequest;
import com.tek.ems.util.ResponseStructure;

import jakarta.validation.Valid;

public interface EmployeeService {

	ResponseEntity<ResponseStructure> addEmployee( EmployeeRequest employeeRequest);

	ResponseEntity<ResponseStructure> findByEmployeeId(int employeeId);

	ResponseEntity<ResponseStructure> updateByEmployeeId(int employeeId, Employee employee);

	ResponseEntity<ResponseStructure> deleteByEmployeeId(int employeeId);

}
