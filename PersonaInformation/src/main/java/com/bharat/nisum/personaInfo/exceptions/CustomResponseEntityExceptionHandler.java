package com.bharat.nisum.personaInfo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	
	public final ResponseEntity<Object> handleException(PersonaException e,WebRequest request)
	{
		PersonaExceptionResponse personaExceptionResponse =new PersonaExceptionResponse(e.getMessage());
		return new ResponseEntity(personaExceptionResponse,HttpStatus.BAD_REQUEST);
	}

}
