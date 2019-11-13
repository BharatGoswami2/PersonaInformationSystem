package com.bharat.nisum.personaInfo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bharat.nisum.personaInfo.model.PersonaInfo;
import com.bharat.nisum.personaInfo.service.PersonaService;

@RestController
@RequestMapping("/api/PersonaInfo")
public class PersonaController {
	
	@Autowired
	private PersonaService personaInfoService;
	
	@PostMapping("")
	public ResponseEntity<?> savePersonaInfo(@Valid @RequestBody PersonaInfo personaInfo, BindingResult result)
	{
		if(result.hasErrors())
		{
			return new ResponseEntity<String>("Invalid Persona Object",HttpStatus.BAD_REQUEST);
		}
		
		PersonaInfo persistObj=this.personaInfoService.saveOrUpdate(personaInfo);
		return new ResponseEntity<PersonaInfo>(persistObj,HttpStatus.CREATED);
	}

}
