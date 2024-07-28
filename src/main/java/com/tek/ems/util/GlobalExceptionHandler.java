package com.tek.ems.util;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<ResponseStructure> handleNoSuchElement(NoSuchElementException ex)
	{															//is predefined exception
		ResponseStructure responseStructure=new ResponseStructure();
		responseStructure.setStatus(HttpStatus.NOT_FOUND.value());
		responseStructure.setMessage("Employee Not Found");
		responseStructure.setData(ex.getMessage());
		
		return new ResponseEntity<ResponseStructure>(responseStructure,HttpStatus.NOT_FOUND);
		
	}
	
}
