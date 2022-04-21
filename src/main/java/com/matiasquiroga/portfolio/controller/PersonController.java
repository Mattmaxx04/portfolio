package com.matiasquiroga.portfolio.controller;

import com.matiasquiroga.portfolio.dto.PersonRequest;
import com.matiasquiroga.portfolio.dto.PersonUpdate;
import com.matiasquiroga.portfolio.exception.IdNotFoundException;
import com.matiasquiroga.portfolio.model.Person;
import com.matiasquiroga.portfolio.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PersonController {


    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private EducationRepository educationRepository;
    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private SkillRepository skillRepository;
    @Autowired
    private SoftRepository softRepository;
    @Autowired
    private ExperienceRepository experienceRepository;

    @PostMapping("/add")
    public Person placeOrder(@RequestBody PersonRequest request){
        return personRepository.save(request.getPerson());
    }
    @GetMapping("/all")
    public List<Person> findAllPerson(){
        return personRepository.findAll();
    }

    @PutMapping("/update")
    public Person updatePerson(@RequestBody PersonUpdate update){
        return personRepository.save(update.getPerson());
    }

    @DeleteMapping("/delete/{id}")
    public Map<String, Boolean> deletePerson(
            @PathVariable(value = "id") Long id) throws Exception {
        Person person = personRepository.findById(id)
                .orElseThrow(() -> new IdNotFoundException("Person not found on :: "+ id));
        personRepository.delete(person);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}


