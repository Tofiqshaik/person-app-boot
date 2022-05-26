package com.ty.personappboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Service;

import com.ty.personappboot.dao.PersonDao;
import com.ty.personappboot.dto.Person;

@Service
public class PersonService {
   
	@Autowired
	private PersonDao personDao;
	
	public Person savPerson(Person person) {
		return personDao.savePerson(person);
	}
	
	public Person getPersonById(int id) {
	 Person person=personDao.getPersonById(id);
	 
	 if(person!=null) {
		 return person;
	 }
	 return null;
	}

}
