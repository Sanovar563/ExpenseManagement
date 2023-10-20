package com.expenses.Exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String resourceName;
	String fieldName;
	long fieldValue;
	public ResourceNotFoundException(String resourceName,  long fieldValue) {
		super(String.format("%s not found with %s : %s" , resourceName,fieldValue));
		this.resourceName = resourceName;
//		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	
}

