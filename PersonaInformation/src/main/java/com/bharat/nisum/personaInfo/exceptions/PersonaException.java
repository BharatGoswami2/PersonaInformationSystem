package com.bharat.nisum.personaInfo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class PersonaException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2774753846751995083L;

	public PersonaException(String message)
	{
		super(message);
	}
}
