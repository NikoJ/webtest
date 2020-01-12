package com.npotapov.repository;

import com.npotapov.model.Person;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class PersonRepository {
    private static final List<Person> TEST_PERSONS = Arrays.asList(new Person("Nick", 1), new Person("Jain", 2), new Person("Tom", 3));

    private List<Person> getTestPersons() {
        return TEST_PERSONS;
    }

    public String findPersonById(Integer id) {
        for (Person person : getTestPersons()) {
            if (person.getId().equals(id)) {
                return person.toString();
            }
        }
        return "Not found person with id = " + id;

    }
}
