package com.bharat.nisum.personaInfo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharat.nisum.personaInfo.model.PersonaInfo;

public interface PersonaInfoRepository extends JpaRepository<PersonaInfo, Integer>{
	
	public PersonaInfo findById(int id);
	public PersonaInfo findByPhoneNumber(String id);
	
	public List<PersonaInfo> findAll();

}
