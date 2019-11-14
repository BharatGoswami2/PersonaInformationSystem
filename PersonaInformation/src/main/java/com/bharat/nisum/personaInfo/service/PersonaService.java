package com.bharat.nisum.personaInfo.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bharat.nisum.personaInfo.exceptions.PersonaException;
import com.bharat.nisum.personaInfo.exceptions.PersonaExceptionResponse;
import com.bharat.nisum.personaInfo.model.PersonaInfo;
import com.bharat.nisum.personaInfo.repositories.PersonaInfoRepository;

@Service
public class PersonaService {
	
	@Autowired
	private PersonaInfoRepository personaInfoRepository ;
	
	public PersonaInfo saveOrUpdate(PersonaInfo personaInfo) {
		
		return personaInfoRepository.save(personaInfo);
	}
	
	public PersonaInfo findById(String id) {
		try {
			
			PersonaInfo personaInfo =this.personaInfoRepository.findById(Integer.parseInt(id));
			
			if(personaInfo==null)
			{
				throw new PersonaException("Persona Id ["+id+"] does not Exsist");
			}
			
			return personaInfo;
			 
		}catch(Exception e)
		{
			 throw new PersonaException("Persona Id ["+id+"] does not Exsist");
		}
	}

	public PersonaInfo findByPhoneNumber(String phoneNumber) {
		try {
				PersonaInfo personaInfo=null;
				if(StringUtils.isNumeric(phoneNumber))
				{	
					personaInfo = this.personaInfoRepository.findByPhoneNumber(phoneNumber);
		
				}
				if(personaInfo==null)
				{
					throw new PersonaException("Can not delete with this Persona Phone Number ["+phoneNumber+"]. This Id does not exsist.");
				}
			return personaInfo;
		}catch(Exception e)
		{
			 throw new PersonaException("Persona Id ["+phoneNumber+"] is not valid.");
		}
	}
	
	public List<PersonaInfo> findAll(){
		return this.personaInfoRepository.findAll();
	}
	
	public void delteByPersonaId(String id) {
		try {
			
			PersonaInfo personaInfo =this.personaInfoRepository.findById(Integer.parseInt(id));
			
			if(personaInfo==null)
			{
				throw new PersonaException("Can not delete with this Persona Id ["+id+"]. This Id does not exsist.");
			}
			
			this.personaInfoRepository.delete(personaInfo);	
			
		}catch(Exception e)
		{
			 throw new PersonaException("Persona Id ["+id+"] is not valid.");
		}
	}
}
