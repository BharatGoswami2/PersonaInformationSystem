package com.bharat.nisum.personaInfo.validator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.bharat.nisum.personaInfo.annotations.HairColorList;


public class HairColorsValidator implements ConstraintValidator<HairColorList, CharSequence> {
	 private List<String> acceptedValues;
	 
	    @Override
	    public void initialize(HairColorList annotation) {
	        acceptedValues = Stream.of(annotation.enumClass().getEnumConstants())
	                .map(Enum::name)
	                .collect(Collectors.toList());
	    }
	 
	    @Override
	    public boolean isValid(CharSequence value, ConstraintValidatorContext context) {
	        if (value == null) {
	            return true;
	        }
	 
	        return acceptedValues.contains(value.toString().toLowerCase());
	    }
	
}