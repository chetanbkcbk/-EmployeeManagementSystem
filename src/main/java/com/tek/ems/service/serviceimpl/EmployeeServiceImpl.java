package com.tek.ems.service.serviceimpl;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tek.ems.entity.Employee;
import com.tek.ems.repository.EmployeeRepository;
import com.tek.ems.requestdto.EmployeeRequest;
import com.tek.ems.responsedto.EmployeeResponse;
import com.tek.ems.service.EmployeeService;
import com.tek.ems.util.ApiResponseStructure;
import com.tek.ems.util.ResponseStructure;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Service
//@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ModelMapper modelMapper;   //go and create a Configrn class in Configuration packge wherein a method returns 
	
	
	@Override
	public ResponseEntity<ResponseStructure> addEmployee( EmployeeRequest employeeRequest) {
				 Employee employee = employeeRepository.save(modelMapper.map(employeeRequest, Employee.class));  //modelMapper.map(employeeRequest, Employee.class)maps the request to employee obj and returns the added Employee 
	
	return ApiResponseStructure.addResponse(modelMapper.map(employee, EmployeeResponse.class));   //modelMapper.map(employee, EmployeeResponse.class) maps the returned employee obj to EmployeeResponse and returns the EmployeeResponse 
	//the ResponseEntity<ResponseStructure shud be created in ApiResponseStructure class ,wherein a static method shud take Object as method parameter and return this ResponseEntity<ResponseStructure,,,,so invoke that static method by passing this employee response as the arguemnt
	}

	
	@Override
	public ResponseEntity<ResponseStructure> findByEmployeeId(int employeeId) {
		return		employeeRepository.findById(employeeId)
					.map(employee->
						{
						return	ApiResponseStructure.findResponse(modelMapper.map(employee, EmployeeResponse.class));     //this entire line returns ResponseEntity<ResponseStructure>
						})										//modelMapper.map(employee, EmployeeResponse.class) returns EmployeeResponse
					.orElseThrow(()-> new NoSuchElementException("Employee Not Found") );
		
	
	}


	@Override
	public ResponseEntity<ResponseStructure> updateByEmployeeId(int employeeId, Employee employee) {
		return	employeeRepository.findById(employeeId)
				.map(exiemployee->{
					
					
			      exiemployee= employeeRepository.save(modelMapper.map(employee, Employee.class));
																								//modelMapper.map(employee, Employee.class); // we are mapping the updatable employee to another Employee Object so it returns updated Employee which is reassigned to the same exiemployee variable
					return	ApiResponseStructure.updateResponse(modelMapper.map(exiemployee, EmployeeResponse.class));	 //this line returns ResponseEntity<ResponseStructure		
		
							}).orElseThrow(()-> new NoSuchElementException("employee not found"));

	}


	@Override
	public ResponseEntity<ResponseStructure> deleteByEmployeeId(int employeeId) {

			return	 employeeRepository.findById(employeeId)
				 .map(employee->{
					 	employeeRepository.delete(employee);

// modelMapper.map(employee, EmployeeResponse.class) //returns EmployeeResponse
					   
					   return	ApiResponseStructure.deleteResponse( modelMapper.map(employee, EmployeeResponse.class) ); //returns EmployeeResponse
				 }).orElseThrow(()->new NoSuchElementException("employee not found") );
			
	}

}
