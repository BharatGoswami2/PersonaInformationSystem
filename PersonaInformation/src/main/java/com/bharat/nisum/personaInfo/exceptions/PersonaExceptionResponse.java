package com.bharat.nisum.personaInfo.exceptions;

public class PersonaExceptionResponse {

	private String message;
	
	public PersonaExceptionResponse(String message){
		this.setMessage(message);
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
