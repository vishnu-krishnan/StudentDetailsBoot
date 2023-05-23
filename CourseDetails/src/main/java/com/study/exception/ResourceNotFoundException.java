package com.study.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{


	//ResourceNotFoundException("Student","id",id);

	private final String studentName;
	private final String fieldName;
	private final Object fieldValue;

	public ResourceNotFoundException (String studentName, String fieldName, Object fieldValue) {

		super(String.format("%s not found with %s : '%s'",fieldName, fieldValue));
		this.studentName = studentName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public Object getFieldValue() {
		return fieldValue;
	}
	
}
