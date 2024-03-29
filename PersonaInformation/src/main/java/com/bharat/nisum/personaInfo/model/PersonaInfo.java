package com.bharat.nisum.personaInfo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.bharat.nisum.personaInfo.annotations.HairColorList;
import com.bharat.nisum.personaInfo.enums.HairColors;


@Entity
public class PersonaInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@NotBlank(message="Persona Name is required.")
	@Pattern(regexp = "^[a-zA-Z]+$",message = "Name is not Valid,Only letters are allowed.")
	private String name;
	
	@NotBlank(message="Last Name is required.")
	@Pattern(regexp = "^[a-zA-Z]+$",message = "Last Name is not Valid,Only letters are allowed.")
	private String lastName;
	
	@NotBlank(message="Address is required.")
	@Pattern(regexp = "^[A-Za-z0-9 ]+$",message = "Address is not Valid,Only Apha numeric & space are allowed.")
	private String address;
	
	@NotBlank(message="Phone Nuumber is required.")
	@Pattern(regexp = "^[0-9]*$",message = "Phone Number is not Valid,Only numbers are allowed.")
	private String phoneNumber;
	
	@NotBlank(message="Hair Color is required.")
	@HairColorList(enumClass = HairColors.class)
	
	private String hairColor;
	
	private Date created_on;
	private Date updated_on;
	
	public PersonaInfo(){}
		
	@PrePersist
	protected void onCreate()
	{
		this.created_on=new Date();
	}
	
	@PreUpdate
	protected void onUpdate()
	{
		this.updated_on=new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public Date getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}

	public Date getUpdated_on() {
		return updated_on;
	}

	public void setUpdated_on(Date updated_on) {
		this.updated_on = updated_on;
	}
	
	

}
