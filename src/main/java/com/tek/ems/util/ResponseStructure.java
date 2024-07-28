package com.tek.ems.util;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class ResponseStructure {

	private int status;
	private String message;
	private Object data;   //no need of generic
	
//	public int getStatus() {
//		return status;
//	}
//	public String getMessage() {
//		return message;
//	}
//	public Object getData() {
//		return data;
//	}
	
	
//	public ResponseStructure setStatus(int status) {   //adding such return type helps in method chaining
//		
//		this.status = status;
//		return this;
//	}
//	public ResponseStructure setMessage(String message) {
//		this.message = message;
//		return this;
//	}
//	public ResponseStructure setData(Object data) {
//		this.data = data;
//		return this;
//	}
}
