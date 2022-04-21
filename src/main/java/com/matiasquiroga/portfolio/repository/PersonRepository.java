package com.matiasquiroga.portfolio.repository;

import com.matiasquiroga.portfolio.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
