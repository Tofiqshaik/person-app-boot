package com.ty.personappboot.dao;

import java.lang.StackWalker.Option;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.personappboot.dto.Person;
import com.ty.personappboot.repository.PersonRepository;

@Repository
public class PersonDao {
	
	@Autowired
	private PersonRepository personRepository;
	
	public Person savePerson(Person person) {
		
		return personRepository.save(person);
	}
	
	public Person getPersonById(int id) {
		Optional<Person> opt=personRepository.findById(id);
		
		if(opt.isEmpty()) {
			return null;
		}
		return opt.get();
	}

}
