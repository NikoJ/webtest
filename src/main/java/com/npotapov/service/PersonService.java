package com.npotapov.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.npotapov.repository.PersonRepository;

@Service
public class PersonService implements IPersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public String getPersonById(Integer id) {
        return personRepository.findPersonById(id);
    }
}
