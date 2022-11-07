package web.atrio.people.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.atrio.people.rest.api.entity.Person;

import java.util.List;

public interface PeopleRepository extends JpaRepository<Person, Long> {
    List<Person> findAllByOrderByFirstName();
}
