package com.bharat.nisum.personaInfo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bharat.nisum.personaInfo.model.PersonaInfo;
import com.bharat.nisum.personaInfo.service.PersonaService;

@RestController
@RequestMapping("/api/PersonaInfo")
public class PersonaController {
	
	private PersonaService personaInfoService;
	
	@PostMapping("")
	public ResponseEntity<PersonaInfo> savePersonaInfo(@RequestBody PersonaInfo personaInfo)
	{
		return new ResponseEntity<PersonaInfo>(personaInfo,HttpStatus.CREATED);
	}

}
