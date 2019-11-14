package com.bharat.nisum.personaInfo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bharat.nisum.personaInfo.model.PersonaInfo;
import com.bharat.nisum.personaInfo.service.PersonaService;
import com.bharat.nisum.personaInfo.service.ValidationService;

@RestController
@RequestMapping("/api/Persona")
public class PersonaController {
	
	@Autowired
	private PersonaService personaInfoService;
	@Autowired
	private ValidationService validationService;
	
	@PostMapping("")
	public ResponseEntity<?> savePersonaInfo(@Valid @RequestBody PersonaInfo personaInfo, BindingResult result)
	{
		ResponseEntity<?> errorMap= validationService.validate(result);
		if(errorMap!=null)return errorMap;
		
		PersonaInfo persistObj=this.personaInfoService.saveOrUpdate(personaInfo);
		return new ResponseEntity<PersonaInfo>(persistObj,HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable String id) 
	{
		PersonaInfo persistObj=this.personaInfoService.findById(id);
		return new ResponseEntity<PersonaInfo>(persistObj,HttpStatus.OK);
	}
	
	@GetMapping("/searchByPhoneNumber/{phoneNumber}")
	public ResponseEntity<?> findByPhoneNumber(@PathVariable String phoneNumber) 
	{
		PersonaInfo persistObj=this.personaInfoService.findByPhoneNumber(phoneNumber);
		return new ResponseEntity<PersonaInfo>(persistObj,HttpStatus.OK);
	}

	@GetMapping("/findAll/")
	public List<PersonaInfo> findAll() 
	{
		return this.personaInfoService.findAll();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletePersonaById(@PathVariable String id) 
	{
		this.personaInfoService.delteByPersonaId(id);
		return new ResponseEntity<String>("Persona ["+id+"] deleted Successfully.",HttpStatus.OK);
	}

}
