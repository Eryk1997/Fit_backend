package main.java.fit.controllers;

import main.java.fit.classes.Person;
import main.java.fit.services.person.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/allPeople")
    public List<Person> selectAllPersons(){
        return personService.selectAllPersons();
    }
}
