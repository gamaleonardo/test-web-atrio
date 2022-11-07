package web.atrio.people.rest.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import web.atrio.people.rest.api.entity.Person;
import web.atrio.people.rest.api.exception.ForbiddenAgeException;
import web.atrio.people.rest.api.repository.PeopleRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PeopleController {
    private final PeopleRepository peopleRepository;

    @GetMapping("/people")
    public List<Person> getAllPeople() {
        return peopleRepository.findAllByOrderByFirstName();
    }

    @PostMapping("/person")
    public Person newPerson(@RequestBody Person person) {
        if (person.getAge() < 150) {
            return peopleRepository.save(person);
        }
        throw new ForbiddenAgeException(person.getFirstName(), person.getLastName());
    }

}
