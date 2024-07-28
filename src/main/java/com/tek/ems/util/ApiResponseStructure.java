package com.tek.ems.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import lombok.RequiredArgsConstructor;


public class ApiResponseStructure {  //used to have methods which take Object as parameter and which returns the ResponseEntity<ResponseStructure  by setting attriutes of responseStructure 


	
	public static ResponseEntity<ResponseStructure> addResponse(Object obj)
	{
	
		
	ResponseStructure responseStructure=new ResponseStructure();
	responseStructure.setStatus(HttpStatus.CREATED.value());
	responseStructure.setMessage("Employee Created");
	responseStructure.setData(obj);
	
	return new ResponseEntity<ResponseStructure>(responseStructure,HttpStatus.CREATED);
	}
	
	public static ResponseEntity<ResponseStructure> findResponse(Object obj)
	{
		ResponseStructure responseStructure=new ResponseStructure();
		responseStructure.setStatus(HttpStatus.FOUND.value());
		responseStructure.setMessage("Employee Found");
		responseStructure.setData(obj);
		
		return new ResponseEntity<ResponseStructure>(responseStructure,HttpStatus.FOUND);
		
			}
	
	public static ResponseEntity<ResponseStructure> updateResponse(Object obj)
	{
		ResponseStructure responseStructure=new ResponseStructure();
		responseStructure.setStatus(HttpStatus.OK.value());
		responseStructure.setMessage("Employee Updated");
		responseStructure.setData(obj);
		
		return new ResponseEntity<ResponseStructure>(responseStructure,HttpStatus.OK);
		
	}
	
	public static ResponseEntity<ResponseStructure> deleteResponse(Object obj)
	{
		ResponseStructure responseStructure=new ResponseStructure();
		responseStructure.setStatus(HttpStatus.OK.value());
		responseStructure.setMessage("Employee Deleted");
		responseStructure.setData(obj);
		
		return new ResponseEntity<ResponseStructure>(responseStructure,HttpStatus.OK);
		
	}
}
