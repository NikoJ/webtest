package com.npotapov.service;

import com.npotapov.model.Person;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PersonService implements IPersonService {

    private static final List<Person> TEST_PERSONS = Arrays.asList(new Person("Nick", 1), new Person("Jain", 2), new Person("Tom", 3));

    @Override
    public String findPersonById(Integer id) {

        for (Person person : TEST_PERSONS) {
            if (person.getId().equals(id)) {
                return person.toString();
            }
        }
        return "Not found person with id = " + id;
    }
}
