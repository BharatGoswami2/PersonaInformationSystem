package com.bharat.nisum.personaInfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bharat.nisum.personaInfo.model.PersonaInfo;
import com.bharat.nisum.personaInfo.repositories.PersonaInfoRepository;

@Service
public class PersonaService {
	
	@Autowired
	private PersonaInfoRepository personaInfoRepository ;
	
	public PersonaInfo saveOrUpdate(PersonaInfo personaInfo) {
		
		return personaInfoRepository.save(personaInfo);
	}

}
