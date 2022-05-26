package com.ty.personappboot.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.personappboot.dto.Person;
import com.ty.personappboot.service.PersonService;



@RestController
public class PersonController {
	@Autowired
	private PersonService personService;
    
	@PostMapping("/person")
	public Person savePerson(@RequestBody @Valid Person person) {
		return personService.savPerson(person); 
	}
	
	@GetMapping("/person")
	public Person getPersonById(@RequestParam int id) {
		return personService.getPersonById(id);
	}
}
