package com.forge.service;

import com.forge.model.Person;

import java.util.List;

public interface IPersonService {
    Person save(Person person);
    List<Person> findAll();
    List<Person> findByNombre(String nombre);

}
