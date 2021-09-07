package com.digital.perso.api.personapi.controller;

import com.digital.perso.api.personapi.entity.Person;
import com.digital.perso.api.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

public class PersonController {

    private PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping
    public String createPerson(Person person) {
        return "API test!";
    }
}
