package main.java.fit.repositories;

import main.java.fit.classes.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
    Person findPersonById(Long id);
    Person findPersonByEmail(String email);
}
