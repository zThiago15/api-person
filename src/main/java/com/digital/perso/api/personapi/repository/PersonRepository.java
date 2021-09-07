package com.digital.perso.api.personapi.repository;

import com.digital.perso.api.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
