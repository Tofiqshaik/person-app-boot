package com.ty.personappboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.personappboot.dto.Person;

public interface PersonRepository extends  JpaRepository<Person, Integer>{

}
